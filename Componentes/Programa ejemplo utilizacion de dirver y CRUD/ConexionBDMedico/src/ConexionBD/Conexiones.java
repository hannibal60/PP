package ConexionBD;


import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PARRA
 */
public class Conexiones {
    
    public static String driver= "com.mysql.cj.jdbc.Driver";   //Direccion del driver
    public static String url="jdbc:mysql://localhost:3306/gestorclinico";   //Direccion de la base de datos , puede variar el puerto y nombre
    public static String user="root";
    public static String password="";
    
    
    public static Connection conectar(){
    
        try {
            
            // broken Java implementations

            Class.forName(driver).newInstance();  //Definicion del driver 

        } catch (Exception ex) {
            System.out.println("ERROR"+ex.toString());
        }

        Connection conn = null;    //Variable que guarda la conexion con BD
        try {

            conn = DriverManager.getConnection(url, user, password); //Guarda la conexion

            if (conn != null) {
                System.out.println("Conexion exitosa");
            }
            
        } catch (SQLException ex) {
            
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return conn;
    }
    
    public void desconectar(Connection con) throws SQLException{
        con.close();
    }
}
