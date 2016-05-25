/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class BibliotecarioCirculacion {
 private Servicios serv = new Servicios();
 
  /**
   *
   * @param lector
   */
  public void agregarLector(Lector lector){
 ArrayList<String> camposS = new ArrayList<String>();
 ArrayList<String> datosS = new ArrayList<String>();
 ArrayList<String> camposI = new ArrayList<String>();
 ArrayList<Integer> datosI = new ArrayList<Integer>();
 camposS.add("id");camposS.add("nombre");camposS.add("apellido_paterno");
 camposS.add("apellido_materno");camposS.add("correo");
 camposS.add("telefono");camposS.add("calle");camposS.add("codigo_postal");
 camposS.add("colonia");camposS.add("numero");
 datosS.add(lector.getId());datosS.add(lector.getNombre());
 datosS.add(lector.getApellidoPaterno());
 datosS.add(lector.getApellidoMaterno());
 datosS.add(lector.getCorreo());datosS.add(lector.getTelefono());
 datosS.add(lector.getCalle());datosS.add(lector.getCodigoPostal());
 datosS.add(lector.getColonia());datosS.add(lector.getNumero());
 camposI.add("tipo_usuario");
 camposI.add("estado");
 datosI.add(lector.getTipo());
 datosI.add(lector.getEstado());
 JOptionPane.showMessageDialog(null, camposS.get(0));
 serv.insertar("lector", camposS, datosS, camposI, datosI);

}

  /**
   * Método para actualizar un lector registrado.
   * @param lector
   */
public void actualizarLector(Lector lector){
 ArrayList<String> camposS = new ArrayList<String>();
 ArrayList<String> datosS = new ArrayList<String>();
 ArrayList<String> camposI = new ArrayList<String>();
 ArrayList<Integer> datosI = new ArrayList<Integer>();
 camposS.add("id");camposS.add("nombre");camposS.add("apellido_paterno");
 camposS.add("apellido_materno");camposS.add("correo");
 camposS.add("telefono");camposS.add("calle");camposS.add("codigo_postal");
 camposS.add("colonia");camposS.add("numero");
 datosS.add(lector.getId());datosS.add(lector.getNombre());
 datosS.add(lector.getApellidoPaterno());
 datosS.add(lector.getApellidoMaterno());
 datosS.add(lector.getCorreo());datosS.add(lector.getTelefono());
 datosS.add(lector.getCalle());datosS.add(lector.getCodigoPostal());
 datosS.add(lector.getColonia());datosS.add(lector.getNumero());
 camposI.add("tipo_usuario");
 camposI.add("estado");
 datosI.add(lector.getTipo());
 datosI.add(lector.getEstado());
 serv.actualizar("lector", camposS, datosS, camposI, datosI, "id",
     lector.getId());
}
    
  
}
