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

    /**
     * Test of inhabilitarEtiquetas method, of class GestionUsuarios.
     */
    @Test
    public void testInhabilitarEtiquetas() {
        System.out.println("inhabilitarEtiquetas");
        GestionUsuarios instance = new GestionUsuarios();
        instance.inhabilitarEtiquetas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of habilitarEtiquetas method, of class GestionUsuarios.
     */
    @Test
    public void testHabilitarEtiquetas() {
        System.out.println("habilitarEtiquetas");
        GestionUsuarios instance = new GestionUsuarios();
        instance.habilitarEtiquetas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class GestionUsuarios.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GestionUsuarios.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
