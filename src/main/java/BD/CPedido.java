/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import com.Vista.secciones.Menu;
import com.Vista.secciones.Pedido;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sofia Useche
 */
public class CPedido {
    private JPanel panelSeleccionado;
    private Pedido PedidoInstance;

    public CPedido(Pedido PedidoInstance) {
        this.PedidoInstance = PedidoInstance;
    }

    public JPanel getPanelSeleccionado() {
        return panelSeleccionado;
    }
    
    public void mostrarMenu(Map<Integer, JPanel> panelesPorCategoria) {
        Database objetoConexion = new Database();
        String sql = "SELECT codigo, nombre, imagen, Categoria_id FROM menú";

        try {
            Statement st = objetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            for (JPanel panel : panelesPorCategoria.values()) {
                panel.removeAll();
                panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
            }

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                int categoriaId = rs.getInt("Categoria_id");
                byte[] imgBytes = rs.getBytes("imagen");

                ImageIcon icon = null;
                if (imgBytes != null) {
                    Image img = Toolkit.getDefaultToolkit().createImage(imgBytes);
                    Image resizedImg = img.getScaledInstance(143, 120, Image.SCALE_SMOOTH);
                    icon = new ImageIcon(resizedImg);
                }

                JPanel itemPanel = new JPanel();
                itemPanel.setPreferredSize(new Dimension(173, 200));
                itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));
                itemPanel.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230), 1));
                itemPanel.setBackground(Color.WHITE);

                JLabel lblImagen = new JLabel(icon);
                lblImagen.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel lblNombre = new JLabel(nombre);
                lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 14));
                lblNombre.setForeground(Color.BLACK);
                lblNombre.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel lblCodigo = new JLabel(codigo);
                lblCodigo.setVisible(false);

                itemPanel.add(Box.createVerticalStrut(10));
                itemPanel.add(lblImagen);
                itemPanel.add(Box.createVerticalStrut(20));
                itemPanel.add(lblNombre);
                itemPanel.add(lblCodigo);
                itemPanel.add(Box.createVerticalGlue());

                itemPanel.putClientProperty("codigo", codigo);
                itemPanel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        seleccionarPanel(itemPanel);
                    }
                });

                JPanel panelCategoria = panelesPorCategoria.get(categoriaId);
                if (panelCategoria != null) {
                    panelCategoria.add(itemPanel);
                }
            }

            for (JPanel panel : panelesPorCategoria.values()) {
                panel.revalidate();
                panel.repaint();
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar menú: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
    
    public void seleccionarPanel(JPanel panel) {
        if (panelSeleccionado != null) {
            panelSeleccionado.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230), 1));
        }
        panelSeleccionado = panel;
        panelSeleccionado.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 3));
        String codigoSeleccionado = obtenerCodigoDelItem();
        if (codigoSeleccionado != null) {
            obtenerDatosCompletos(codigoSeleccionado); 
        }
    }
    public String obtenerCodigoDelItem() {
        if (panelSeleccionado == null) {
            return null;
        }
        return (String) panelSeleccionado.getClientProperty("codigo"); 
    }
    public void obtenerDatosCompletos(String codigo) {
        BD.Database objetoConexion = new BD.Database();
        String sql = "SELECT nombre, precio FROM menú WHERE codigo = ?";

        try {
            PreparedStatement ps = objetoConexion.establecerConexion().prepareStatement(sql);
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                        PedidoInstance.mostrarDatoFormulario(codigo, nombre, precio);
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void enviarPedido(int codigo, int cantidad, String detalle, String hora) {
        Database objetoConexion = new Database();
        String sql = "INSERT INTO pedido (codigo, cantidad, detalle, hora) VALUES (?, ?, ?, ?)";

        try (Connection conexion = objetoConexion.establecerConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            ps.setInt(2, cantidad);
            ps.setString(3, detalle);
            ps.setString(4, hora);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pedido enviado correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al enviar pedido: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
}
