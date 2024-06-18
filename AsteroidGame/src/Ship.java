import java.awt.*;


public class ship {
    private int x = 0;
    private int y = 0;
    private double angle = 90*Math.PI/180;
    private int frontX = (int)(x * Math.cos(angle)) - (int)(y * Math.sin(angle)) + 250 ;
    private int frontY = (int)(x * Math.sin(angle)) + (int)((y+5) * Math.cos(angle)) + 250;
    private int backRX = (int)((x+5) * Math.cos(angle)) - (int)((y+20) * Math.sin(angle)) + 250;
    private int backRY = (int)((x+5) * Math.sin(angle)) + (int)((y+20) * Math.cos(angle)) + 250;
    private int backLX = (int)((x-5) * Math.cos(angle)) - (int)((y+20) * Math.sin(angle)) + 250;
    private int backLY = (int)((x-5) * Math.sin(angle)) + (int)((y+20) * Math.cos(angle)) + 250;
    private int centerX = (int)(x * Math.cos(angle)) - (int)((y+17) * Math.sin(angle)) + 250;
    private int centerY = (int)(x * Math.sin(angle)) + (int)((y+17) * Math.cos(angle)) + 250;
    public void rotateLeft() {
        angle += 1;
        System.out.println("angle: " + angle);
    }
    public void rotateRight() {
        angle -= 1;
        System.out.println("angle: " + angle);

    }




    public void draw(Graphics g) {
        System.out.println("Front: (" + frontX + "," + frontY + ")");
        System.out.println("Back Right: (" + backRX + "," + backRY + ")");
        System.out.println("Back Left: (" + backLX + "," + backLY + ")");
        System.out.println("Center: (" + centerX + "," + centerY + ")");

        Font font = new Font("Arial", Font.BOLD, 5);
        g.setFont(font);
        // g.drawString("frontX", frontX, frontY);
        // g.drawString("backRX", backRX, backRY);
        // g.drawString("backLX", backLX, backLY);
        // g.drawString("centerX", centerX, centerY);
        System.out.println((int)(Math.cos(angle) * 15));
        g.setColor(Color.WHITE);
        g.drawLine(frontX,frontY,backRX,backRY);
        g.drawLine(frontX,frontY,backLX,backLY);
        g.drawLine(backLX,backLY,centerX,centerY);
        g.drawLine(centerX,centerY,backRX,backRY);
        // g.drawLine(250,255,245,270);
        // g.drawLine(250,255,255,270);
        // g.drawLine(245,270,250,267);
        // g.drawLine(250,267,255,270);
    //     private int frontX = x;
    // private int frontY = y+5;
    // private int backRX = x + 5;
    // private int backRY = y + 20;
    // private int backLX = x - 5;
    // private int backLY = y + 20;
    // private int centerX = x;
    // private int centerY = x+17;

    }
}