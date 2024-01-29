
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//1 Create a frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,300);

//2 Create a panel
        MyPanel panel = new MyPanel();
        panel.setBackground(new Color(255, 0,0)); // create your own color
        panel.setBackground(Color.ORANGE); // or use a preset color

//3 Add components to the panel



//4 Add the panel to the frame
        myFrame.add(panel);

//5 Display the frame
        myFrame.setVisible(true);

    }
}