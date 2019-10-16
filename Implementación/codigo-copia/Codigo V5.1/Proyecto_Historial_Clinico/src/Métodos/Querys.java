package Métodos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADOO
 *
 *
 *
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Querys
{

    /**
     * Inserta un registro en una tabla de mysql
     *
     * @param con se requiere un objeto Connection
     * @param tabla es el nombre de la tabla
     * @param columnas son las columnas que se van a modificar
     * @param values un string con los valores a insertar separados por comas
     */
    public String consulta(Connection con, String tabla, String columna, String value)
    {
        try
        {
            Statement st = con.createStatement();
            String myquery = "select * from" + tabla + "(" + columna + ")" + "values(" + value + ");";
            System.out.println(myquery);
            st.executeQuery(myquery);
        } catch (Exception e)
        {
        }
        return null;
    }

    public String Insertar(Connection con, String tabla, String columnas, String values)
    {
        try
        {
            Statement stmt = con.createStatement();
            String myquery = "insert into " + tabla + " (" + columnas + ")" + " values(" + values + ");";
            System.out.println(myquery);
            stmt.executeUpdate(myquery);
            return null;
        } catch (Exception e)
        {
            return "Error al intentar ejecutar la alta..." + e.getMessage();
        }
    }

    /**
     * Inserta un registro en una tabla de oracle o access
     *
     * @param con se requiere un objeto Connection
     * @param tabla es el nombre de la tabla
     * @param values un string con los valores a insertar separados por comas
     */
    public String Insertar(Connection con, String tabla, String values)
    {
        try
        {
            Statement stmt = con.createStatement();
            String myquery = "insert into " + tabla + " values(" + values + ");";
            System.out.println(myquery);
            stmt.executeUpdate(myquery);
            return null;
        } catch (Exception e)
        {
            return "no se pudo realizar la alta..." + e.getMessage();

        }
    }

    /**
     * Elimina un registro
     *
     * @param con se requiere un obejto Connection
     * @param tabla es el nombre de la tabla
     * @param es el campo mediante el que se va a eliminar
     * @param condicion mediante la que se va a efectuar el Delete
     */
    public String Delete(Connection con, String tabla, String campo, String condicion)
    {
        try
        {
            Statement stmt = con.createStatement();
            String myquery = "delete from " + tabla + " where " + campo + "=" + condicion;
            System.out.println(myquery);
            stmt.executeUpdate(myquery);
            return null;
        } catch (Exception e)
        {
            return "No se pudo eliminar el registro..." + e.getMessage();
        }

    }

    /**
     * Elimina todos los registros de una tabla
     *
     * @param con se requiere un obejto Connection
     * @param tabla es el nombre de la tabla
     */
    public String Delete(Connection con, String tabla)
    {
        try
        {
            Statement stmt = con.createStatement();
            String myquery = "delete from " + tabla;
            System.out.println(myquery);
            stmt.executeUpdate(myquery);
            return null;
        } catch (Exception e)
        {
            return "No se pudo eliminar el registro..." + e.getMessage();
        }
    }

    /**
     * modifica un registro
     *
     * @param con -se requiere un obejto Connection
     * @param tabla -es el nombre de la tabla
     * @param columnas -es la columnas a modificar
     * @param boolean -es el valor de la columna a modificar
     */
    public String Modificar(Connection con, String tabla, String columnas, String nvalores, String condicion)
    {
        ArrayList col, nval = new ArrayList();
        col = SepararCadena(columnas);
        nval = SepararCadena(nvalores);
        String vamodificar = "";
        if (col.size() == nval.size())
        {
            for (int i = 0; i < col.size() - 1; i++)
            {
                vamodificar += String.valueOf(col.get(i)) + " = " + String.valueOf(nval.get(i)) + " , ";
            }
            vamodificar += String.valueOf(col.get(col.size() - 1)) + " = " + String.valueOf(nval.get(col.size() - 1));
            try
            {
                Statement stmt = con.createStatement();
                String myquery = " update " + tabla + " set " + vamodificar + " where " + condicion;
                System.out.println(myquery); //impresion de prueba
                stmt.executeUpdate(myquery);
            } catch (Exception e)
            {
                return "No se pudo concretar el proceso, verifique porfavor..." + e.getMessage();
            }
            return null;
        } else
        {
            return "EL NUMERO DE VALORES Y DE COLUMNAS A MODIFICAR NO COINCIDEN";
        }
    }

    public ArrayList<Object> Seleccion(Connection con, String campos, String tabla, String condicion, boolean tipo)
    {

        ArrayList<Object> reg = new ArrayList();
        String cond = "";
        if (!condicion.equals(""))
        {
            cond = " where " + condicion;
        }
        try
        {
            Statement stmt = con.createStatement();
            String myquery = " select " + campos + " from " + tabla + cond;
            System.out.println(myquery); //impresion de pureba
            ResultSet rs = stmt.executeQuery(myquery);
//            System.out.println("rs=" + rs.getNString("idLigas"));
            while (rs.next())
            {
                for (int i = 1; i < (rs.getMetaData().getColumnCount()) + 1; i++)
                {
                    reg.add(rs.getObject(i));
                }
            }
            //System.out.println("reg= " + reg.toString());
            if (tipo)
            {
                String cadena = reg.toString();
                cadena = cadena.substring(1);
                cadena = cadena.replace("]", " ");
                cadena = cadena.replace(" ", "");
                reg = SepararCadena(cadena);
                return reg;
            } else
            {
                String cadena = reg.toString();
                cadena = cadena.substring(1);
                cadena = cadena.replace("]", "|");
                cadena = cadena.replace("|", "");
                reg = SepararCadena(cadena);
                return reg;
            }

        } catch (Exception e)
        {
            System.out.println("Exception, no hay datos");
        }
        return reg;
    }

    public ArrayList SepararCadena(String cadena)
    {
        ArrayList datos = new ArrayList();
        String palabra = "";
        StringTokenizer tokenizer = new StringTokenizer(cadena, ",");
        while (tokenizer.hasMoreTokens())
        {
            palabra = tokenizer.nextToken();
            datos.add(palabra);
        }
        System.out.println(datos.toString());
        return datos;

    }
}
