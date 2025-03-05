
package Vista;

import BD.CUsuario;
import javax.swing.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.geom.Point2D;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Login extends javax.swing.JFrame {

    
    public Login() {
      initComponents();
      setVisible(true);
      setLocationRelativeTo(null);
    
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelDegradado = new javax.swing.JPanel();
        ingreso = new javax.swing.JPanel();
        Entrar = new javax.swing.JButton();
        Mostrar = new javax.swing.JCheckBox();
        InicioSesion = new javax.swing.JLabel();
        OlvidoContraseña = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txUsuario = new RSMaterialComponent.RSTextFieldMaterialIcon();
        TxtPassword = new RSMaterialComponent.RSPasswordMaterialIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        JPanelDegradado.setBackground(java.awt.SystemColor.controlShadow);
        JPanelDegradado.setForeground(new java.awt.Color(242, 242, 242));
        JPanelDegradado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanelDegradadoMouseClicked(evt);
            }
        });

        ingreso.setBackground(new java.awt.Color(255, 255, 255));
        ingreso.setForeground(new java.awt.Color(255, 255, 255));
        ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoMouseClicked(evt);
            }
        });

        Entrar.setBackground(new java.awt.Color(58, 179, 28));
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.setToolTipText("");
        Entrar.setBorder(null);
        Entrar.setBorderPainted(false);
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        InicioSesion.setBackground(new java.awt.Color(153, 153, 153));
        InicioSesion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        InicioSesion.setForeground(new java.awt.Color(102, 102, 102));
        InicioSesion.setText("Inicio de sesión");
        InicioSesion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        OlvidoContraseña.setForeground(new java.awt.Color(58, 179, 28));
        OlvidoContraseña.setText("Olvido su contraseña");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asadero.png"))); // NOI18N

        txUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txUsuario.setColorIcon(new java.awt.Color(153, 153, 153));
        txUsuario.setColorMaterial(new java.awt.Color(102, 102, 102));
        txUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txUsuario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON_OUTLINE);
        txUsuario.setPhColor(new java.awt.Color(51, 51, 51));
        txUsuario.setPlaceholder("Ingrese su usuario");
        txUsuario.setSelectionColor(new java.awt.Color(51, 51, 51));

        TxtPassword.setForeground(new java.awt.Color(51, 51, 51));
        TxtPassword.setColorIcon(new java.awt.Color(102, 102, 102));
        TxtPassword.setColorMaterial(new java.awt.Color(102, 102, 102));
        TxtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TxtPassword.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK_OUTLINE);
        TxtPassword.setPhColor(new java.awt.Color(51, 51, 51));
        TxtPassword.setPlaceholder("Ingrese su contraseña");

        javax.swing.GroupLayout ingresoLayout = new javax.swing.GroupLayout(ingreso);
        ingreso.setLayout(ingresoLayout);
        ingresoLayout.setHorizontalGroup(
            ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresoLayout.createSequentialGroup()
                .addGroup(ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresoLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresoLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresoLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2))
                    .addGroup(ingresoLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(Mostrar))
                    .addGroup(ingresoLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(OlvidoContraseña))
                    .addGroup(ingresoLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ingresoLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(TxtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ingresoLayout.setVerticalGroup(
            ingresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(InicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(txUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mostrar)
                .addGap(28, 28, 28)
                .addComponent(OlvidoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout JPanelDegradadoLayout = new javax.swing.GroupLayout(JPanelDegradado);
        JPanelDegradado.setLayout(JPanelDegradadoLayout);
        JPanelDegradadoLayout.setHorizontalGroup(
            JPanelDegradadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDegradadoLayout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
        );
        JPanelDegradadoLayout.setVerticalGroup(
            JPanelDegradadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDegradadoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelDegradado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelDegradado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        String usuario = txUsuario.getText();
        String contraseña = String.valueOf(TxtPassword.getPassword());

    if (usuario.isEmpty() || contraseña.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese usuario y contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    CUsuario objetoUsuario = new CUsuario();

    if (objetoUsuario.iniciarSesion(usuario, contraseña)) {
        this.dispose(); // Cierra la ventana de login
        new secciones().setVisible(true); // Abre la ventana principal
    }
    
    }//GEN-LAST:event_EntrarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        if (Mostrar.isSelected()) {
            TxtPassword.setEchoChar((char) 0);  // Muestra la contraseña
        } else {
            TxtPassword.setEchoChar('*');  // Oculta la contraseña
        }
    }//GEN-LAST:event_MostrarActionPerformed

    private void ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoMouseClicked
        ingreso.setOpaque(false);
    }//GEN-LAST:event_ingresoMouseClicked

    private void JPanelDegradadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanelDegradadoMouseClicked

    }//GEN-LAST:event_JPanelDegradadoMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        setLayout(new BorderLayout());
    }//GEN-LAST:event_formMouseClicked

    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme()); // Usa FlatLaf correctamente
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Luego, abre la ventana normalmente
        new Login().setVisible(true);
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatMaterialLighterIJTheme.setup();

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JPanel JPanelDegradado;
    private javax.swing.JCheckBox Mostrar;
    private javax.swing.JLabel OlvidoContraseña;
    private RSMaterialComponent.RSPasswordMaterialIcon TxtPassword;
    private javax.swing.JPanel ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private RSMaterialComponent.RSTextFieldMaterialIcon txUsuario;
    // End of variables declaration//GEN-END:variables
}
