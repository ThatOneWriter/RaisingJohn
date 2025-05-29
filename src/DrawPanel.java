import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class DrawPanel extends JPanel implements KeyListener {

    private Johnny johnny;
    private ComputerBackground computer;

    public DrawPanel() {
        johnny = new Johnny();
        computer = new ComputerBackground();
        this.addKeyListener(this);
    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        if (computer.getBackgroundImage() != null) {

            g.drawImage(computer.getBackgroundImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH), 200, 200, this);
        }

        if (johnny.getImage() != null) {
            g.drawImage(johnny.getImage(), johnny.getJ_xValue(), johnny.getJ_yValue(), this);
        }


    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            move(-johnny.getJ_xValue(), 0);
            System.out.print("Moving left");
            johnny.moveUserLeft("left");

        }
        else if (e.getKeyCode() == KeyEvent.VK_D) {
            move(+johnny.getJ_xValue(), 0);
            System.out.print("Moving right");
            johnny.moveUserRight("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_W) {
            move(+johnny.getJ_xValue(), 0);
            System.out.print("Moving up");
            johnny.moveUserUpwards("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            move(-johnny.getJ_yValue(), 0);
            System.out.print("Moving down");
            johnny.moveUserDownwards("down");
        }
        repaint();


    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            move(-johnny.getJ_xValue(), 0);
            System.out.print("Moving left");
            johnny.moveUserLeft("left");

        }
        else if (e.getKeyCode() == KeyEvent.VK_D) {
            move(+johnny.getJ_xValue(), 0);
            System.out.print("Moving right");
            johnny.moveUserRight("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_W) {
            move(+johnny.getJ_xValue(), 0);
            System.out.print("Moving up");
            johnny.moveUserUpwards("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            move(-johnny.getJ_yValue(), 0);
            System.out.print("Moving down");
            johnny.moveUserDownwards("down");
        }
       repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
