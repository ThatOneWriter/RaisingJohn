import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Johnny {
    private String imageFileName;
    private BufferedImage image;
    private boolean show;


    public Johnny () {
        this.imageFileName = "cardboardknife.png";
        this.show = true;
        this.image = readImage();
    }

    public BufferedImage getImage() {

        return image;
    }

    public BufferedImage readImage() {
        try {
            BufferedImage image;
            if (show) {
                image = ImageIO.read(new File(imageFileName));
            }
            return null;
        }
        catch (IOException e) {
            System.out.println(e);
            return null;
        }

    }
}
