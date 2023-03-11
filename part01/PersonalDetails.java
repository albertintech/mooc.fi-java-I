
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        int longest = 0;
        double avg;
        String name = "";

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
            
            if (parts[0].length() > longest) {
                longest = parts[0].length();
                name = parts[0];
            }
        }
        avg = sum / (count * 1.0);
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);
    }
}
