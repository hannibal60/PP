/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author PARRA
 */
public class CrudEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date x = Date.valueOf("2000-01-01");
        //insertar(1, "jose", "ramirez", "enriquez", x, 'h', "nel es harina", 'm');
        consulta();
        elimina(1);
        //modifica(1, "maria", "enriquez", "gonzalez", x, 'm', "si es coca", 'h');
        consulta();
    }
    
    
    public static void insertar(int idpersona,String nombre,String apePaterno,String apeMater,Date f_nacimiento,char sexo, String curp , char tipo_persona){
        try{
        Connection conn = Conexiones.conectar();
        PreparedStatement ps;
        ResultSet rs;
            ps=conn.prepareStatement("INSERT INTO personas (id_persona,nombre ,apellido_paterno,apellido_materno,f_nacimiento,sexo,curp,tipo_persona) VALUES (?,?,?,?,?,?,?,?)");
            //por seguridad se coloca de esta manera, se evita mandar consulta plana 
            ps.setInt(1, idpersona);
            ps.setString(2, nombre);  // se colocal los valores en el orden definidos en la linea 33
            ps.setString(3, apePaterno);       // puede ser SETINT,SETSTRING O SETDATE dependiendo el dato a enviar
            ps.setString(4, apeMater);
            ps.setDate(5, f_nacimiento); 
            ps.setString(6, String.valueOf(sexo));
            ps.setObject(6, sexo,java.sql.Types.CHAR);
            ps.setString(7, curp);
            ps.setObject(8, tipo_persona,java.sql.Types.CHAR);
            
            int res=ps.executeUpdate();   // ejecuta la insercion
            
            if (res>0) { // dependiendo el valor que retorne la ejecucion , se determina si fue exitoso o no
                JOptionPane.showMessageDialog(null, "Se registro exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            
            conn.close();
        }catch(SQLException e){
            System.out.println(e.toString());
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    public static void consulta(){
        try{
            String s="";
            Connection con = Conexiones.conectar();
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("SELECT * FROM personas WHERE id_persona = ?"); //traer un dato
            ps.setInt(1, 1);
            
            rs= ps.executeQuery();
            if (rs.next()) {
                s+=rs.getString("id_persona")+"\n";
                s+=rs.getString("nombre")+"\n";
                s+=rs.getString("apellido_paterno")+"\n";
                s+=rs.getString("apellido_materno")+"\n";
                s+=rs.getString("f_nacimiento")+"\n";
                s+=rs.getString("sexo")+"\n";
                s+=rs.getString("curp")+"\n";
                s+=rs.getString("tipo_persona")+"\n";
                System.out.println(s);
                
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el registro");
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public static void modifica(int idpersona,String nombre,String apePaterno,String apeMater,Date f_nacimiento,char sexo, String curp , char tipo_persona){
        try{
        Connection conn = Conexiones.conectar();
        PreparedStatement ps;
            ps=conn.prepareStatement("UPDATE personas SET nombre=?,apellido_paterno=?,apellido_materno=?,f_nacimiento=?,sexo=?,curp=?,tipo_persona=? where id_persona=?");
            //por seguridad se coloca de esta manera, se evita mandar consulta plana 
            
            ps.setString(1, nombre);  // se colocal los valores en el orden definidos en la linea 33
            ps.setString(2, apePaterno);       // puede ser SETINT,SETSTRING O SETDATE dependiendo el dato a enviar
            ps.setString(3, apeMater);
            ps.setDate(4, f_nacimiento); 
            ps.setString(5, String.valueOf(sexo));
            ps.setString(6, curp);
            ps.setObject(7, tipo_persona,java.sql.Types.CHAR);
            ps.setInt(8, idpersona);
            
            int res=ps.executeUpdate();   // ejecuta la insercion
            
            if (res>0) { // dependiendo el valor que retorne la ejecucion , se determina si fue exitoso o no
                JOptionPane.showMessageDialog(null, "Se Modificoexitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            
            conn.close();
        }catch(SQLException e){
            System.out.println(e.toString());
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    public static void elimina(int id){
    try{
            PreparedStatement ps;
            Connection con = Conexiones.conectar();
            ps = con.prepareStatement("DELETE FROM personas WHERE id_persona=?"); //Eliminar
            ps.setInt(1,id);
            int res=ps.executeUpdate();
            
            if (res>0) {
                JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
