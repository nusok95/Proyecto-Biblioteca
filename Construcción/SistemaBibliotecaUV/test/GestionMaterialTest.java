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
public class GestionMaterialTest {
    
    public GestionMaterialTest() {
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
        System.out.println("inhabilitarEtiquetas");
        GestionMaterial instance = new GestionMaterial();
        instance.inhabilitarCampos();
        
    }

    @Test
    public void testHabilitarEtiquetas() {
        System.out.println("habilitarEtiquetas");
        GestionMaterial instance = new GestionMaterial();
        instance.habilitarCampos();
        
    }

    @Test
    public void testActionClickCancelar() {
        System.out.println("actionClickCancelar");
        GestionMaterial instance = new GestionMaterial();
        instance.actionClickCancelar();
        
    }

    @Test
    public void testActionClickBuscar() {
        System.out.println("actionClickBuscar");
        GestionMaterial instance = new GestionMaterial();
        instance.actionClickBuscar();
        
    }

    @Test
    public void testActionClickGuardar() {
        System.out.println("actionClickGuardar");
        GestionMaterial instance = new GestionMaterial();
        instance.actionClickGuardar();
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GestionMaterial.main(args);
       
    }
    
}
