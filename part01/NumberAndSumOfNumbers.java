/*
Write a program that asks the user for input until the user inputs 0.
After this the program prints the amount of numbers inputted and the
sum of the numbers. The number zero does not need to be added to the
sum, but adding it does not change the results.
*/
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if (userNum == 0) {
                break;
            }
            
            count = count + 1;
            sum = userNum + sum;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}

