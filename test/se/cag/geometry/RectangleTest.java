package se.cag.geometry;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @see <a href="https://gist.github.com/KristofferV/952493dfa53b1349e684c4fa2f203403">C.A.G Geometry Calculator</a>
 * @version 1.0.0
 * @author Xotic750 xotic750@gmail.com
 */
public class RectangleTest {

    private final Shape instance;

    public RectangleTest() {
        instance = new Rectangle(3, 4);
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
     * Test of circumference method, of class Rectangle.
     */
    @Test
    public void testCircumference() {
        double expResult = 14.0;
        double result = instance.circumference();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of area method, of class Rectangle.
     */
    @Test
    public void testArea() {
        double expResult = 12.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

}
