package shapes;

/**
 * Alper Bozkurt
 */
public class Rectangle extends Shape{

    //properties
    private int width;
    private int height;

    private boolean selected;
    public int x;
    public int y;

    //constructors
    public Rectangle( int width, int height){

        this.height = height;
        this.width = width;

        selected = false;

        //make specific location
        x = 0;
        y = 0;
    }

    //getters and setters
    public int getHeight() { return height;}
    public int getWidth() { return width; }
    public boolean isSelected() {return selected;}

    public void setHeight(int height) {this.height = getHeight();}
    public void setWidth(int width) {this.width = getWidth();}
    public void setSelected(boolean selected) {this.selected = selected;}

    //methods

    @Override
    public double getArea() {return width * height;}

    @Override
    public void setLocation(int x, int y) {super.setLocation(x, y);}

    //Returns true only if the point given as parameter is inside the rectangle
    public boolean contains(int x, int y){
        if(x < this.x || this.x > x + width ){
            if(this.y < y || this.x > x + height){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }

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

        s1 = "Rectangle's width: " + getWidth()+ "\n" + "Rectangle's height: " + getHeight();
        s2 = select + "Rectangle' location is at " + "(" + x + "," + y + ")";

        return s1 + s2;
    }
}
