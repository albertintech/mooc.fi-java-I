
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ageInput;
        int oldest = 0;

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            ageInput = Integer.valueOf(parts[1]);
            if (ageInput > oldest) {
                oldest = ageInput;
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
