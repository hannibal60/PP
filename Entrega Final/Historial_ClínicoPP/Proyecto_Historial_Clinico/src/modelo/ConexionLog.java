
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionLog {
    
    private static final String base = "gestorclinico";
    private static final String user = "root";
    private static final String pas = "";
    private static final String url = "jdbc:mysql://localhost:3306/" + base;
    private static Connection con;
    
    public static Connection getConexion()
    {
        con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con =DriverManager.getConnection(url,user,pas);
            
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion: "+e);
        }
        return con;
    }
    
    public boolean existecorreo(String usuario, Connection cn) {
        String sql = "";
        String buscar = usuario;
        sql = "SELECT *FROM usuarios WHERE correo='" + buscar + "'";
        try {
            java.sql.Statement at = cn.createStatement();
            ResultSet rs = at.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Existe C");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error consubd");
        }
        return false;
    }
    public boolean compruevapass(String pass, Connection cn) {
        String sql = "";
        String buscar = pass;
        sql = "SELECT *FROM usuarios WHERE password='" + buscar + "'";
        try {
            java.sql.Statement at = cn.createStatement();
            ResultSet rs = at.executeQuery(sql);
            while (rs.next()) {
                System.out.println("PCorrecto");
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error consubd");
        }
        return false;
    }
    
    public String[] infor(String correo, Connection cn){
        String sql = "";
        String buscar = correo;
        sql = "SELECT *FROM usuarios WHERE correo='" + buscar + "'";
        String Datos[] = new String[5];
        try {
            java.sql.Statement at = cn.createStatement();
            ResultSet rs = at.executeQuery(sql);
            while (rs.next()) {
                Datos[0] = rs.getString(1);//
                Datos[1] = rs.getString(2);//
                Datos[2] = rs.getString(3);//
                Datos[3] = rs.getString(4);//
            }
            System.out.println("consulta correcta");
        } catch (SQLException ex) {
            System.out.println("error consubd");
        }
        return Datos;
    }
}