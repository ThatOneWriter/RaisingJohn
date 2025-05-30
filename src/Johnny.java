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
    private Rectangle hitBox;


    public Johnny() {
        j_xValue = 1000;
        j_yValue = 500;
        this.imageFileName = "images/chicken.png";
        this.deadImage = "images/cardboardknife.png";
        this.isDead = false;
        this.hitBox = new Rectangle(-100, -100, 200, 281);
        getImageFile();

    }

    public BufferedImage getImageFile() {
        try {
            File imageFile = new File(imageFileName);
            image = ImageIO.read(imageFile);

            if (isDead) {
                File image = new File(deadImage);
                this.image = ImageIO.read(image);
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
        isDead = true;
        this.image = getImageFile();
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

    public void setHitBox(int jXValue, int jYValue) {
        hitBox.setLocation(jXValue, jYValue);
    }
}
