import javax.swing.*;
import java.awt.*;

public class GUISetup extends JFrame
{
    // window variable
    private Container window;

    public void makeTheWindow()
    {
        window = getContentPane();
        window.setLayout(null);
        window.setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Seat Randomizer");
        int screenHeight = (int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        int screenWidth = (int)(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        setSize(800, 600);
        setLocation(screenWidth / 2 - 800 / 2, screenHeight / 2 - 800 / 2);
        setResizable(false);
    }
}
