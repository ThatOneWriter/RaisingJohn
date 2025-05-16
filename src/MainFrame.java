import javax.swing.*;
import java.util.Timer;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private Thread windowThread;
    private Johnny j;
    private int count = 2;

    public MainFrame(String display) {
        super(display);
        int n = 2;
        int frameWidth = 800;
        int frameHeight = 800;
        p = new DrawPanel();
        j = new Johnny();
        this.addKeyListener(p);
        this.add(p);
        this.add(j);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello.");
        panel.add(label);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(frameWidth, frameHeight);
        this.setLocation(500, 10);
        this.setVisible(true);
        startThread();
        if (count > 2) {
            label.getSize();
            n *= 2;
            count = 0;
        }


    }

    public void startThread() {
        windowThread = new Thread(this);
        windowThread.start();
    }

    public void run() {
        while (true) {
            p.repaint();
            count++;
            System.out.println(count);
        }
    }
}
