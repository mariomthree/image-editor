package Controller;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class ImageController {

    public static final int ROTATE_LEFT = 1;
    public static final int ROTATE_RIGHT = -1;

    private String error;
    private boolean isError;

    private ImageInputStream imageInputStream;
    private Iterator<ImageReader> iterator;
    private ImageReader imageReader;

    public ImageController() {
        this.error = null;
        this.isError = false;
    }

    public boolean rotate90(File input, File Output, int direction) {
        try {
            this.imageInputStream = ImageIO.createImageInputStream(input);
            this.iterator = ImageIO.getImageReaders(imageInputStream);
            this.imageReader = iterator.next();

            BufferedImage image = ImageIO.read(imageInputStream);
            int imageWidth = image.getWidth();
            int imageHeight = image.getHeight();
            BufferedImage rotatedImage = new BufferedImage(imageHeight, imageWidth, image.getType());

            for (int y = 0; y < imageHeight; y++) {
                for (int x = 0; x < imageWidth; x++) {
                    if (direction == ROTATE_LEFT) {
                        rotatedImage.setRGB(y, (imageWidth - 1) - x, image.getRGB(x, y));
                    } else {
                        rotatedImage.setRGB((imageHeight - 1) - y, x, image.getRGB(x, y));
                    }
                }
            }

            return ImageIO.write(rotatedImage, imageReader.getFormatName(), Output);
        } catch (IOException ex) {
            this.isError = true;
            this.error = ex.getMessage();
            return false;
        }
    }

    public boolean rotate180(File input, File Output) {
        try {
            this.imageInputStream = ImageIO.createImageInputStream(input);
            this.iterator = ImageIO.getImageReaders(imageInputStream);
            this.imageReader = iterator.next();

            BufferedImage image = ImageIO.read(imageInputStream);
            int imageWidth = image.getWidth();
            int imageHeight = image.getHeight();
            BufferedImage rotatedImage = new BufferedImage(imageWidth, imageHeight, image.getType());

            for (int y = 0; y < imageHeight; y++) {
                for (int x = 0; x < imageWidth; x++) {
                    rotatedImage.setRGB((imageWidth - 1) - x, (imageHeight - 1) - y, image.getRGB(x, y));
                }
            }

            return ImageIO.write(rotatedImage, imageReader.getFormatName(), Output);
        } catch (IOException ex) {
            this.isError = true;
            this.error = ex.getMessage();
            return false;
        }
    }

    public boolean scale(File input, File Output, int width, int height) {
        try {
            this.imageInputStream = ImageIO.createImageInputStream(input);
            this.iterator = ImageIO.getImageReaders(imageInputStream);
            this.imageReader = iterator.next();

            BufferedImage originalImage = ImageIO.read(imageInputStream);
            BufferedImage resizedImage = new BufferedImage(width, height, originalImage.getType());

            Graphics2D graphics2D = resizedImage.createGraphics();
            graphics2D.drawImage(originalImage, 0, 0, width, height, null);
            graphics2D.dispose();

            return ImageIO.write(resizedImage, imageReader.getFormatName(), Output);
        } catch (IOException ex) {
            this.isError = true;
            this.error = ex.getMessage();
            return false;
        }
    }

    public boolean scale(File input, File Output, int n) {
        try {
            this.imageInputStream = ImageIO.createImageInputStream(input);
            this.iterator = ImageIO.getImageReaders(imageInputStream);
            this.imageReader = iterator.next();

            BufferedImage image = ImageIO.read(imageInputStream);
            int imageWidth = n * image.getWidth();
            int imageHeight = n * image.getHeight();
            BufferedImage enlargedImage = new BufferedImage(imageWidth, imageHeight, image.getType());

            for (int y = 0; y < imageHeight; ++y) {
                for (int x = 0; x < imageWidth; ++x) {
                    enlargedImage.setRGB(x, y, image.getRGB(x / n, y / n));
                }
            }

            return ImageIO.write(enlargedImage, imageReader.getFormatName(), Output);
        } catch (IOException ex) {
            this.isError = true;
            this.error = ex.getMessage();
            return false;
        }
    }

    public boolean crop(File input, File Output, int x, int y, int width, int height) {
        try {
            this.imageInputStream = ImageIO.createImageInputStream(input);
            this.iterator = ImageIO.getImageReaders(imageInputStream);
            this.imageReader = iterator.next();

            BufferedImage image = ImageIO.read(imageInputStream);
            BufferedImage cropedImage = image.getSubimage(x, y, width, height);

            return ImageIO.write(cropedImage, imageReader.getFormatName(), Output);
        } catch (IOException ex) {
            this.isError = true;
            this.error = ex.getMessage();
            return false;
        }
    }

    public static void translate() {

    }

    public String getError() {
        return this.error;
    }

    public boolean isIsError() {
        return this.isError;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }

}
