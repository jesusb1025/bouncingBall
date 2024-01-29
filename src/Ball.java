import java.awt.*;

public class Ball {

    private int size;
    private Color color;
    private int speed;
    private int x,y;

    public Ball(int x, int y) {

    this.x = x;
    this.y = y;
    size = 10;
    color = Color.BLUE;
    speed = 5;

    }

    public void draw(Graphics g2){

        g2.setColor(color);
        g2.fillOval(x,y,size,size);

    }

    public void move(){
        x += speed;


    }

}
