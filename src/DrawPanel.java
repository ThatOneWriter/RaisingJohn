import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class DrawPanel extends JPanel implements KeyListener {
    private Johnny j;
    private Image sprite;


    public DrawPanel() {
        ImageIcon image = new ImageIcon("images/cardboardknife.png");
        sprite = image.getImage();

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.addKeyListener(this);


        if (sprite != null) {
            g.drawImage(sprite,j.getJ_xValue(), j.getJ_yValue(), this);
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            j.moveUserLeft("left");
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            j.moveUserRight("right");
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            j.moveUserUpwards("up");
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            j.moveUserDownwards("down");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
