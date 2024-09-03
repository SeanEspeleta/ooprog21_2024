import java.util.Scanner;

public class CarlysEventPrice {

    // Method to display the company motto
    public static void displayMotto() {
        System.out.println("*************************************************");
        System.out.println("* Carly’s makes the food that makes it a party. *");
        System.out.println("*************************************************");
    }

    public static void main(String[] args) {
        final int PRICE_PER_GUEST = 35;
        Scanner input = new Scanner(System.in);

         displayMotto();

        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = input.nextInt();

        int totalPrice = numberOfGuests * PRICE_PER_GUEST;

        boolean isLargeEvent = numberOfGuests >= 50;

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_GUEST);
        System.out.println("Total price: $" + totalPrice);

         System.out.println("Is this a large event? " + isLargeEvent);

        input.close();
    }
}