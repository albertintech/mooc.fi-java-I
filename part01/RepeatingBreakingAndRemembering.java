
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int userNum = 0;
        int sum = 0;
        int count = -1;
        double avg = 0;
        
        System.out.println("Give numbers:");
        
        while (userNum != -1) {
            sum = userNum + sum;
            System.out.println(sum);
            count++;
            System.out.println(count);
            userNum = Integer.valueOf(scanner.nextLine());
        }
        
        avg = sum/(count * 1.0);
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        scanner.close();
    }
}
