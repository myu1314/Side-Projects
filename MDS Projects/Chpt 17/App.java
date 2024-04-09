import java.awt.*; 
import java.awt.event.*;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class App extends JApplet {
   public void init() {
      setBackground(Color.white);
      setForeground(Color.white);
   }
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      g2.setPaint(Color.gray);
      int x = 5;
      int y = 7;
      drawX(g2, x, y);
      drawX(g2, 50, 30);
      drawX(g2, 20, 60);

      g2.drawString("Line", x, 250);
    }
    
   void drawX(Graphics2D g2, int xTopLeftCorner, int yTopLeftCorner)
   {
       g2.draw(new Line2D.Double(xTopLeftCorner, yTopLeftCorner, xTopLeftCorner+200, yTopLeftCorner+200));
       g2.draw(new Line2D.Double(xTopLeftCorner, yTopLeftCorner+200, xTopLeftCorner+200, yTopLeftCorner));

   }
   public static void main(String s[]) {
      JFrame f = new JFrame("Line");
      f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      JApplet applet = new App();
      f.getContentPane().add("Center", applet);
      applet.init();
      
      f.pack();
      f.setSize(new Dimension(300, 300));
      f.setVisible(true);
   }
}