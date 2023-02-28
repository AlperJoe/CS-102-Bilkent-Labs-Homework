/**
 *
 * Alper Bozkurt
 * 01_13.10.2021
 *
 */

//constructor that takes x and y coordinates to initialize
public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //getters
    public double getX(){return x;}
    public double getY(){return y;}

    //setters
    public void setX(){this.x = getX();}
    public void setY(){this.y = getY();}


    public String toString(){
        String s;
        s = String.valueOf(x) + " " + String.valueOf(y);
        return s;
    }


}
