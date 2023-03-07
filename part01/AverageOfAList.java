
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList();
        
        while (true) {
            int userNum = Integer.valueOf(scanner.nextLine());
            if (userNum == -1) {
                break;
            }
            
            list.add(userNum);
        }
        
        int sum = 0;
        int count = 0;
        double avg;
        for (Integer number: list) {
            sum += number;
            count++;
        }
        
        avg = sum / (count * 1.0);
        
        System.out.println("Average: " + avg);

    }
}
