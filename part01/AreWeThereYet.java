/*
Write a program, according to the preceding example, that asks
the user to input values until they input the value 4.
*/

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput = 1;
        
        while (userInput != 4) {
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());
        }
        
        scanner.close();

    }
}
