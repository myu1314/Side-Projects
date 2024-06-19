import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AsteroidPanel extends JPanel implements KeyListener { // This is your view and controller, they can be seperated.
    private ship ship;
    public int screenHeight;
    public int screenWidth;
    public AsteroidPanel() {
        setPreferredSize(new Dimension(500, 500));                
        setBackground(Color.BLACK);
        ship = new ship();
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
                repaint();
                break;
            case KeyEvent.VK_D:
                ship.rotateRight();
                repaint();
                break;
            case KeyEvent.VK_W:
                //ship.move();
                break;
            // case KeyEvent.VK_S:
            //     ship.move();
            //     break;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Unused method
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Unused method
    }
}