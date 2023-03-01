/*
Write a program that reads an integer from the user
and prints the square of the given integer, i.e. the
integer multiplied by itself.
*/
import java.util.Scanner;

public class Squard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt;
        int squareOfInt;
        
        userInt = Integer.valueOf(scanner.nextLine());
        squareOfInt = userInt * userInt;
        System.out.println(squareOfInt);
        
        scanner.close();
    }
}
