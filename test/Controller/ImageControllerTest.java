package Controller;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImageControllerTest {

    File input = new File("test\\images\\arvore.png");
    ImageController imageController = new ImageController();

    public ImageControllerTest() {
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
    public void rotateLeft90Test() {
        File outputLeft90 = new File("test\\images\\arvore-rotate90-left.png");
        boolean result = imageController.rotate90(input, outputLeft90, ImageController.ROTATE_LEFT);
        assertTrue(result);
    }

    @Test
    public void rotateRight90Test() {
        File outputRight90 = new File("test\\images\\arvore-rotate90-right.png");
        boolean result = imageController.rotate90(input, outputRight90, ImageController.ROTATE_RIGHT);
        assertTrue(result);
    }

    @Test
    public void rotate180Test() {
        File output180 = new File("test\\images\\arvore-rotate180.png");
        boolean result = imageController.rotate180(input, output180);
        assertTrue(result);
    }

    @Test
    public void scaleTest() {
        File outputScale = new File("test\\images\\arvore-scale.png");
        boolean result = imageController.scale(input, outputScale, 100, 100);
        assertTrue(result);
    }

    @Test
    public void cropTest() {
        File outputCrop = new File("test\\images\\arvore-crop.png");
        boolean result = imageController.crop(input, outputCrop, 0, 50, 200, 200);
        assertTrue(result);
    }

}
