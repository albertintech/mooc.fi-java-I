/*
Implement a program, which calculates the sum 1+2+3+...+n where
n is given as user input.
*/

import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for (int i = 0; i <= lastNum; i++) {
            sum = i + sum;
        }
        
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
