import java.awt.*;


public class Ship {
    private int x = 0;
    private int y = 0;
    private double angle = 0;
    private int frontX = 0;
    private int frontY = 0;
    private int backRX = 0;
    private int backRY = 0;
    private int backLX = 0;
    private int backLY = 0;
    private int centerX = 0;
    private int centerY = 0;
    private double acceleration = 0;
    public void rotateLeft() {
        angle += 10*Math.PI/180;
        System.out.println("angle: " + angle);
    }
    public void rotateRight() {
        angle -= 10*Math.PI/180;
        System.out.println("angle: " + angle);
    }
    public void accelerateForward(){
        acceleration = 1;
    }
    public void move(){
        acceleration -= acceleration * 1/9;
        //System.out.println(acceleration * Math.cos(angle));
        x += (int)(acceleration * Math.sin(angle));
        y -= (int)(acceleration * Math.cos(angle));

    }

    public void update()
    {
        
        this.setVerticies();
        this.move();
    }
    public int findCenterX(){
        int centerOfTX = (int)(frontX + backLX + backRX)/3;
        return centerOfTX;
    }
    public int findCenterY(){
        int centerOfTY = (int)(frontY + backLY + backRY)/3;
        return centerOfTY;
    }

    public void setVerticies(){
        int centerOfTX = findCenterX();
        int centerOfTY = findCenterY();
        frontX = (int)((x * Math.cos(angle)) - ((y-8) * Math.sin(angle))) + 250;
        frontY = (int)((x * Math.sin(angle)) + ((y-8) * Math.cos(angle))) + 250;
        backRX = (int)(((x+5) * Math.cos(angle)) - ((y+8) * Math.sin(angle))) + 250;
        backRY = (int) (((x+5) * Math.sin(angle)) + ((y+8) * Math.cos(angle))) + 250;
        backLX = (int)(((x-5) * Math.cos(angle)) - ((y+8) * Math.sin(angle))) + 250;
        backLY = (int)(((x-5) * Math.sin(angle)) + (y+8) * Math.cos(angle)) + 250;
        centerX = (int)((x * Math.cos(angle)) - (y+5) * Math.sin(angle)) + 250;
        centerY = (int)((x * Math.sin(angle)) + (y+5) * Math.cos(angle)) + 250;
        
        // System.out.println("Center point: (" + centerOfTX + "," + centerOfTY + ")");
        // frontX = (int)(((x - centerOfTX) * Math.cos(angle)) - (((y - centerOfTY)-8) * Math.sin(angle))) + centerOfTX;
        // frontY = (int)(((x- centerOfTX) * Math.sin(angle)) + (((y - centerOfTY)-8) * Math.cos(angle))) + centerOfTY;
        // System.out.println("Center point: (" + centerOfTX + "," + centerOfTY + ")");
        // backRX = (int)(((x- centerOfTX+5) * Math.cos(angle)) - (((y - centerOfTY)+8) * Math.sin(angle))) + centerOfTX;
        // backRY = (int) (((x - centerOfTX+5) * Math.sin(angle)) + ((y - centerOfTY)+8) * Math.cos(angle)) + centerOfTY;
        // System.out.println("Center point: (" + centerOfTX + "," + centerOfTY + ")");
        // backLX = (int)(((x- centerOfTX-5) * Math.cos(angle)) - ((y- centerOfTY+8) * Math.sin(angle))) + centerOfTX;
        // backLY = (int)(((x - centerOfTX-5) * Math.sin(angle)) + ((y - centerOfTY+8)) * Math.cos(angle)) + centerOfTY;
        // System.out.println("Center point: (" + centerOfTX + "," + centerOfTY + ")");
        // centerX = (int)(((x - centerOfTX) * Math.cos(angle)) - (y - centerOfTY+5) * Math.sin(angle)) + centerOfTX;
        // centerY = (int)(((x - centerOfTX) * Math.sin(angle)) + (y - centerOfTY+5) * Math.cos(angle)) + centerOfTY;
        // System.out.println("Center point: (" + centerOfTX + "," + centerOfTY + ")");
        


        // frontX = (int)(((frontX - centerOfTX) * Math.cos(angle)) - (((frontY - centerOfTY)-8) * Math.sin(angle))) + 250;
        // frontY = (int)(((frontX - centerOfTX) * Math.sin(angle)) + (((frontY - centerOfTY)-8) * Math.cos(angle))) + 250;
        // backRX = (int)((((frontX - centerOfTX)+5) * Math.cos(angle)) - (((frontY - centerOfTY)+8) * Math.sin(angle))) + 250;
        // backRY = (int) ((((frontX - centerOfTX)+5) * Math.sin(angle)) + (((frontY - centerOfTY)+8) * Math.cos(angle))) + 250;
        // backLX = (int)((((frontX - centerOfTX)-5) * Math.cos(angle)) - (((frontY - centerOfTY)+8) * Math.sin(angle))) + 250;
        // backLY = (int)((((frontX - centerOfTX)-5) * Math.sin(angle)) + ((frontY - centerOfTY)+8) * Math.cos(angle)) + 250;
        // centerX = (int)(((frontX - centerOfTX) * Math.cos(angle)) - ((frontY - centerOfTY)+5) * Math.sin(angle)) + 250;
        // centerY = (int)(((frontX - centerOfTX) * Math.sin(angle)) + ((frontY - centerOfTY)+5) * Math.cos(angle)) + 250;

    }



    public void draw(Graphics g) {
        
        
        

        Font font = new Font("Arial", Font.BOLD, 5);
        g.setFont(font);
        // g.drawString("frontX", frontX, frontY);
        // g.drawString("backRX", backRX, backRY);
        // g.drawString("backLX", backLX, backLY);
        // g.drawString("centerX", centerX, centerY);
       // System.out.println((int)(Math.cos(angle) * 15));
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
    // frontX = (int)((x * Math.cos(angle)) - (y * Math.sin(angle))) + 250 ;
    //     frontY = (int)((x * Math.sin(angle)) + ((y+5) * Math.cos(angle))) + 250;
    //     backRX = (int)(((x+5) * Math.cos(angle)) - ((y+20) * Math.sin(angle))) + 250;
    //     backRY = (int) (((x+5) * Math.sin(angle)) + ((y+20) * Math.cos(angle))) + 250;
    //     backLX = (int)(((x-5) * Math.cos(angle)) - ((y+20) * Math.sin(angle))) + 250;
    //     backLY = (int)(((x-5) * Math.sin(angle)) + (y+20) * Math.cos(angle)) + 250;
    //     centerX = (int)((x * Math.cos(angle)) - (y+17) * Math.sin(angle)) + 250;
        // centerY = (int)((x * Math.sin(angle)) + (y+17) * Math.cos(angle)) + 250;

        // frontX = (int)((x * Math.cos(angle)) - ((y-8) * Math.sin(angle))) + 250;
        // frontY = (int)((x * Math.sin(angle)) + ((y-8) * Math.cos(angle))) + 250;
        // backRX = (int)(((x+5) * Math.cos(angle)) - ((y+8) * Math.sin(angle))) + 250;
        // backRY = (int) (((x+5) * Math.sin(angle)) + ((y+8) * Math.cos(angle))) + 250;
        // backLX = (int)(((x-5) * Math.cos(angle)) - ((y+8) * Math.sin(angle))) + 250;
        // backLY = (int)(((x-5) * Math.sin(angle)) + (y+8) * Math.cos(angle)) + 250;
        // centerX = (int)((x * Math.cos(angle)) - (y+5) * Math.sin(angle)) + 250;
        // centerY = (int)((x * Math.sin(angle)) + (y+5) * Math.cos(angle)) + 250;

    }
}