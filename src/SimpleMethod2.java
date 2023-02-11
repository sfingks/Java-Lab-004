/**
 * @author Trevor Hartman
 * @author MK Ripley
 *
 * @since Version 1.0
 * 2/10/2023
 **/

import java.util.Scanner;

    public class SimpleMethod2 {

        public static void square(double x) {
            double theRadians = (x*x); //squares the number
            System.out.println(theRadians); //prints the result
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Type the integer you want squared: "); //asks for user input
            double product = Double.valueOf(scanner.nextLine()); //scans for user input

            square(product); //runs the method for squaring the user input and printing
        }
    }