import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyDemo extends JFrame implements KeyListener {
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("KeyPressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("KeyReleased: " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("KeyTyped: " + e.getKeyChar());
    }

    public KeyDemo() {
        super();
        setSize(600, 400);
        setTitle("Key Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
    }

    public static void main(String[] args) {
        KeyDemo keyDemo = new KeyDemo();
        keyDemo.setVisible(true);
    }
}
