import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Texture {
    public static Texture red = new Texture("textures/red.png", 64);
    public static Texture yellow = new Texture("textures/yellow.png", 64);
    public static Texture blue = new Texture("textures/blue.png", 64);
    public static Texture orange = new Texture("textures/orange.png", 64);

    public int[] pixels;
    public final int TEXTURE_SIZE;
    private String filePath;
    
    public Texture(String file_path, int size){
        filePath = file_Path;
        TEXTURE_SIZE = size;
        pixels = new int [TEXTURE_SIZE * TEXTURE_SIZE];
        load();
    }

    private void load(){
        try{
            BufferedImage image = ImageIO.read(new File(filePath));
            int width = image.getWidth();
            int height = image.getHeight();
            image.getRGB(0, 0, width, height, pixels, 0, width);
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}