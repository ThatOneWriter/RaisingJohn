import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Johnny {

    private String imageFileName;
    private BufferedImage image;
    private int j_xValue;
    private int j_yValue;
    private String deadImage;
    private boolean isDead;
    private boolean isAlive;
    private Rectangle hitBox;


    public Johnny() {
        j_xValue = 1000;
        j_yValue = 500;
        this.imageFileName = "images/chicken.png";
        this.deadImage = "images/cardboardknife.png";
        this.isDead = false;
        this.isAlive = true;
        this.hitBox = new Rectangle(-100, -100, 200, 281);
        getImageFile();

    }

    public BufferedImage getImageFile() {
        try {
            if (isDead) {
                File image = new File(deadImage);
                this.image = ImageIO.read(image);
            }

            if (isAlive) {
                File i = new File(imageFileName);
                image = ImageIO.read(i);
            }
            return image;

        } catch (IOException e) {
            System.out.print("Error message: Can't find " + imageFileName);
            return null;
        }
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void isDead() {
        isAlive = false;
        isDead = true;
        this.image = getImageFile();
    }

    public void isAlive() {
        isDead = false;
        isAlive = true;
        this.image = getImageFile();
    }

    public int getJ_xValue() {
        return j_xValue;
    }

    public int getJ_yValue() {
        return j_yValue;
    }

    public int moveUserRight(String right) {

        return j_xValue+=10;
    }

    public int moveUserLeft(String left) {

        return j_xValue-=10;
    }

    public int moveUserUpwards(String up) {

        return j_yValue+=10;
    }

    public int moveUserDownwards(String down) {

        return j_yValue-=10;
    }

    public void setHitBox(int jXValue, int jYValue) {

        hitBox.setLocation(jXValue, jYValue);
    }
}
