// ************************************************************
//  TestWalk.java
//
//  Program to test methods in the RandomWalk class.
// ************************************************************

import java.util.Scanner;

public class TestWalk {

    public static void main(String[] args) {
        int maxSteps;
        int maxCoord;
        int x, y;

         	Scanner scan = new Scanner(System.in);

            // maximum number of steps in a walk
            // the maximum x and y coordinate
            // starting x and y coordinates for a walk
            System.out.print("Enter the boundary for the square: ");
            maxCoord = scan.nextInt();
            System.out.print("Enter the maximum number of steps: ");
            maxSteps = scan.nextInt();
            System.out.print("Enter the starting x and y coordinates with "
                    + "a space between: ");
            x = scan.nextInt();
            y = scan.nextInt();

            RandomWalk walk1 = new RandomWalk(5, 10);
            RandomWalk walk2 = new RandomWalk(maxCoord, maxSteps, x, y);

            System.out.println(walk1);
            System.out.println(walk2);

            for (int i = 0; i < 5; i++) {
                walk1.takeStep();
                System.out.println(walk1.toString());
                walk2.takeStep();
                System.out.println(walk2.toString());
                System.out.println("walk1 max distance: "+walk1.getMaxDistance());
                System.out.println("walk2 max distance: "+walk2.getMaxDistance());
            }
       

        //a statement to instantiate a RandomWalk object with a boundary of 10 and 200 as the maximum number of steps.
        RandomWalk walk3 = new RandomWalk(200, 10);
        // add a statement to have the object walk. Print the object after the walk
        walk3.walk();
        System.out.println(walk3);

    }
}
