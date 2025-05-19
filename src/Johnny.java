import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Johnny {

    private String imageFileName;

    public Johnny() {
        this.imageFileName = "images/cardboardknife.png";
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public static ArrayList<Johnny> johnBoy() {
        ArrayList<Johnny> john = new ArrayList<>();
        return john;
    }
}
