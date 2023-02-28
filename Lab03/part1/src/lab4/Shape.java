package lab4;

/**
 * Alper Bozkurt
 */
abstract class Shape implements Locatable{

    //properties
    public int x,y;

    //constructor
    public Shape(){
        x = 0;
        y = 0;
    }

    //abstract methods
    public abstract double getArea();
    public int getX(){return x;}
    public int getY(){return y;}
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

}
