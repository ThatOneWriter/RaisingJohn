import javax.swing.*;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private Thread windowThread;

    public MainFrame(String display) {
        super(display);
        int frameWidth = 1400;
        int frameHeight = 900;
        p = new DrawPanel();
        this.add(p);

        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(frameWidth, frameHeight);
        this.setLocation(500, 10);
        this.setVisible(true);
        startThread();
    }

    public void startThread() {
        windowThread = new Thread(this);
        windowThread.start();
    }

    public void run() {
        while (true) {
            p.repaint();
        }
    }
}
