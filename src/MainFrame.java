import javax.swing.*;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private Thread windowThread;
    private JButton b;


    public MainFrame(String display) {
        super(display);
        int frameWidth = 800;
        int frameHeight = 800;
        p = new DrawPanel();
        JPanel panel = new JPanel();
        b = new JButton();
        this.add(panel);
        panel.add(b);
        this.add(p);
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
