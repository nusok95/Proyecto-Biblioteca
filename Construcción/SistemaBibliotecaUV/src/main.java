/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import clases.*;
import java.lang.reflect.Field;

/**
 *
 * @author Carlos
 * @version 0.2
 */
public class main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IllegalArgumentException, NoSuchFieldException, IllegalAccessException {
    /*String cadena;
     int x = Integer.parseInt("123");
     double n = Double.parseDouble("123");
    String nombre = "Carlos"; String campo="tabla";
    cadena = nombre+campo;
    System.out.println(cadena)*/
   /* Lector a = new Lector();
    Material m = new Material();
    Servicios serv = new Servicios();
    serv.prueba(a);
    serv.prueba(m);*/
    MenuPrincipal menu = new MenuPrincipal();
    menu.setVisible(true);
    menu.setResizable(false);
  
  /*GestionDePrestamos guiGestion = new GestionDePrestamos();
  guiGestion.setVisible(true);
  menu.setResizable(false);
  */
  }
  
}
