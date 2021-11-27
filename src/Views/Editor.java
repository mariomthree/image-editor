package Views;

import Controller.ImageController;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Editor extends javax.swing.JFrame {

    ImageController imageController;
    File fileUploaded;
    BufferedImage imageUploaded;
    PlaceHolder cropHeigthHolder;
    PlaceHolder cropWidthHolder;
    PlaceHolder cropXHolder;
    PlaceHolder cropYHolder;
    PlaceHolder scaleWidthHolder;
    PlaceHolder scaleHeigthHolder;
    PlaceHolder translateXHolder;
    PlaceHolder translateYHolder;

    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
        imageController = new ImageController();
        fileUploaded = null;
        imageUploaded = null;

        cropWidthHolder = new PlaceHolder(cropWidth, Color.GRAY, Color.BLACK, "Width", false, Font.SANS_SERIF, 13);
        cropHeigthHolder = new PlaceHolder(cropHeigth, Color.GRAY, Color.BLACK, "Heigth", false, Font.SANS_SERIF, 13);
        cropXHolder = new PlaceHolder(cropX, Color.GRAY, Color.BLACK, "X Value", false, Font.SANS_SERIF, 13);
        cropYHolder = new PlaceHolder(cropY, Color.GRAY, Color.BLACK, "Y Value", false, Font.SANS_SERIF, 13);
        scaleWidthHolder = new PlaceHolder(scaleWidth, Color.GRAY, Color.BLACK, "Width", false, Font.SANS_SERIF, 13);
        scaleHeigthHolder = new PlaceHolder(scaleHeigth, Color.GRAY, Color.BLACK, "Heigth", false, Font.SANS_SERIF, 13);
        translateXHolder = new PlaceHolder(translateX, Color.GRAY, Color.BLACK, "X Value", false, Font.SANS_SERIF, 13);
        translateYHolder = new PlaceHolder(translateY, Color.GRAY, Color.BLACK, "Y Value", false, Font.SANS_SERIF, 13);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRotate90Left = new javax.swing.JButton();
        btnRotate90Right = new javax.swing.JButton();
        btnCrop = new javax.swing.JButton();
        cropWidth = new javax.swing.JTextField();
        cropHeigth = new javax.swing.JTextField();
        cropX = new javax.swing.JTextField();
        cropY = new javax.swing.JTextField();
        btnScale = new javax.swing.JButton();
        scaleWidth = new javax.swing.JTextField();
        scaleHeigth = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRotate180 = new javax.swing.JButton();
        btnUploadImage = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        currentWidth = new javax.swing.JLabel();
        currentHeight = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        translateX = new javax.swing.JTextField();
        translateY = new javax.swing.JTextField();
        btnTranslate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRotate90Left.setText("90° Left");
        btnRotate90Left.setMaximumSize(new java.awt.Dimension(80, 25));
        btnRotate90Left.setMinimumSize(new java.awt.Dimension(80, 25));
        btnRotate90Left.setPreferredSize(new java.awt.Dimension(80, 25));
        btnRotate90Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotate90LeftActionPerformed(evt);
            }
        });

        btnRotate90Right.setText("90° Right");
        btnRotate90Right.setMaximumSize(new java.awt.Dimension(80, 25));
        btnRotate90Right.setMinimumSize(new java.awt.Dimension(80, 25));
        btnRotate90Right.setPreferredSize(new java.awt.Dimension(80, 25));
        btnRotate90Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotate90RightActionPerformed(evt);
            }
        });

        btnCrop.setText("Crop");
        btnCrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCropActionPerformed(evt);
            }
        });

        cropWidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cropHeigth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cropX.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cropY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnScale.setText("Scale");
        btnScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScaleActionPerformed(evt);
            }
        });

        scaleWidth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        scaleHeigth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANSLATE IMAGE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CROP IMAGE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ROTATE IMAGE");

        btnRotate180.setText("180°");
        btnRotate180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotate180ActionPerformed(evt);
            }
        });

        btnUploadImage.setText("Upload Imagem");
        btnUploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadImageActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("IMAGE EDITOR");

        currentWidth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentWidth.setText("Width(X)");

        currentHeight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        currentHeight.setText("Height(x)");

        btnSave.setBackground(new java.awt.Color(38, 86, 186));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE IMAGE");
        btnSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSave.setContentAreaFilled(false);
        btnSave.setOpaque(true);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        translateX.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        translateY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnTranslate.setText("Translate");
        btnTranslate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranslateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SCALE IMAGE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTranslate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRotate180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRotate90Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRotate90Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cropWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cropHeigth, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scaleWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scaleHeigth, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUploadImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(translateX, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(translateY, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cropX, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cropY))
                    .addComponent(btnCrop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentWidth)
                    .addComponent(currentHeight))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRotate90Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRotate90Right, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRotate180, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cropWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cropHeigth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cropX)
                    .addComponent(cropY, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scaleWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scaleHeigth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScale, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(translateX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(translateY, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(imageLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRotate90LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotate90LeftActionPerformed
        if (imageUploaded == null) {
            return;
        }

        imageUploaded = imageController.rotate90(imageUploaded, ImageController.ROTATE_LEFT);
        ImageIcon icon = new ImageIcon(imageUploaded);
        imageLabel.setIcon(icon);
    }//GEN-LAST:event_btnRotate90LeftActionPerformed

    private void btnUploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogTitle("Select Image");
        FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only images", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(restrict);

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                imageUploaded = ImageIO.read(fileChooser.getSelectedFile().getAbsoluteFile());
                fileUploaded = fileChooser.getSelectedFile().getAbsoluteFile();
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            currentHeight.setText("Height(" + imageUploaded.getHeight() + ")");
            currentWidth.setText("Width(" + imageUploaded.getWidth() + ")");
            ImageIcon icon = new ImageIcon(imageUploaded);
            imageLabel.setIcon(icon);

        }
    }//GEN-LAST:event_btnUploadImageActionPerformed

    private void btnRotate90RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotate90RightActionPerformed
        if (imageUploaded == null) {
            return;
        }

        imageUploaded = imageController.rotate90(imageUploaded, ImageController.ROTATE_RIGHT);
        ImageIcon icon = new ImageIcon(imageUploaded);
        imageLabel.setIcon(icon);
    }//GEN-LAST:event_btnRotate90RightActionPerformed

    private void btnRotate180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotate180ActionPerformed
        if (imageUploaded == null) {
            return;
        }

        imageUploaded = imageController.rotate180(imageUploaded);
        ImageIcon icon = new ImageIcon(imageUploaded);
        imageLabel.setIcon(icon);
    }//GEN-LAST:event_btnRotate180ActionPerformed

    private void btnCropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCropActionPerformed
        if (imageUploaded == null) {
            return;
        }

        if (cropX.getText().equals(cropXHolder.getTextoHolder())
                || cropY.getText().equals(cropYHolder.getTextoHolder())
                || cropWidth.getText().equals(cropWidthHolder.getTextoHolder())
                || cropHeigth.getText().equals(cropHeigthHolder.getTextoHolder())) {
            return;
        }

        if (cropX.getText().isEmpty()
                || cropY.getText().isEmpty()
                || cropWidth.getText().isEmpty()
                || cropHeigth.getText().isEmpty()) {
            return;
        }

        imageUploaded = imageController.crop(
                imageUploaded,
                Integer.parseInt(cropX.getText()),
                Integer.parseInt(cropY.getText()),
                Integer.parseInt(cropWidth.getText()),
                Integer.parseInt(cropHeigth.getText())
        );

        currentHeight.setText("Height(" + imageUploaded.getHeight() + ")");
        currentWidth.setText("Width(" + imageUploaded.getWidth() + ")");
        ImageIcon icon = new ImageIcon(imageUploaded);
        imageLabel.setIcon(icon);
    }//GEN-LAST:event_btnCropActionPerformed

    private void btnScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScaleActionPerformed
        if (imageUploaded == null) {
            return;
        }

        if (scaleWidth.getText().equals(scaleWidthHolder.getTextoHolder()) || scaleHeigth.getText().equals(scaleHeigthHolder.getTextoHolder())) {
            return;
        }

        if (scaleWidth.getText().isEmpty() || scaleHeigth.getText().isEmpty()) {
            return;
        }

        imageUploaded = imageController.scale(
                imageUploaded,
                Integer.parseInt(scaleWidth.getText()),
                Integer.parseInt(scaleHeigth.getText())
        );
        currentHeight.setText("Height(" + imageUploaded.getHeight() + ")");
        currentWidth.setText("Width(" + imageUploaded.getWidth() + ")");
        ImageIcon icon = new ImageIcon(imageUploaded);
        imageLabel.setIcon(icon);
    }//GEN-LAST:event_btnScaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (fileUploaded == null || imageUploaded == null) {
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                ImageInputStream imageInputStream = ImageIO.createImageInputStream(fileUploaded);
                Iterator<ImageReader> iterator = ImageIO.getImageReaders(imageInputStream);
                ImageReader imageReader = iterator.next();

                File selectedFile = fileChooser.getSelectedFile();
                selectedFile = new File(selectedFile.getCanonicalPath() + "." + imageReader.getFormatName());

                ImageIO.write(imageUploaded, imageReader.getFormatName(), selectedFile);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnTranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranslateActionPerformed
        if (imageUploaded == null) {
            return;
        }

        if (translateX.getText().equals(translateXHolder.getTextoHolder()) || translateY.getText().equals(translateYHolder.getTextoHolder())) {
            return;
        }

        if (translateX.getText().isEmpty() || translateY.getText().isEmpty()) {
            return;
        }

        imageUploaded = imageController.translate(
                imageUploaded,
                Integer.parseInt(translateX.getText()),
                Integer.parseInt(translateY.getText()),
                imageLabel.getWidth(),
                imageLabel.getHeight()
        );
        ImageIcon icon = new ImageIcon(imageUploaded);
        imageLabel.setIcon(icon);
    }//GEN-LAST:event_btnTranslateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Editor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrop;
    private javax.swing.JButton btnRotate180;
    private javax.swing.JButton btnRotate90Left;
    private javax.swing.JButton btnRotate90Right;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnScale;
    private javax.swing.JButton btnTranslate;
    private javax.swing.JButton btnUploadImage;
    private javax.swing.JTextField cropHeigth;
    private javax.swing.JTextField cropWidth;
    private javax.swing.JTextField cropX;
    private javax.swing.JTextField cropY;
    private javax.swing.JLabel currentHeight;
    private javax.swing.JLabel currentWidth;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField scaleHeigth;
    private javax.swing.JTextField scaleWidth;
    private javax.swing.JTextField translateX;
    private javax.swing.JTextField translateY;
    // End of variables declaration//GEN-END:variables
}
