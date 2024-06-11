import java.awt.*;
import java.Graphics2D;
import java.Graphics;

public class ship {
    private int x;
    private int y;
    private int dx; //delta x
    private int dy;
    private int angle;

    public ship(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void rotateLeft(Graphics g) {
        if(rotation < 360){
            rotation += 5;
        }
        repaint();
    }
    public void rotateRight() {
        angle -= 1;

    }

    public void accelerate(){ 
        dx += Math.cos(angle)*1; // 1 is the force (thurster amount)
        dy += -Math.sin(angle)*1; // negative due to java having a flipped y axis, maybe???
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 10, 10);
    }
}