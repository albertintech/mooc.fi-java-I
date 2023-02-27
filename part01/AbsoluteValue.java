/*
Write a program that reads an integer from the user.
If the number is less than 0, the program prints the
given integer multiplied by -1. In all other cases,
the program prints the number itself. 
*/
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInt = Integer.valueOf(scanner.nextLine());
        
        if (userInt < 0) {
            System.out.println(userInt * -1);
        } else {
            System.out.println(userInt);
        }
        
        scanner.close();
    }
}
