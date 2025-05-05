import javax.swing.JFrame;

public class MainFrame extends JFrame implements Runnable {

    private Thread windowThread;

    public MainFrame(String display) {
        super(display);
        startThread();
    }

    private void startThread() {
        windowThread = new Thread(this);
        windowThread.start();
    }

    @Override
    public void run() {
        
    }
}
