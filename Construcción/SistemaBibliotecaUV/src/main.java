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
    IniciarSesion menu = new IniciarSesion();
    menu.setVisible(true);
    menu.setResizable(false);
  }
  
}
