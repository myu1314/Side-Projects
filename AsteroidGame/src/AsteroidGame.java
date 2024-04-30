import javax.swing.*;

public class AsteroidGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Asteroid Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AsteroidPanel panel = new AsteroidPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}