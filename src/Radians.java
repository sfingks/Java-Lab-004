/**
 * @author Trevor Hartman
 * @author MK Ripley
 *
 * @since Version 1.0
 * 2/10/2023
 **/

import java.util.Scanner;

public class Radians {

    public static void toRadians(double degrees) {
    double theRadians = (degrees*Math.PI/180); //does the conversion from degrees to radians
        System.out.println(theRadians); //outputs the result
    }

    public static void toDegrees(double radians) {
        double theDegrees = (radians*180/Math.PI); //does the conversion from radians to degrees
        System.out.println(theDegrees); //outputs the result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        toRadians(degrees); //runs the method for computing degrees to radians and printing
        System.out.println(Math.toRadians(degrees)); //redundantly computes and prints with Math and System.out instead

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        toDegrees(radians); //runs the method for computing radians to degrees and printing
        System.out.println(Math.toDegrees(radians)); //redundantly computes and prints with Math and System.out instead
    }
}
