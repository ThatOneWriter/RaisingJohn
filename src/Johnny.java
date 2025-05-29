import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Johnny {

    private final String imageFileName;
    private BufferedImage image;
    private int j_xValue;
    private int j_yValue;


    public Johnny() {
        j_xValue = 1000;
        j_yValue = 500;
        this.imageFileName = "images/chicken.png";
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

    public BufferedImage getImage() {
        return image;
    }

    public int getJ_xValue() {
        return j_xValue;
    }

    public int getJ_yValue() {
        return j_yValue;
    }

    public void moveUserRight(String right) {

    }

    public void moveUserLeft(String left) {
        j_xValue-=10;
    }

    public void moveUserUpwards(String up) {
        j_yValue+=10;
    }

    public void moveUserDownwards(String down) {
        j_yValue-=10;
    }
}
