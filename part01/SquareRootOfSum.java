//Write a program that reads two integers from the
//user and prints the square root of the sum of these
//integers. The program does not need to work with
//negative values.

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt1;
        int userInt2;
        double squareRoot;
        
        userInt1 = Integer.valueOf(scanner.nextLine());
        userInt2 = Integer.valueOf(scanner.nextLine());
        squareRoot = Math.sqrt(userInt1 + userInt2);
        System.out.println(squareRoot);
        scanner.close();
    }
}
