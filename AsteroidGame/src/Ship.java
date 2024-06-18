import java.awt.*;


public class ship {
    private int x = 250;
    private int y = 250;
    private int dx; //delta x
    private int dy;
    private double angle = 0;
    private int frontX = (Math.cos(angle) * 5); 
    private int frontY = y + Math.sin(angle) * 5;
    private int backRX = 0;
    private int backRY = 0;
    private int backLX = 0;
    private int backLY = 0;
    private int centerX = 0;
    private int centerY = 0;

    public ship(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void rotateLeft() {
        angle += 1;
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
        g.drawLine(frontX,frontY,backLX,backLY);
        g.drawLine(frontX,frontY,backRX,backRY);
        g.drawLine(backLX,backLY,centerX,centerY);
        g.drawLine(centerX,centerY,backRX,backRY);
        // g.drawLine(250,250,245,265);
        // g.drawLine(250,250,255,265);
        // g.drawLine(245,265,250,262);
        // g.drawLine(250,262,255,265);

    }
}