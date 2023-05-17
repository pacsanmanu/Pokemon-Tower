package utils;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.Pokemon;

public class Utils {
    
    public Utils(){
        
    }
    
    public ImageIcon LabelSetImg(Pokemon p) throws IOException {
        BufferedImage img;
        img = ImageIO.read(new File("src/" + p.getImage()));
        // Create a ByteArrayOutputStream to write the image bytes to
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Write the image bytes to the ByteArrayOutputStream
        ImageIO.write(img, "png", baos);
        // Get the byte array from the ByteArrayOutputStream
        byte[] imageBytes = baos.toByteArray();
        ImageIcon imageIcon = new ImageIcon(imageBytes);
        //Para reescalar una imagen a otras dimensiones:
        return imageIcon;
    }
    
    public ImageIcon LabelSetBackImg(Pokemon p) throws IOException {
        BufferedImage img;
        img = ImageIO.read(new File("src/images/back-" + p.getName() + ".png"));
        // Create a ByteArrayOutputStream to write the image bytes to
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Write the image bytes to the ByteArrayOutputStream
        ImageIO.write(img, "png", baos);
        // Get the byte array from the ByteArrayOutputStream
        byte[] imageBytes = baos.toByteArray();
        ImageIcon imageIcon = new ImageIcon(imageBytes);
        //Para reescalar una imagen a otras dimensiones:
        return imageIcon;
    }
    
    public ImageIcon FrameSetImg(String imageName) throws IOException{
        BufferedImage img;
        img = ImageIO.read(new File("src/images/" + imageName));
        // Create a ByteArrayOutputStream to write the image bytes to
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // Write the image bytes to the ByteArrayOutputStream
        ImageIO.write(img, "png", baos);
        // Get the byte array from the ByteArrayOutputStream
        byte[] imageBytes = baos.toByteArray();
        ImageIcon imageIcon = new ImageIcon(imageBytes);
        //Para reescalar una imagen a otras dimensiones:
        return imageIcon;
    }
    
    public ImageIcon ScaleIcon(javax.swing.JLabel label, int width, int height){
        Icon icono = label.getIcon();
        Image imagen = ((ImageIcon) icono).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon nuevoIcono = new ImageIcon(imagen);
        return nuevoIcono;
    }
}
