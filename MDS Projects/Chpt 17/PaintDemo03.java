
/**
 * DESCRIPTION  
 * Collect JFrame location to update mouse position.
 * 
 * 
 * REFACTORING
 * Priority:
 * replace values with constants 
 * 
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseListener;
import java.util.Date;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class PaintDemo03 extends JFrame implements MouseListener, Runnable {
    JPanel canvasJPanel;
    Point mousePoint;
    Point windowPoint;
    Thread theThread;

    int mousePressedPointX;
    int mousePressedPointY;
    int mouseReleasedPointX;
    int mouseReleasedPointY;
    int xOffset = -3;
    int yOffset = -63;

    private static final int PAUSE = 20;
    private static final int WINDOW_TOP_TITLE_SIZE = 25;

    boolean pressed;
    boolean released;

    // Controller
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse click: " + e.getX() + " " + e.getY());
        // mousePressedPointX = e.getX() + xOffset;
        // mousePressedPointY = e.getY() + yOffset;
        // mouseReleasedPointX = e.getX()+xOffset;
        // mouseReleasedPointY = e.getY()+yOffset;
        // drawPoint();
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered: " + e.getX() + " " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed: " + e.getX() + " " + e.getY());
        mousePressedPointX = e.getX() + xOffset;
        mousePressedPointY = e.getY() + yOffset;
        pressed = true;
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released: " + e.getX() + " " + e.getY());
        mouseReleasedPointX = e.getX() + xOffset;
        mouseReleasedPointY = e.getY() + yOffset;
        pressed = false;
    }
    
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited: " + e.getX() + " " + e.getY());
    }
    
    // View
    
    public void drawPoint() {
        Graphics g = canvasJPanel.getGraphics();
        mousePoint = MouseInfo.getPointerInfo().getLocation();
        g.fillRect((int) (mousePoint.getX() - windowPoint.getX()), (int) (mousePoint.getY() - windowPoint.getY()) - WINDOW_TOP_TITLE_SIZE, 3, 3);
    }

    
    // Model
    
    public PaintDemo03() {
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

        theThread = new Thread(this);
        theThread.start();
    }

    public void run() {
        Thread me = Thread.currentThread();
        while (me == theThread) {
            // System.out.println(new Date(System.currentTimeMillis()).toString());
            // System.out.println(MouseInfo.getPointerInfo().getLocation());
            // System.out.println(this.getLocation());
            windowPoint = this.getLocation();
            if (pressed) {
                drawPoint();
            }
            doNothing(PAUSE);
        }
    }

    public void doNothing(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Unexpected interupd");
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        PaintDemo03 m = new PaintDemo03();
        m.setVisible(true);
    }
}