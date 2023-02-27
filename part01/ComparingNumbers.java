/*
Write a program that reads two integers from the user.
If the first number is greater than the second, the
program prints "(first) is greater than (second)." If
the first number is less than the second, the program
prints "(first) is smaller than (second)." Otherwise,
the program prints "(first) is equal to (second)." The
(first) and (second) should always be replaced with the
actual numbers that were provided by the user.
*/
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
           
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());
        
        if (first > second) {
            System.out.println(first + " is greater than " + second + ".");
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second + ".");
        } else {
            System.out.println(first + " is equal to " + second + ".");
        }
        
        reader.close();
    }
}
