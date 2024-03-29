
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
