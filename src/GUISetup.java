import javax.swing.*;
import java.awt.*;

public class GUISetup extends JFrame
{
    // window variable
    private Container window;

    private int screenHeight = (int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    private int screenWidth = (int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth());

    private int sizeX = (screenWidth * 3) / 4;
    private int sizeY = (screenHeight * 3) / 4;

    //


    public void makeTheWindow()
    {
        window = getContentPane();
        window.setLayout(null);
        window.setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Seat Randomizer");
        setSize(sizeX, sizeY);
        setLocation(screenWidth / 2 - sizeX / 2, screenHeight / 2 - sizeY / 2);
        setResizable(false);
    }
}
