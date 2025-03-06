/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofia Useche
 */
public class Database {
    
    Connection conectar = null;
    
    String usuario ="root";
    String contraseña ="";
    String bd ="proyecto";
    String ip ="localhost";
    String puerto ="3306";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            createPedidoTable();
        } catch (Exception e) {
        }
        return conectar;
    }
    
    public void cerrarConexion(){
        try {
            if (conectar!= null && !conectar.isClosed()) {
            conectar.close();
        }
        } catch (Exception e) {
        }
    }
    
    public void createPedidoTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS pedido ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "nombre VARCHAR(255) NOT NULL, "
                + "cantidad INT NOT NULL, "
                + "unidad VARCHAR(255) NOT NULL, "
                + "total DECIMAL(10, 2) NOT NULL"
                + ")";
        
        try (Statement stmt = conectar.createStatement()) {
            stmt.execute(createTableSQL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear la tabla 'pedido': " + e.getMessage());
        }
    }
}
