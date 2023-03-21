
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String row = sc.nextLine();
            
            if (row.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(row);
            number = number * number * number;
            System.out.println(number);
        }
    }
}
