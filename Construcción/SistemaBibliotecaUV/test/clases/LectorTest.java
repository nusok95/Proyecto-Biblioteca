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
public class LectorTest {
    
    public LectorTest() {
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
    public void testAgregarLector() {
        System.out.println("agregarLector");
        Lector instance = new Lector("s14011632","susana","gonzalez","portilla","susana-140294@hotmail.com","1676261","Paseo Xalapa","91158","Ruben pabello","96",1,0);
        instance.agregarLector();
        //fail("The test case is a prototype.");
    }

    @Test
    public void testActualizarLector() {
        System.out.println("actualizarLector");
         Lector instance = new Lector("s14011633","susana","gonzalez","portilla","susana-140294@hotmail.com","1676261","Paseo Xalapa","91158","Ruben pabello","96",1,0);
        instance.actualizarLector();
        //fail("The test case is a prototype.");
    }

    
}
