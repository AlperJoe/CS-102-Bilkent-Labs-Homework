import javax.swing.*;
import java.awt.*;

/**
 * Alper Bozkurt
 */

public class Lab04_Part2 extends JFrame{
    public Lab04_Part2()
    {
        // Initialise main frame
        setTitle( "Lab04b Balloons Game");
        setLayout( new FlowLayout());
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        add( new BalloonsGamePanel());
        setVisible( true);
    }

    public static void main( String[] args)
    {
        // Start frame/game
        new Lab04_Part2();
    }
}
