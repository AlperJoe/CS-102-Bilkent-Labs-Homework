package lab4;

import java.util.Scanner;
/**
 * Alper Bozkurt
 */

public class ShapeTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //properties
        boolean must = false;
        String choice;
        String shapeChoice;
        int width,height,radius,side;
        ShapeContainer shapeHolder = null;
        int x,y;

        Circle circle;
        Rectangle rectangle;
        Square square;



        do {
            //allow user to create an empty set of shapes
            System.out.println("1 - Create an empty set of shapes");

            //add many circle,rectangle and square shapes to the list as user wish
            System.out.println("2 - Add a circle, rectangle or triangle");

            //compute & print out the total surface area of the entire set of shapes
            System.out.println("3 - Compute & print out the total surface area");

            //calling the toString() method for print out information about all of the shapes
            System.out.println("4 - Display the shapes in the list");

            //allow user to find the first shape
            System.out.println("5 - Find the first shape that contains a given x,y");

            //remove all selected shapes
            System.out.println("6 - Removes all selected shapes");

            //To finish the program
            System.out.println("7 - EXIT");

            System.out.println();

            System.out.print("Choose an option: ");
            choice = scan.next();

            System.out.println();

            //user must start with creating a list
            if(!choice.equals("1") && !must){
                System.out.println("!!Create an empty container first!!");
                System.out.println();

            }

            else{
                //create an empty list for shapes
                if(choice.equals("1") ){
                    shapeHolder = new ShapeContainer();
                    System.out.println("You have empty container");
                    System.out.println();
                    must = true;
                }

                //user add shapes to the list
                else if (choice.equals("2")){
                    System.out.println("1 - Circle" + "\n" + "2 - Rectangle "  + " \n" + "3 - Square");
                    System.out.print("Make your choice to add: ");
                    shapeChoice = scan.next();
                    System.out.println();

                    //add a circle to the list with a specific radius from user's input
                    if(shapeChoice.equals("1")){
                        System.out.print("Enter the radius: ");
                        radius = scan.nextInt();

                        //new circle as user's want add to the list
                        circle = new Circle(radius);
                        shapeHolder.add(circle);
                    }

                    //add a rectangle to the list with specific width and height from user's input
                    else if(shapeChoice.equals("2")){
                        System.out.print("Enter width: ");
                        width = scan.nextInt();
                        System.out.print("Enter height: ");
                        height = scan.nextInt();

                        //new rectangle as user's want add to the list
                        rectangle = new Rectangle(width,height);
                        shapeHolder.add(rectangle);
                    }

                    //add a square to the list with specific side from user's input
                    else if(shapeChoice.equals("3")){
                        System.out.print("Enter side: ");
                        side = scan.nextInt();

                        //new square as user's want add to the list
                        square = new Square(side);
                        shapeHolder.add(square);
                    }
                    else{

                        //error message to user only if not choosing circle rectangle or square
                        System.out.println("Pick Circle, Rectangle or Square");
                    }
                }

                //calculate total area of all shapes with getArea() method
                else if(choice.equals("3")){
                    System.out.println();
                    System.out.println("Total surface area: " + shapeHolder.getArea());
                    System.out.println();
                }

                //representation of all shapes in the list
                else if(choice.equals("4")){
                    System.out.println(shapeHolder.toString());
                }

                else if(choice.equals("5")){
                    System.out.println("Enter x: ");
                    x = scan.nextInt();
                    y = scan.nextInt();
                    shapeHolder.findFirstContains(x,y);
                }
                else if(choice.equals("6")){
                    shapeHolder.removeAllSelected();
                }
            }

        //exit from the code
        }while(!choice.equals("7"));
    }

    //Experiment: comment out the getArea() method of the Circle class
    //Experiment:  make the Circle class abstract
    //Experiment: creating an instance of the (now abstract) Circle class to add to the shapes collection.
}

