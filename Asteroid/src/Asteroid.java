import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
public class Asteroid extends JFrame {
    public static void main(String[] args){

        JFrame frame = new JFrame("Atari");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.GREEN);
        JLabel label = new JLabel("Atari ©");
        label.setFont(label.getFont().deriveFont(20.0f));
        frame.add(label);
        frame.setVisible(true);
    }
}