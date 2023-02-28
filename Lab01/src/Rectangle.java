/**
 * Alper Bozkurt
 * 01_13.10.2021
 *
 */
public class Rectangle {

    //represents the bottom-left point of rectangle
    public Point corner;
    public double width;
    public double height;


    public Rectangle(double width, double height, Point corner){
        this.width = width;
        this.height = height;
        this.corner = corner;
    }

    //getters
    public double getWidth(){return width;}
    public double getHeight(){return height;}
    public Point getCorner(){return corner;}

    //setters
    public void setWidth(){this.width = getWidth();}
    public void setHeight(){this.height = getHeight();}
    public void setCorner(){this.corner = getCorner();}

    //Returns true only if the point given as parameter is inside the rectangle
    public boolean contains(Point point){
        if(point.getX() < corner.getX() || point.getX() > corner.getX() + width ){
            if(point.getY() < corner.getX() || point.getY() > corner.getX() + height){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }

    //Creates and return a random point inside the rectangle
    public Point getRandomPoint(){
        double pointX = 0;
        double pointY = 0;

        pointX = -width/2 +(Math.random() * width);
        pointY = -height/2 +(Math.random() * height);
        Point point = new Point(pointX, pointY);

        return point;
    }

    //Returns a string that contains information about the rectangle
    public String toString(){
        String s;
        s = "Rectangle's corner is in: " + corner.getX() + ", " + corner.getY() +
                "Width: " + getWidth() + "Height: " + getHeight();

        return s;
    }
}
