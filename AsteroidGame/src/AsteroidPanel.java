import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AsteroidPanel extends JPanel implements KeyListener { // This is your view and controller, they can be seperated.
    public Ship ship;
    public int screenHeight;
    public int screenWidth;
    public AsteroidPanel(Ship ship) {
        setPreferredSize(new Dimension(500, 500));                
        setBackground(Color.BLACK);
        this.ship = ship;
        setFocusable(true);
        addKeyListener(this);
    }

    // view
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font font = new Font("Courier New", Font.BOLD, 12);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth("Atari ©");
        int textHeight = fm.getHeight();
        int centerX = (getWidth() - textWidth) / 2;
        int centerY = (getHeight() - textHeight + 300) / 2 + fm.getAscent();
        
        screenHeight = getHeight();
        screenWidth = getWidth();

        g.setColor(Color.WHITE);
        g.drawString("Atari ©", centerX, centerY);
        ship.draw(g);
        
    }
    public int returnHeight(){
        return screenHeight;
    }
    public int returnWidth(){
        return screenWidth;
    }
    



    // controller
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_A:
                ship.rotateLeft();
                
                break;
            case KeyEvent.VK_D:
                ship.rotateRight();
                
                break;
            case KeyEvent.VK_W:
                ship.accelerateForward();
                
                break;
            // case KeyEvent.VK_S:
            //     ship.move();
            //     break;
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Unused method
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Unused method
    }

    public void panelPaint(){
        repaint();
    }
}