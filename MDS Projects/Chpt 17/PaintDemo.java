/**Refactoring
 * Priority:
 * replace values with constants 
 * 
 */


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseListener;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class PaintDemo extends JFrame implements MouseListener {

    JPanel canvasJPanel;
    int mousePressedPointX;
    int mousePressedPointY;
    int mouseReleasedPointX;
    int mouseReleasedPointY;
    int xOffset = -3;
    int yOffset = -33;

    // Controller
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse click: " + e.getX() + " " + e.getY());
        mousePressedPointX = e.getX()+xOffset;
        mousePressedPointY = e.getY()+yOffset;
        mouseReleasedPointX = e.getX()+xOffset;
        mouseReleasedPointY = e.getY()+yOffset;
        drawPoint();
    }
    
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered: " + e.getX() + " " + e.getY());
    }
    
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed: " + e.getX() + " " + e.getY());
        mousePressedPointX = e.getX()+xOffset;
        mousePressedPointY = e.getY()+yOffset;
        mouseReleasedPointX = e.getX()+xOffset;
        mouseReleasedPointY = e.getY()+yOffset;
        drawPoint();
    
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released: " + e.getX() + " " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited: " + e.getX() + " " + e.getY());
    }

    // View


    public PaintDemo() {
        super();
        setSize(600, 400);
        setTitle("Mouse Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mousePressedPointX = 0;
        mousePressedPointY = 0;
        mouseReleasedPointX = 0;
        mouseReleasedPointY = 0;
        canvasJPanel = new JPanel();
        add(canvasJPanel);
        addMouseListener(this);
    }

    public void drawPoint() {
        Graphics g = canvasJPanel.getGraphics();
        g.fillRect(mousePressedPointX, mousePressedPointY, 3, 3);
    }

    public void drawString() {

    }

    public static void main(String[] args) {
        PaintDemo m = new PaintDemo();
        m.setVisible(true);
    }
}
