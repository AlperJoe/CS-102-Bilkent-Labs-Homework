/**
 * Alper Bozkurt
 * 01_13.10.2021
 *
 */
public class Circle {

    //represent center of the circle
    private Point center;
    //radius of a circle
    private double radius;


    //constructor to initialize variables
    public Circle(double radius, Point center){
        this.radius = radius;
        this.center = center;
    }

    //getters
    public Point getCenter(){return center;}
    public double getRadius(){return radius;}

    //setters
    public void setCenter(){this.center = getCenter();}
    public void setRadius(){this.radius = getRadius();}

    //Returns true only if the point given as parameter is inside the circle
    public boolean contains(Point point){

        double distance = Math.sqrt(Math.pow(Math.abs(point.getX() - center.getX()),2)
        + Math.pow(Math.abs(point.getY() - center.getY()),2));

        if(distance <= getRadius()){
            return true;
        }
        else{
            return false;
        }
    }
    //Returns a string that contains information about the circle.
    public String toString(){
        String s;
        s = "Circle's center is at " + getCenter().getX() + ", " + getCenter().getY()
                + "Circle's radius is " + getRadius();
        return s;
    }
}
