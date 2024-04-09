import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseDemo extends JFrame implements MouseListener
{

    
    public void mouseClicked (MouseEvent e)
    {
        System.out.println("Mouse click: "+ e.getX() + " " + e.getY());
    }
    public void mouseEntered(MouseEvent e) {System.out.println("Mouse Entered: "+ e.getX() + " " + e.getY());}
    public void mousePressed(MouseEvent e) {System.out.println("Mouse Pressed: "+ e.getX() + " " + e.getY());}
    public void mouseReleased(MouseEvent e) {System.out.println("Mouse Released: "+ e.getX() + " " + e.getY());}
    public void mouseExited(MouseEvent e) {System.out.println("Mouse Exited: "+ e.getX() + " " + e.getY());}

    public MouseDemo() 
    {
        super();
        setSize(600, 400);
        setTitle("Mouse Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseDemo m = new MouseDemo();
        m.setVisible(true);
    }
}