import javax.swing.*;

public class MainFrame extends JFrame implements Runnable {

    private DrawPanel p;
    private Thread windowThread;
    private JButton b;
    private Johnny john;

    public MainFrame(String display) {
        super(display);

        int frameWidth = 800;
        int frameHeight = 800;
        p = new DrawPanel();
        john = new Johnny();

        this.addKeyListener(p);
        this.add(p);
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("images/cardboardknife.png");
        JLabel label = new JLabel(image);

        b = new JButton();
        b.setSize(100, 100);
        this.add(label);
        this.add(panel);
        panel.add(b);
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
