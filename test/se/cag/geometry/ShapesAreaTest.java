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
public class ShapesAreaTest {

    private final ShapesArea instance;

    public ShapesAreaTest() {
        instance = new ShapesArea(new Circle(3), new Rectangle(3, 4), new RightAngledTriangle(3, 4, 5));
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
     * Test of area method, of class ShapesArea.
     */
    @Test
    public void testArea() {
        String expResult = "46.27";
        String result = String.format(Locale.ENGLISH, "%.2f", instance.area());
        assertEquals(expResult, result);
    }

}
