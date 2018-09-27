
package Proyecto;

import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class mysql {
    Connection con=null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/iqupbd","root","");
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexion"+e);
        }
        return con;
    }
   
}
