import shapes.*;
import java.awt.*;

/**
 * Alper Bozkurt
 */
public class Balloon extends Circle implements Drawable{

    //constants
    public static final int MAX_SIZE = 100;
    public static final int INCREASE = 1;

    //constructor
    public Balloon(int x, int y){
        super(25);
        setLocation(x,y);
    }
    // Method to draw a balloon
    @Override
    public void draw( Graphics g)
    {
        int r = getRadius();
        g.drawOval( getX() - r, getY() - r, r * 2, r * 2);
    }

    // Method to grow a balloon
    public boolean grow()
    {
        //increase the radius of balloon
        setRadius( getRadius() + INCREASE);

        if (getRadius() >= MAX_SIZE)
        {
            //point the circle should be selected
            setSelected(true);
            //radius set to the zero
            setRadius(0);
        }

        return getRadius() != 0;
    }
}
