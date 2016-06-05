/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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
public class MaterialTest {
    
    public MaterialTest() {
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
    public void testAgregarMaterial() {
        System.out.println("agregarMaterial");
        Material instance = new Material("1234", "Aura", "8", "Trillas", "Carlos Fuentes", "02-14-16", 1, 1);
        instance.agregarMaterial();
        
    }

    @Test
    public void testActualizarMaterial() {
        System.out.println("actualizarMaterial");
        Material instance = new Material("1234", "Aura", "8", "Trillas", "Carlos Fuentes", "02-14-16", 1, 0);
        instance.actualizarMaterial();
        
    }

  
    
}
