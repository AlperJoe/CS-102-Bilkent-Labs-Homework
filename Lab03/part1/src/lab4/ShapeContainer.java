package lab4;

import java.util.ArrayList;

/**
 * Alper Bozkurt
 */
public class ShapeContainer {

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
                shapeHolder.get(i);
                System.out.println(shapeHolder.get(i));
            }
        }
        if(!findIt){
            System.out.println("No point in this point");
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
}
