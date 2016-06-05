/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class GestionUsuariosTest {
    
    public GestionUsuariosTest() {
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

    @Test
    public void testInhabilitarCampos() {
        System.out.println("inhabilitarCampos");
        GestionUsuarios instance = new GestionUsuarios();
        instance.inhabilitarCampos();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testHabilitarCampos() {
        System.out.println("habilitarCampos");
        GestionUsuarios instance = new GestionUsuarios();
        instance.habilitarCampos();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testActionClickCancelar() {
        System.out.println("actionClickCancelar");
        GestionUsuarios instance = new GestionUsuarios();
        instance.actionClickCancelar();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testActionClickBaja() {
        System.out.println("actionClickBaja");
        GestionUsuarios instance = new GestionUsuarios();
        instance.actionClickBaja();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testActionClickBuscar() {
        System.out.println("actionClickBuscar");
        GestionUsuarios instance = new GestionUsuarios();
        instance.actionClickBuscar();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testVerificarCampos() {
        System.out.println("verificarCampos");
        GestionUsuarios instance = new GestionUsuarios();
        boolean expResult = false;
        boolean result = instance.verificarCampos();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testNotificacionCamposOblitagorios() {
        System.out.println("notificacionCamposOblitagorios");
        GestionUsuarios instance = new GestionUsuarios();
        instance.notificacionCamposOblitagorios();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testActionClickGuardar() {
        System.out.println("actionClickGuardar");
        GestionUsuarios instance = new GestionUsuarios();
        instance.actionClickGuardar();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GestionUsuarios.main(args);
        //fail("The test case is a prototype.");
    }
    
}
