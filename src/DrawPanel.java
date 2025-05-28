import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class DrawPanel extends JPanel implements KeyListener {

    private Johnny johnny;

    public DrawPanel() {
        johnny = new Johnny();
        this.addKeyListener(this);
    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        if (johnny.getImage() != null) {

            g.drawImage(johnny.getImage(), johnny.getJ_xValue(), johnny.getJ_yValue(), this);

        }




    }

    private void dragImage(JLayeredPane layeredPane, String imagePath, int x, int y) {
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            johnny.moveUserLeft("left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_D) {
            johnny.moveUserRight("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_W) {
            johnny.moveUserUpwards("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            johnny.moveUserDownwards("down");
        }
       repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
