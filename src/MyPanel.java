import javax.swing.*;
import java.awt.*;
// Creating my own Panel class that inherits from JPanel
public class MyPanel extends JPanel
{
    int x = 80;// variable to control the x
    int xAdd = 1; // variable to control how far to move each time


    Ball[] balls = {myBall, myBall2, myBall3, myBall4, myBall5};
    Ball myBall;
    Ball myBall2;

    public MyPanel()
    {
        setPreferredSize(new Dimension(400,400));
        myBall = new Ball(200,300);
        myBall2 = new Ball(300,200);
    }

    // overriding the paintComponent method inherited
    // this method automatically gets called by JVM
    // Graphics class is in java.awt package
    protected void paintComponent(Graphics g)
    {
        // calling the paintComponent method I overroad
        super.paintComponent(g);

        setBackground(Color.BLACK);

//        g.setColor(Color.RED);
//        g.fillOval(x,40,20,20);
        myBall.draw(g);
        myBall.move();
        myBall2.draw(g);
        myBall2.move();

        // If the ball hits the right edge change what we add each time
        if(x >= 400)
            xAdd = -1;

        // update the location of the ball
        x = x + xAdd;

        // pause the program
        try
        {
            Thread.sleep(10);

        }
        catch(Exception blah)
        {
            System.out.println(blah.toString());
        }

        repaint(); // calls paintComponent again



    }



}

