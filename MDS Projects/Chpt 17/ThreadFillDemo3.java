import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;


public class ThreadFillDemo3 extends JFrame implements ActionListener, Runnable
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final int FILL_WIDTH = 300;
    public static final int FILL_HEIGHT = 100;
    public static final int CIRCLE_SIZE = 10;
    public static final int PAUSE = 100;
    private JPanel box;

    public static void main(String[] args) throws Exception {
        ThreadFillDemo3 gui = new ThreadFillDemo3();
        gui.setVisible(true);
    }
    public ThreadFillDemo3() {
        setSize(WIDTH, HEIGHT);
        setTitle("Threaded Fill Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        box = new JPanel();
        add(box, "Center");
        JPanel buttoPanel = new JPanel();
        buttoPanel.setLayout((new FlowLayout()));
        JButton startButton = new JButton("Start");
        startButton.addActionListener(this);
        buttoPanel.add(startButton);
        add(buttoPanel, "South");
    }
    public void actionPerformed(ActionEvent e)
    {
        startThread();
    }
    public void run()
    {
        Graphics g = box.getGraphics();
        for (int y = 0; y < FILL_HEIGHT; y = y + CIRCLE_SIZE) {
            for (int x = 0; x < FILL_WIDTH; x = x + CIRCLE_SIZE) {
                g.setColor(Color.RED);
                g.drawLine(x, y, x*2, y*2); //(x, y, x*x, y*y, rootPaneCheckingEnabled); //fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
                doNothing(PAUSE);
            }
        }
        System.out.println(new Date(System.currentTimeMillis()).toString());

    }
    public void startThread()
    {
        Thread theThread = new Thread(this);
        theThread.start();
    }
    public void doNothing(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e)
        {
            System.out.println("Unexpected interrupt");
            System.exit(0);
        }
    }
}
