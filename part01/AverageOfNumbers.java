/*
Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the numbers. The number
zero does not need to be counted to the average. You may assume that
the user inputs at least one number.
*/
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double avg = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if (userNum == 0) {
                break;
            }
            
            count = count + 1;
            sum = userNum + sum;
            avg = (sum / (count * 1.0));
        }
        System.out.println("Average of the numbers: " + avg);
        scanner.close();
    }
}
