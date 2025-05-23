public class Johnny {

    private final String imageFileName;
    private int j_xValue;
    private int j_yValue;


    public Johnny() {
        j_xValue = 0;
        j_yValue = 0;

        this.imageFileName = "images/chicken.png";
    }

    public String getImageFileName() {
        return imageFileName;
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
