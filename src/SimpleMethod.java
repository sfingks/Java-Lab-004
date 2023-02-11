/**
 * @author Trevor Hartman
 * @author MK Ripley
 *
 * @since Version 1.0
 * 2/10/2023
 **/
public class SimpleMethod {
public static void square(int x){
    int product = (x*x); //squares the input
    System.out.println(product); //prints the result
}
    public static void main(String[] args) {
        square(25); //calls the method
    }
}
