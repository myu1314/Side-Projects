import javax.swing.*;
import java.awt.*;

public class Asteroid extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        Font font = new Font("Courier New", 0, 20);
        g.setFont(font);
        g.setColor(Color.WHITE);
        
        // Draw the text
        String text = "Atari ©";
        int x = 200;
        int y = 400;
        g.drawString(text, x, y);
        
        drawShip(g);
    }
    public void drawShip(Graphics g){
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 30;
        g.setColor(Color.white);
        g.fillOval(centerX - radius, centerY - radius, 1 * radius, 1 * radius);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Asteroid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Asteroid panel = new Asteroid();
        frame.add(panel);
        
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}

/*
Checklist
-----------------
-Make Text
-Change Background
-Make Space Ship
  - Draw circle first and move that around
  - Change into space ship
-Make Asteroids


*/