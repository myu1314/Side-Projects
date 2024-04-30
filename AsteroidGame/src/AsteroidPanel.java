import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AsteroidPanel extends JPanel implements KeyListener {
    private ship ship;

    public AsteroidPanel() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);
        ship = new ship(250, 250);
        setFocusable(true);
        addKeyListener(this);
    }

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
        g.setColor(Color.WHITE);
        g.drawString("Atari ©", centerX, centerY);
        ship.draw(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_A:
                ship.move(-5, 0);
                break;
            case KeyEvent.VK_D:
                ship.move(5, 0);
                break;
            case KeyEvent.VK_W:
                ship.move(0, -5);
                break;
            case KeyEvent.VK_S:
                ship.move(0, 5);
                break;
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