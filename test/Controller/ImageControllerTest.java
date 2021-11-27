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
        try {
            ImageController imageController = new ImageController();
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
        try {
            ImageController imageController = new ImageController();
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.rotate90(image, ImageController.ROTATE_RIGHT);
            assertNotNull(result);
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        };
    }

    @Test
    public void rotate180Test() {
        try {
            ImageController imageController = new ImageController();
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
        try {
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            ImageController imageController = new ImageController();
            BufferedImage result = imageController.scale(image, 100, 100);
            assertNotNull(result);
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void cropTest() {
        try {
            ImageController imageController = new ImageController();
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.crop(image, 0, 50, 100, 100);
            assertNotNull(result);
            assertFalse(imageController.isIsError());
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void translateBufferedImageTest() {
        try {
            ImageController imageController = new ImageController();
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(input);
            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage result = imageController.translate(image, 20, 20, 500, 500);
            assertNotNull(result);
            assertFalse(imageController.isIsError());
        } catch (IOException ex) {
            Logger.getLogger(ImageControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
