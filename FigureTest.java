/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 *
 * @author Ars
 */
public class FigureTest {

    public FigureTest() {
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

    @Rule
    public final SystemOutRule outRule = new SystemOutRule().enableLog();

    /**
     * Test of calculateSquare method, of class Triangle.
     */
    @Test
    public void shouldCalculateSquareForTriangle() {
        
        Triangle triangle = new Triangle("t1", 5, 10);
        triangle.calculateSquare();

        String log = outRule.getLog();

        Assert.assertTrue(log.contains("Square :25.0"));
    }
    
    @Test
    public void shouldCalculateSquareForParallelogram() {
        
        Parallelogram parallelogram= new Parallelogram("p1", 5, 10);
                
        parallelogram.calculateSquare();

        String log = outRule.getLog();

        Assert.assertTrue(log.contains("50.0"));
    }
    
    @Test
    public void shouldCalculateSquareForRomb() {
        
        Romb romb= new Romb("r1", 10, 10);
        
        romb.calculateSquare();

        String log = outRule.getLog();

        Assert.assertTrue(log.contains("100.0"));
    }

}
