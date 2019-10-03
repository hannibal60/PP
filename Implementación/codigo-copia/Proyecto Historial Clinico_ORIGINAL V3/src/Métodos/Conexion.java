package Métodos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oscar
 */
import java.sql.*;

public class Conexion
{

    Connection con;

    /**
     * Conecta con una base de datos de oracle o mysql
     *
     * @param host -Nombre del servidor o la dirección ip
     * @param instancia -Es el servicio de escucha de oracle (SID)
     * @param usuario -Usuario de la base de datos
     * @param pass -Password del usuario en la base de datos
     * @param manejador -para oracle (1) para mysql(2)
     */
    public Connection Conecta(String host, String instancia, String usuario, String pass, int manejador) throws SQLException
    {
        String driver = "";
        String error = "";
        String url = "";
        //oracle.jdbc.driver.OracleConnection@19134f4
        //com.mysql.jdbc.JDBC4Connection@94948a

        //ORACLE
        if (manejador == 1 || manejador == 2)
        {
            if (manejador == 1)
            {
                driver = "oracle.jdbc.driver.OracleDriver";
                error = "No se pudo cargar el driver Oracle";
                url = "jdbc:oracle:thin:@" + host + ":3306:" + instancia;
            } //MYSQL
            else if (manejador == 2)
            {
                driver = "com.mysql.cj.jdbc.Driver";
                url = "jdbc:mysql://" + host + "/" + instancia + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                error = "No se pudo cargar el driver Mysql";
            }
            try
            {
                Class.forName(driver).newInstance();
            } catch (Exception e)
            {
                // Ocurrió un error al registrar el driver 
                System.out.println(error);

            }
            try
            {
                // De esta forma se obtiene la conexi¢n 
                con = DriverManager.getConnection(url, usuario, pass);
                System.out.println("Conexi¢n establecida.");
            } catch (SQLException sqle)
            {
                // Ocurrió un error con la conexi¢n 
                System.out.println("Error con la conexi¢n a la base de datos:");

            }
        } else
        {
            System.out.println("ERROR DEBES MANDAR UN 1 PARA ORACLE O UN 2 PARA MYSQL");
        }
        return con;
    }

    /**
     * modifica un registro
     *
     * @param instancia -Es la base de datos a la que se quiere conectar
     * @param usuario -Usuario de la base de datos
     * @param pass -Password del usuario en la base de datos
     */
    public Connection Conecta(/*String host,*/String bd, String usuario, String pass)
    {
        String url = "jdbc:odbc:" + bd;//"+host+"/"+bd;       
        try
        {
            Driver d = (Driver) Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
        } catch (Exception e)
        {
            System.out.println("No se ha podido cargar el Driver JDBC-ODBC");
        }
        try
        {            // De esta forma se obtiene la conexi¢n 
            con = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexi¢n establecida.");
        } catch (SQLException sqle)
        {
            // Ocurrió un error con la conexi¢n 
            System.out.println("Error con la conexi¢n a la base de datos:");

        }
        return con;
    }

    /**
     * cierra la conexión de la base de datos
     *
     * @param conect recibe la conexión que se desea cerrar
     */
    public void desconectar(Connection conect)
    {
        conect = null;
    }
}
