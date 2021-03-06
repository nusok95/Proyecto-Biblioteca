/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Gustavo
 * @version 0.2
 */
public class Servicios {

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    private static final char[] PASSWORD = "enfldsgbnlsngdlksdsgm".toCharArray();
    private static final byte[] SALT = {
        (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12,
        (byte) 0xde, (byte) 0x33, (byte) 0x10, (byte) 0x12,
    };

    /**
     *Función que verifica si el usuario y contraseña están en la tabla usuarios
     * de MySQL
   * @param nombre
   * @param password
   * @return boolean b 
     */
    public boolean login(String nombre, String password) {//GEN-FIRST:event_btnBuscarActionPerformed
        boolean b = false;
        try {
            connection = Conexion.getConnection();
            PreparedStatement x = connection.prepareStatement("SELECT * from usuario where nombre_usuario = ? and contraseña = ? limit 1");
            x.setString(1, nombre);
            x.setString(2, password);
            ResultSet rs = x.executeQuery();
            if(rs.next()){
                b = true;
                System.out.println(encrypt(password));
            }
           
            connection.close();
            x.close();
            rs.close();

        } catch (SQLException esql) {
            System.out.println(esql);
            System.out.println("Error al ejecutar el SQL");
        } catch (Exception ex) {
            System.out.println("No hay conexión");
        }
        return b;
    }
    
  /**
   * Función que inserta los datos ingresados en la tabla indicada de MySQL
   * @param nombreTabla
   * @param camposString
   * @param datosString
   * @param camposInt
   * @param datosInt
   */
  public void insertar(String nombreTabla, ArrayList<String> camposString, 
     ArrayList<String> datosString,ArrayList<String> camposInt,
     ArrayList<Integer> datosInt){
    int interrogaciones1 = 0;
    int interrogaciones2 = 0;
    String consulta = "insert into"+" "+nombreTabla+" (";   
    for(String temp: camposString){
        String campo = temp;
        consulta=consulta+campo+",";
        interrogaciones1++;
      }

    for(String temp: camposInt){
        String campo = temp;
        consulta=consulta+campo+",";
        interrogaciones2++;
      }
    
    consulta=consulta.substring(0, consulta.length()-1);
    consulta=consulta+") VALUES (";
    for(String temp: camposString){
        String campo = temp;
        consulta=consulta+" ?,";
    }
    for(String temp: camposInt){
        String campo = temp;
        consulta=consulta+" ?,";
        
     }
      consulta=consulta.substring(0, consulta.length()-1);
      consulta = consulta+")";

    
    try {
            connection = Conexion.getConnection();
            PreparedStatement x = connection.prepareStatement(consulta);
            int posicion = 1;
            for (int i = 0; i < interrogaciones1; i++) {
              x.setString(posicion,datosString.get(i));
              posicion++;
            }
      
            for (int i = 0; i < interrogaciones2; i++) {
            x.setInt(posicion,datosInt.get(i));
            posicion++;
            }
            x.executeUpdate();
           JOptionPane.showMessageDialog(null, nombreTabla+" agregado");
            connection.close();
            x.close();

        } catch (SQLException esql) {
            System.out.println("Error al ejecutar el SQL");
        } catch (Exception ex) {
            System.out.println("No hay conexión");
    
     }
     }
  /**
   * Función que retorna toda la consulta de los datos recibidos
   * @param nombreTabla
   * @param campos
   * @param criterioBusqueda
   * @param datoBusqueda
   * @return Una consulta de la base de datos.
   */
  
  public PreparedStatement consulta(String nombreTabla,ArrayList<String> campos,
      String criterioBusqueda,String datoBusqueda){
      connection = Conexion.getConnection();
      String consulta = "Select";
      for(String temp: campos){
        String campo = temp;
        consulta=consulta+" "+campo+",";
      }
      consulta=consulta.substring(0, consulta.length()-1);
      consulta = consulta+" from "+nombreTabla;
      if(criterioBusqueda != null){
       consulta= consulta +" where "+criterioBusqueda+"=?";
          }
      try {
            connection = Conexion.getConnection();
            PreparedStatement x = connection.prepareStatement(consulta);
            x.setString(1,datoBusqueda);
            ResultSet rs = x.executeQuery();
            if(rs.next()){
               return x;
            }
            connection.close();
            x.close();
            rs.close();

        } catch (SQLException esql) {
            System.out.println("Error al ejecutar el SQL");
        } catch (Exception ex) {
            System.out.println("No hay conexión");
        }
 
       return null;
    }
  
  /**Actualizar genérico recibe el nombre de la tabla 4 ArrayList 
   * con los nombres de los campos,los datos y 2 strings 
   * con el criterio de búsqueda ID = s1401164
   * @param criterioBusqueda
   * @param camposString
   * @param datoBusqueda
   * @param datosInt*/
  public void actualizar(String nombreTabla, ArrayList<String> camposString, ArrayList<String> datosString,ArrayList<String> camposInt, ArrayList<Integer> datosInt,
      String criterioBusqueda,String datoBusqueda){
    int interrogaciones1 = 0;
    int interrogaciones2 = 0;
    String consulta = "UPDATE"+" "+nombreTabla+" set ";   
    for(String temp: camposString){
        String campo = temp;
        consulta=consulta+" "+campo+"=?,";
        interrogaciones1++;
      }
    for(String temp: camposInt){
        String campo = temp;
        consulta=consulta+" "+campo+"=?,";
        interrogaciones2++;
      }
      consulta=consulta.substring(0, consulta.length()-1);
      consulta = consulta+" where "+criterioBusqueda+"=?";
     
    
    
    try {
            connection = Conexion.getConnection();
            PreparedStatement x = connection.prepareStatement(consulta);
            int posicion = 1;
            for (int i = 0; i < interrogaciones1; i++) {
              x.setString(posicion,datosString.get(i));
              posicion++;
            }
            
      
            for (int i = 0; i < interrogaciones2; i++) {
            x.setInt(posicion,datosInt.get(i));
            posicion++;
            }
            x.setString(posicion, datoBusqueda);
            x.executeUpdate();
            JOptionPane.showMessageDialog(null, nombreTabla+" actualizado");
            connection.close();
            x.close();

        } catch (SQLException esql) {
            System.out.println("Error al ejecutar el SQL");
        } catch (Exception ex) {
            System.out.println("No hay conexión");
    
     }
     }
  
    
    
   
  /**
   * Función que busca si un dato está en la base de datos de MySQL 
   * @param tabla
   * @param campo
   * @param dato
   * @return true o false, dependiendo si encuentra la tupla
   */
  public boolean confirmarExistencia (String tabla, String campo, String dato ){
      boolean bandera = false;
       try {
            connection = Conexion.getConnection();
            PreparedStatement x = connection.prepareStatement("SELECT * "
                + "from "+tabla+" where "+campo+" = ?");
            x.setString(1,dato);
            ResultSet rs = x.executeQuery();
            if(rs.next()){
               bandera = true;
            }
            connection.close();
            x.close();
            rs.close();

        } catch (SQLException esql) {
            System.out.println("Error al ejecutar el SQL");
        } catch (Exception ex) {
            System.out.println("No hay conexión");
        }
 
       return bandera;
    }

     
  /**
   * Función que actualiza los datos de la tupla seleccionada de una tabla de MySQL
   * @param mat
   * @param nombre
   * @param apellidoPaterno
   * @param apellidoMaterno
   * @param correo
   * @param telefono
   * @param tipo
   * @param calle
   * @param cp
   * @param colonia
   * @param numero
   * @param estado
   */
  public void actualizar(String mat,String nombre, String apellidoPaterno,
      String apellidoMaterno, String correo, String telefono, 
      int tipo, String calle, String cp, String colonia, String numero,
      int estado){
       try {
            connection = Conexion.getConnection();
            PreparedStatement x = 
                connection.prepareStatement("UPDATE lector set nombre=?,"
                    + " apellido_paterno=?,apellido_materno=?,"
                    + "correo=?,telefono=?,tipo_usuario=?,calle=?,"
                    + "codigo_postal=?,colonia=?,"
                    + "numero=?,estado=?  where id=?");
            x.setString(1, nombre);x.setString(2, apellidoPaterno);
            x.setString(3,apellidoMaterno);x.setString(4, correo);
            x.setString(5,telefono);x.setInt(6,tipo);
            x.setString(7, calle);x.setString(8,cp);
            x.setString(9, colonia);x.setString(10,numero);
            x.setInt(11, estado);x.setString(12, mat);
            x.executeUpdate();
            JOptionPane.showMessageDialog(null, "LECTOR ACTUALIZADO");
            connection.close();
            x.close();

        } catch (SQLException esql) {
            System.out.println("Error al ejecutar el SQL");
        } catch (Exception ex) {
            System.out.println("No hay conexión");
    
     }
     }
       
     
    
    /** Funcion de Encriptación.
     */
    private static String encrypt(String property) 
        throws GeneralSecurityException, UnsupportedEncodingException {
        SecretKeyFactory keyFactory = 
            SecretKeyFactory.getInstance("PBEWithMD5AndDEs");
        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
        pbeCipher.init(Cipher.ENCRYPT_MODE, key, new PBEParameterSpec(SALT, 20));
        return base64Encode(pbeCipher.doFinal(property.getBytes("UTF-8")));
    }
    /**Funcion conversión a base64
     */
    private static String base64Encode(byte[] bytes) {
        // NB: This class is internal, and you probably should use another impl
        return new BASE64Encoder().encode(bytes);
    }
    /**Funcion de Desencriptar.
     */
    private static String decrypt(String property) 
        throws GeneralSecurityException, IOException {
        SecretKeyFactory keyFactory = 
            SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey key = keyFactory.generateSecret(new PBEKeySpec(PASSWORD));
        Cipher pbeCipher = Cipher.getInstance("PBEWithMD5AndDES");
        pbeCipher.init(Cipher.DECRYPT_MODE, key,
            new PBEParameterSpec(SALT, 20));
        return new String(pbeCipher.doFinal(base64Decode(property)), "UTF-8");
    }

    private static byte[] base64Decode(String property) throws IOException {
        // NB: This class is internal, and you probably should use another impl
        return new BASE64Decoder().decodeBuffer(property);
    }
}