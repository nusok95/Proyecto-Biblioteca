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
 *"nombre=?, apellido_paterno=?,apellido_materno=?,correo=?,telefono=?
 * ,tipo_usuario=?,calle=?,codigo_postal=?,colonia=?,
 * numero=?,estado=?  where id=?");*/

public class Lector {
 private String id,nombre,apellidoPaterno,apellidoMaterno,correo,telefono,calle,
     codigoPostal,colonia,numero;
 private int tipo, estado;
 Servicios serv = new Servicios();
 
 public Lector(String id, String nombre, String apellidoPaterno, 
     String apellidoMaterno,  String correo,  String telefono, String calle,  
     String codigoPostal,  String colonia,  String numero, int tipo,int estado){
   this.id = id; this.nombre = nombre; this.apellidoPaterno = apellidoPaterno;
   this.apellidoMaterno = apellidoMaterno; this.correo = correo;
   this.telefono=telefono;this.calle=calle;
   this.codigoPostal = codigoPostal;this.colonia = colonia; 
   this.numero = numero; this.tipo=tipo; this.estado=estado;
 }

  /**
   *
   */
  public void agregarLector(){
 ArrayList<String> camposS = new ArrayList<String>();
 ArrayList<String> datosS = new ArrayList<String>();
 ArrayList<String> camposI = new ArrayList<String>();
 ArrayList<Integer> datosI = new ArrayList<Integer>();
 camposS.add("id");camposS.add("nombre");camposS.add("apellido_paterno");
 camposS.add("apellido_materno");camposS.add("correo");
 camposS.add("telefono");camposS.add("calle");camposS.add("codigo_postal");
 camposS.add("colonia");camposS.add("numero");
 datosS.add(getId());datosS.add(getNombre());datosS.add(getApellidoPaterno());
 datosS.add(getApellidoMaterno());
 datosS.add(getCorreo());datosS.add(getTelefono());datosS.add(getCalle());
 datosS.add(getCodigoPostal());
 datosS.add(getColonia());datosS.add(getNumero());
 camposI.add("tipo_usuario");
 camposI.add("estado");
 datosI.add(getTipo());
 datosI.add(getEstado());
 JOptionPane.showMessageDialog(null, camposS.get(0));
 JOptionPane.showMessageDialog(null, nombre);
 serv.insertar("lector", camposS, datosS, camposI, datosI);

}

  /**
   *
   */
  public void actualizarLector(){
 ArrayList<String> camposS = new ArrayList<String>();
 ArrayList<String> datosS = new ArrayList<String>();
 ArrayList<String> camposI = new ArrayList<String>();
 ArrayList<Integer> datosI = new ArrayList<Integer>();
 camposS.add("id");camposS.add("nombre");camposS.add("apellido_paterno");
 camposS.add("apellido_materno");camposS.add("correo");
 camposS.add("telefono");camposS.add("calle");camposS.add("codigo_postal");
 camposS.add("colonia");camposS.add("numero");
 datosS.add(this.getId());datosS.add(getNombre());
 datosS.add(getApellidoPaterno());datosS.add(getApellidoMaterno());
 datosS.add(getCorreo());datosS.add(getTelefono());datosS.add(getCalle());
 datosS.add(getCodigoPostal());
 datosS.add(getColonia());datosS.add(getNumero());
 camposI.add("tipo_usuario");
 camposI.add("estado");
 datosI.add(getTipo());
 datosI.add(getEstado());
 serv.actualizar("lector", camposS, datosS, camposI, datosI, "id", getId());
}


 
  /**
   * Getter and Setter
   * @return
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
 

 
}
