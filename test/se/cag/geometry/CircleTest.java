package se.cag.geometry;

import java.util.Locale;
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
public class CircleTest {

    private final Shape instance;
    
    public CircleTest() {
        instance = new Circle(3);
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
     * Test of circumference method, of class Circle.
     */
    @Test
    public void testCircumference() {
        String expResult = "18.85";
        String result = String.format(Locale.ENGLISH, "%.2f", instance.circumference());
        assertEquals(expResult, result);
    }

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testArea() {
        String expResult = "28.27";
        String result = String.format(Locale.ENGLISH, "%.2f", instance.area());
        assertEquals(expResult, result);
    }

}
