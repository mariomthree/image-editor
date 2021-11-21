package Controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
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
    public void rotateLeft90BufferedImageTest() {
        try {
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.rotate90(image, ImageController.ROTATE_LEFT);
            assertNotNull(result);
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void rotateRight90Test() {
        File outputRight90 = new File("test\\images\\arvore-rotate90-right.png");
        boolean result = imageController.rotate90(input, outputRight90, ImageController.ROTATE_RIGHT);
        assertTrue(result);
    }

    @Test
    public void rotateRight90BufferedImageTest() {
        try {
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.rotate90(image, ImageController.ROTATE_RIGHT);
            assertNotNull(result);
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void rotate180Test() {
        File output180 = new File("test\\images\\arvore-rotate180.png");
        boolean result = imageController.rotate180(input, output180);
        assertTrue(result);
    }

    @Test
    public void rotate180BufferedImageTest() {
        try {
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.rotate180(image);
            assertNotNull(result);
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void scaleTest() {
        File outputScale = new File("test\\images\\arvore-scale.png");
        boolean result = imageController.scale(input, outputScale, 100, 100);
        assertTrue(result);
    }

    @Test
    public void scaleBufferedImageTest() {
        try {
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.scale(image, 100, 100);
            assertNotNull(result);
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void cropTest() {
        File outputCrop = new File("test\\images\\arvore-crop.png");
        boolean result = imageController.crop(input, outputCrop, 0, 50, 200, 200);
        assertTrue(result);
    }

    @Test
    public void cropBufferedImageTest() {
        try {
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.crop(image, 0, 50, 100, 100);
            assertNotNull(result);
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
