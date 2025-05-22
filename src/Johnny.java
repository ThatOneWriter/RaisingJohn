import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Johnny {

    private final String imageFileName;
    private int j_xValue;
    private int j_yValue;
    private BufferedImage image;

    public Johnny() {
        j_xValue = 0;
        j_yValue = 0;
        this.image = readImage();
        this.imageFileName = "images/chicken.png";
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public BufferedImage getImage() {
        return image;
    }


    public BufferedImage readImage() {
        try {
            BufferedImage image;
            image = ImageIO.read(new File(imageFileName));


            return image;
        }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public int getJ_xValue() {
        return j_xValue;
    }

    public int getJ_yValue() {
        return j_yValue;
    }

    public void moveUserRight(String right) {
        j_xValue++;
    }

    public void moveUserLeft(String left) {
        j_xValue--;
    }

    public void moveUserUpwards(String up) {
        j_yValue++;
    }

    public void moveUserDownwards(String down) {
        j_yValue--;
    }
}
