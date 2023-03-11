
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ageInput;
        int oldest = 0;
        String nameOfOldest = "";
        String name;

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            ageInput = Integer.valueOf(parts[1]);
            name = parts[0];
            
            if (ageInput > oldest) {
                oldest = ageInput;
                nameOfOldest = name;
            }
        }

        System.out.println("Age of the oldest: " + oldest);
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}

