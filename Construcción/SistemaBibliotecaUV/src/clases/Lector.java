/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Carlos
 *"nombre=?, apellido_paterno=?,apellido_materno=?,correo=?,telefono=?,tipo_usuario=?,calle=?,codigo_postal=?,colonia=?,numero=?,estado=?  where id=?");*/

public class Lector {
 private String id,nombre,apellido_p,apellido_m,correo,telefono,calle,cp,colonia,numero;
 private int tipo, estado;
 
 public Lector(String id, String nombre, String apellido_p,  String apellido_m,  String
     correo,  String telefono,  String calle,  String cp,  String colonia,  String numero, int tipo, int estado){
   this.id = id; this.nombre = nombre; this.apellido_p = apellido_p;
   this.apellido_m = apellido_m; this.correo = correo;this.telefono=telefono;this.calle=calle;
   this.cp = cp;this.colonia = colonia; this.numero = numero; this.tipo=tipo; this.estado=estado;
 }

 


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

  public String getApellido_p() {
    return apellido_p;
  }

  public void setApellido_p(String apellido_p) {
    this.apellido_p = apellido_p;
  }

  public String getApellido_m() {
    return apellido_m;
  }

  public void setApellido_m(String apellido_m) {
    this.apellido_m = apellido_m;
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

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
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
