
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // username: alex; password: sunshine
        // username: emma; password: haskell
        
        System.out.println("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter password: ");
        String userPassword = scanner.nextLine();
        
        if (userName.equals("alex") && userPassword.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (userName.equals("emma") && userPassword.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
