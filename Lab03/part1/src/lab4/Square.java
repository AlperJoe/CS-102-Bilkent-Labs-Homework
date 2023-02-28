package lab4;

/**
 * Alper Bozkurt
 */
public class Square extends Rectangle {

    //properties
    public int side;
    private boolean selected;

    //constructor
    public Square(int side){
        //inherit from rectangle
        super(side,side);
        this.side = side;

        selected = false;

        //make specific location
        x = 0;
        y = 0;

    }

    //getters and setters
    public int getSide() {return side;}

    public void setSide(int side) {this.side = getSide();}

    //methods
    //inherit getArea() from rectangle
    @Override
    public double getArea() {return super.getArea();}

    //check if the values are in the square
    public boolean contains(int x, int y){
        if(x < this.x || this.x > x + side ){
            if(this.y < y || this.y > y + side){
                return false;
            }
            return true;
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
        s1 = "Square's side: " + side + select;
        s2 = "Square's location is at " + "(" + x + "," + y + ")" + "\n" ;
        return s1 + s2;
    }
}
