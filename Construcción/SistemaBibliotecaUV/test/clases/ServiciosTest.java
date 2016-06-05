/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author susana
 */
public class ServiciosTest {
    
    public ServiciosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class Servicios.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String nombre = "susana";
        String password = "camilo123";
        Servicios instance = new Servicios();
        boolean expResult = true;
        boolean result = instance.login(nombre, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of registrarUsuario method, of class Servicios.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar datos");
        String mat = "";
        String nombre = "";
        String apellidoPaterno = "";
        String apellidoMaterno = "";
        String correo = "";
        String telefono = "";
        int tipo = 0;
        String calle = "";
        String colonia = "";
        String numero = "";
        String cp = "";
        int estado = 0;
        Servicios instance = new Servicios();
        Lector lector = new Lector(mat,nombre,apellidoPaterno,
                                   apellidoMaterno,correo,telefono,calle,
                                   cp,colonia,numero,tipo,estado);
        lector.agregarLector();
    }

    /**
     * Test of consulta method, of class Servicios.
     */
    @Test
    public void testConsulta() {
        System.out.println("consulta");
        String nombreTabla = "";
        ArrayList<String> campos = new ArrayList();
        String criterioBusqueda = "";
        String datoBusqueda = "";
        Servicios instance = new Servicios();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.consulta(nombreTabla, campos, criterioBusqueda, datoBusqueda);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarLector method, of class Servicios.
     */
    @Test
    public void testconfirmarExistencia() {
       ArrayList campos = new ArrayList<String>();
       Servicios instance = new Servicios();
       campos.add("*");
       String nombreTabla = "";
       String id = "";
       String mat = "";
       instance.confirmarExistencia(nombreTabla,id,mat);
    }

    
    @Test
    public void testActualizar() {
        System.out.println("actualizarLector");
        String mat = "";
        String nombre = "";
        String apellidoPaterno = "";
        String apellidoMaterno = "";
        String correo = "";
        String telefono = "";
        int tipo = 0;
        String calle = "";
        String cp = "";
        String colonia = "";
        String numero = "";
        int estado = 0;
        Servicios instance = new Servicios();
        Lector lector = new Lector(mat,nombre,apellidoPaterno,
                                   apellidoMaterno,correo,telefono,calle,
                                   cp,colonia,numero,tipo,estado);
        lector.agregarLector();
    }
    
}
