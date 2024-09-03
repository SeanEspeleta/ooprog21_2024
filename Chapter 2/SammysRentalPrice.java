import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        String motto = "Sammy's Seashore Supplies: Rent your fun in the sun!";
        Scanner scanner = new Scanner(System.in);
        printBoxedMotto(motto);
       
       System.out.print("Enter the number of minutes rented: ");
        int minutesRented = scanner.nextInt();
        int hoursRented = minutesRented / 60;
        int additionalMinutes = minutesRented % 60;
        double totalPrice = (hoursRented * 40) + additionalMinutes;
        
        System.out.println("Hours rented: " + hoursRented);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.printf("Total price: $%.2f%n", totalPrice);
        scanner.close();
    }
    
    private static void printBoxedMotto(String motto) {
        int length = motto.length() + 4;
        printBorder(length);
        System.out.println("S " + motto + " S");
        printBorder(length);
    }
    
    private static void printBorder(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("S");
        }
        System.out.println();
    }
}
