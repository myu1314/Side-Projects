import javax.swing.*;

public class Asteroid extends JFrame {
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Atari");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setColor(0);
        JLabel label = new JLabel("Atari ©",0);
        label.setFont(label.getFont().deriveFont(10.0f));
        frame.add(label);
        frame.setVisible(true);
    }
}