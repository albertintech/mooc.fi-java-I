import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        Double gift = Double.valueOf(scan.nextLine());

        if (gift < 5_000) {
            System.out.println("No tax!");
        } else if (gift < 25_000) {
            System.out.println("Tax: " + (100 + (gift - 5_000) * 0.08));
        } else if (gift < 55_000) {
            System.out.println("Tax: " + (1_700 + (gift - 25_000) * 0.10));
        } else if (gift < 200_000) {
            System.out.println("Tax: " + (4_700 + (gift - 55_000) * 0.12));
        } else if (gift < 1_000_000) {
            System.out.println("Tax: " + (22_100 + (gift - 200_000) * 0.15));
        } else {
            System.out.println("Tax: " + (142_100 + (gift - 1_000_000) * 0.17));
        }

        scan.close();
    }
}
