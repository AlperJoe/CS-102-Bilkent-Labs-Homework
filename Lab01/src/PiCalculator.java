/**
 * Alper Bozkurt
 * 01_13.10.2021
 *
 */

import java.util.Scanner;

public class PiCalculator {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        //point for center of circle
        Point center = new Point(0,0);

        //point for corner of rectangle
        Point corner = new Point(-2,-2);

        //create rectangle object with appropriate values
        Rectangle rectangle = new Rectangle(4, 4, corner);
        Circle circle = new Circle(2, center);

        //take user input
        System.out.print("Number of trials: ");
        int input = scan.nextInt();

        //if random point is in the circle get hit and count them
        int hit = 0;
        for(int i = 0; i < input ; i++){
            Point randomPoint = rectangle.getRandomPoint();
            if(circle.contains(randomPoint)){
                hit++;
            }
        }

        //calculate hit consistency
        double hitConsistency;
        hitConsistency = 4 * (double) hit / (double) input;

        //display hit consistency
        System.out.println(hitConsistency);
    }
}