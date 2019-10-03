/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Métodos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author USUARIO
 */
public class ManipulaDBC
{
    public static Connection conectaDB()
    { 
        Conexion x = new Conexion();
        try
        {
            return x.Conecta("localhost:3306", "gestorclinico", "root", "", 2);
        } catch (SQLException ex)
        {
            return null;
        }   
    }
    
    public static void desconectaDB(Connection con)
    {
        Conexion x= new Conexion();
        x.desconectar(con);
    }   

}
