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
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of registrarUsuario method, of class Servicios.
     */
    @Test
    public void testRegistrarUsuario() {
        System.out.println("registrarUsuario");
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
        //instance.registrarUsuario(mat, nombre, apellidoPaterno, apellidoMaterno, correo, telefono, tipo, calle, colonia, numero, cp, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consulta method, of class Servicios.
     */
    @Test
    public void testConsulta() {
        System.out.println("consulta");
        String nombreTabla = "";
        ArrayList<String> campos = null;
        String criterioBusqueda = "";
        String datoBusqueda = "";
        Servicios instance = new Servicios();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.consulta(nombreTabla, campos, criterioBusqueda, datoBusqueda);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarLector method, of class Servicios.
     */
    @Test
    public void testBuscarLector() {
        System.out.println("buscarLector");
        String matricula = "";
        Servicios instance = new Servicios();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.buscarLector(matricula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarExistenciaLector method, of class Servicios.
     */
    @Test
    public void testConfirmarExistenciaLector() {
//        System.out.println("confirmarExistenciaLector");
//        String matricula = "";
//        Servicios instance = new Servicios();
//        boolean expResult = false;
//        boolean result = instance.confirmarExistenciaLector(matricula);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarLector method, of class Servicios.
     */
    @Test
    public void testActualizarLector() {
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
        instance.actualizar(mat, nombre, apellidoPaterno, apellidoMaterno,
            correo, telefono, tipo, calle, cp, colonia, numero, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
