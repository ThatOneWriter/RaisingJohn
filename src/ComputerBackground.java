import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ComputerBackground {

    private final String imageFileName;
    private BufferedImage image;


    public ComputerBackground() {

        this.imageFileName = "images/ComputerScreen.png";
        getImageFile();

    }

    public void getImageFile() {
        try {
            File imageFile = new File(imageFileName);
            image = ImageIO.read(imageFile);

        } catch (IOException e) {
            System.out.print("Error message: Can't find " + imageFileName);
        }
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public BufferedImage getBackgroundImage() {

        return image;
    }
}
