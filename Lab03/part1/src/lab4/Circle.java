package lab4;

/**
 * Alper Bozkurt
 */
public class Circle extends Shape{

    //properties
    private int radius;
    private boolean selected;

    //constructor
    public Circle(int radius){
        this.radius = radius;

        selected = false;

        //make specific location
        x = 0;
        y = 0;
    }

    //getters and setters
    public int getRadius() {return radius;}
    public boolean isSelected(){return selected;}

    public void setRadius(int radius) {this.radius = getRadius();}
    public void setSelected(boolean selected) {this.selected = isSelected();}

    //methods

    @Override
    public double getArea() {return Math.PI * radius * radius;}

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }

    //check the given point is in the circle
    public boolean contains(int x, int y){

        double distance = Math.sqrt(Math.pow(Math.abs(this.x - x),2)
                + Math.pow(Math.abs(this.y - y),2));

        if(distance <= getRadius()){
            return true;
        }
        return false;
    }

    //Returns a string that contains information about the circle.
    public String toString(){
        String s1,s2;
        String select;

        //indicate if it is selected
        if(isSelected()){
            select = "Selected";
        }
        else{
            select = "Unselected";
        }

        s1 = "Circle's radius is " + getRadius() + select;
        s2 = "Circle's location is at " + getX() + "," + getY()  + "\n";

        return s1 + s2;
    }
}
