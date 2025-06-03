import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawPanel extends JPanel implements KeyListener, MouseListener {

    private Johnny johnny;
    private ComputerBackground computer;
    private Rectangle button;

    private boolean[][] grid;

    public DrawPanel() {
        johnny = new Johnny();
        computer = new ComputerBackground();
        button = new Rectangle(147, 100, 160, 26);
        this.addKeyListener(this);
        this.addMouseListener(this);

        this.grid = new boolean[10][20];

    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        if (computer.getBackgroundImage() != null) {

            g.drawImage(computer.getBackgroundImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH), 200, 200, this);
        }

        if (johnny.getImage() != null) {
            g.drawImage(johnny.getImage(), johnny.getJ_xValue(), johnny.getJ_yValue(), this);
        }


        johnny.setHitBox(johnny.getJ_xValue(), johnny.getJ_yValue());

        g.setFont(new Font("Monospaced Bold", Font.BOLD, 20));
        g.drawString("Don't click me", 150, 120);

        int x = 400;
        int y = 300;

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);

        for (int columns = 0; columns < 20; columns++) {
            for (int rows = 0; rows < 10; rows++) {

                if (columns == 10 && rows < 8) {
                g2.setColor(Color.RED);
                g2.fillRect(x, y, 20, 20);
                }

                if (columns > 10 && rows == 9) {
                    g2.setColor(Color.MAGENTA);
                    g2.fillRect(x, y, 20, 20);
                }

                if (columns == 17 && rows < 2) {
                    g2.setColor(Color.ORANGE);
                    g2.fillRect(x, y, 20, 20);
                }

                g.drawRect(x, y, 20, 20);
                g2.setColor(Color.BLUE);
                y += 25;
            }
            x += 25;
            y = 300;

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

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        Point clicked = e.getPoint();
        //System.out.print(e); to find how to get the click count
        //System.out.print(e.getPoint());
        //System.out.println(e.getButton());
        //System.out.println(e.getClickCount());

        if (e.getClickCount() % 2 == 1) {

            if (button.contains(clicked)) {
               johnny.isDead();
            }
        }

        if (e.getClickCount() % 2 == 0) {

            if (button.contains(clicked)) {
                johnny.isAlive();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
