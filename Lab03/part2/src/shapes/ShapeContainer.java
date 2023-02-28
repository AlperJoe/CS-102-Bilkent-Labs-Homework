package shapes;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * Alper Bozkurt
 */

public class ShapeContainer implements Iterable {

    //properties
    //hold sets of shapes
    private ArrayList<Shape> shapeHolder;

    //constructor
    public ShapeContainer(){
        shapeHolder = new ArrayList<Shape>();
    }

    //methods
    //add shape to the shape holder
    public void add(Shape s){
        shapeHolder.add(s);
    }

    //calculate all the shape's area in the shape holder list
    public double getArea(){
        int sum = 0;
        for(int i = 0; i < shapeHolder.size(); i++){
            sum += (shapeHolder.get(i).getArea());
        }
        return sum;
    }

    //Allow the user to find the first Shape that contains a given x, y point
    public void findFirstContains(int x, int y){
        //if it is the first shape contain given x,y
        boolean findIt = false;

        for(int i = 0; i < shapeHolder.size(); i ++ ){
            if(((Circle)shapeHolder.get(i)).contains(x,y)){
                findIt = true;
            }
        }
    }

    //remove all selected shape
    public void removeAllSelected(){
        boolean isThisRemoved = false;

        for(int i = 0; i < shapeHolder.size(); i++ ){
            if(((Circle)shapeHolder.get(i)).isSelected()){
                System.out.println(shapeHolder + "has been removed.");
                shapeHolder.remove(i);
                isThisRemoved = true;
            }
            else if(!isThisRemoved){
                System.out.println("There is no such a thing that you desired");
            }
        }
    }

    //string representation of shapes in the shape holder
    public String toString(){
        String s = null;
        for(int i = 0; i < shapeHolder.size(); i++){
            s += shapeHolder.get(i);
        }
        return s;
    }

    //Number of shapes in the container
    public int size(){return shapeHolder.size();}

    //Default iterator
    public Iterator <Shape> iterator() { return shapeHolder.iterator();}

    //returns the number of shapes found at the point x,y
    public int selectAllAt( int x, int y)
    {
        int counter = 0;

        for ( Shape s : shapeHolder )
        {
            if (((Circle)s).contains(x,y) == true)
            {
                ((Circle)s).setSelected( true);
                counter++;
            }
        }

        return counter;
    }

    // Method to remove all selected Shapes
    public void removeSelected()
    {
        ArrayList<Shape> newShapes = new ArrayList<Shape>();

        for ( Shape s : shapeHolder )
        {
            if (((Circle)s).isSelected() == false)
                newShapes.add( s);
        }
        shapeHolder = newShapes;
    }
}
