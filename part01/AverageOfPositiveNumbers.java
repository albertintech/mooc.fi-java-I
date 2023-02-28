/*
Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the numbers. The number
zero does not need to be counted to the average. You may assume that
the user inputs at least one number.
*/
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        double avg = 0;
        
        while(true) {
            //System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else if (number > 0){
                total += number;
                count++;
            } else {
                continue;
            }
        }
        
        avg = (total / (count * 1.0));
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg);
        }
    }
}
