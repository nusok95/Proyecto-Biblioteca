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
public class Material {
  private String folio, titulo, edicion, editorial, autor, fechaPublicacion;
  private int tipoMaterial, estado;
  Servicios serv= new Servicios();

  public Material(String folio, String titulo, String edicion, String editorial,
      String autor, int tipoMaterial, int estado){
    this.folio = folio;
    this.titulo = titulo;
    this.edicion = edicion;
    this.editorial = editorial;
    this.estado = estado;
    this.autor = autor;
    //this.fechaPublicacion = fechaPublicacion;
    this.tipoMaterial = tipoMaterial;
  }
  
  /**
   *Método para agregar un material.
   */
 public void agregarMaterial(){
      ArrayList<String> camposS = new ArrayList<String>();
      ArrayList<String> datosS = new ArrayList<String>();
      ArrayList<String> camposI = new ArrayList<String>();
      ArrayList<Integer> datosI = new ArrayList<Integer>();
     camposS.add("folio");camposS.add("titulo");
     /*camposS.add("fechaPublicacion");*/
     camposS.add("edicion");camposS.add("editorial");camposS.add("autor");
     datosS.add(getFolio());datosS.add(getTitulo());
     /*datosS.add(getFecha_publicacion());*/datosS.add(getEdicion());
     datosS.add(getEditorial());datosS.add(getAutor());
     camposI.add("tipo");camposI.add("estado");
     datosI.add(getTipo()); datosI.add(getEstado());
     serv.insertar("material", camposS, datosS, camposI, datosI);
}

  /**
   *Método para actualizar un material que ha sido previamente registrado.
   */
public void actualizarMaterial(){
      ArrayList<String> camposS = new ArrayList<String>();
      ArrayList<String> datosS = new ArrayList<String>();
      ArrayList<String> camposI = new ArrayList<String>();
      ArrayList<Integer> datosI = new ArrayList<Integer>();
     camposS.add("folio");camposS.add("titulo");
     /*camposS.add("fechaPublicacion");*/
     camposS.add("edicion");camposS.add("editorial");camposS.add("autor");
     datosS.add(getFolio());datosS.add(getTitulo());
     /*datosS.add(getFecha_publicacion());*/
     datosS.add(getEdicion());
     datosS.add(getEditorial());datosS.add(getAutor());
     camposI.add("tipo");camposI.add("estado");
     datosI.add(getTipo()); datosI.add(getEstado());
     serv.actualizar("material", camposS, datosS, camposI, datosI,
         "folio", getFolio());
}

  public String getFolio() {
    return folio;
  }

  public void setFolio(String folio) {
    this.folio = folio;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getEdicion() {
    return edicion;
  }

  public void setEdicion(String edicion) {
    this.edicion = edicion;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getTipo() {
    return tipoMaterial;
  }

  public void setTipo(int tipoMat) {
    this.tipoMaterial = tipoMat;
  }

  public String getFechaPublicacion() {
    return fechaPublicacion;
  }

  public void setFechaPublicacion(String fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }
  
  
}
  
 