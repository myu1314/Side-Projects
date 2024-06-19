import javax.swing.*;

public class AsteroidGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Asteroid Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ship ship = new Ship();
        AsteroidPanel panel = new AsteroidPanel(ship);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        while (true) {
            ship.update();
            panel.panelPaint();
        }
    }
}