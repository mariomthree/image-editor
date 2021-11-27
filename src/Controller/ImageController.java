package Controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Iterator;
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

    public BufferedImage rotate90(BufferedImage image, int direction) {
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
        return rotatedImage;
    }

    public BufferedImage rotate180(BufferedImage image) {
        int imageWidth = image.getWidth();
        int imageHeight = image.getHeight();
        BufferedImage rotatedImage = new BufferedImage(imageWidth, imageHeight, image.getType());

        for (int y = 0; y < imageHeight; y++) {
            for (int x = 0; x < imageWidth; x++) {
                rotatedImage.setRGB((imageWidth - 1) - x, (imageHeight - 1) - y, image.getRGB(x, y));
            }
        }
        return rotatedImage;
    }

    public BufferedImage scale(BufferedImage originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, originalImage.getType());
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, width, height, null);
        graphics2D.dispose();
        return resizedImage;
    }

    public BufferedImage translate(BufferedImage originalImage, int x, int y, int width, int height) {

        if (x > width && y > height) {
            this.isError = true;
            this.error = "Os valores de x e y são maiores do que a largura e altura da imagem.";
            return originalImage;
        }

        if (x > width) {
            this.isError = true;
            this.error = "O valor de x é maior que a largura da imagem.";
            return originalImage;
        }

        if (y > height) {
            this.isError = true;
            this.error = "O valor de y é maior que a altura da imagem.";
            return originalImage;
        }

        BufferedImage resizedImage = new BufferedImage(width, height, originalImage.getType());
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, x, y, null);
        graphics2D.setBackground(Color.LIGHT_GRAY);
        graphics2D.dispose();
        return resizedImage;
    }

    public BufferedImage crop(BufferedImage image, int x, int y, int width, int height) {
        if (height >= image.getHeight() && width >= image.getWidth()) {
            this.isError = true;
            this.error = "Os valores da largura e altura são maiores do que a largura e altura da imagem.";
            return image;
        }

        if (height >= image.getHeight()) {
            this.isError = true;
            this.error = "O valor da altura introduzida é maior do que a altura da imagem.";
            return image;
        }

        if (height >= image.getHeight() || width >= image.getWidth()) {
            this.isError = true;
            this.error = "O valor da largura introduzida é maior do que a largura da imagem.";
            return image;
        }

        return image.getSubimage(x, y, width, height);
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
