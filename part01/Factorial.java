
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 1;
        int factorial = 1;
        
        System.out.println("Give a number: ");
        int userNum = Integer.valueOf(scanner.nextLine());
        
        while (count <= userNum) {
            
            factorial *= count;
            count++;
        }
        System.out.println("Factorial: " + factorial);
        scanner.close();
    }
}
