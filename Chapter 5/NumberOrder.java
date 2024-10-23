import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        
        if (num1 <= num2 && num2 <= num3) {
            
            System.out.println("The numbers in ascending order: " + num1 + " " + num2 + " " + num3);
        } else {
            
            System.out.println("The numbers in descending order: " + Math.max(num1, Math.max(num2, num3)) + " " +
                               (num1 + num2 + num3 - Math.max(num1, Math.max(num2, num3)) - Math.min(num1, Math.min(num2, num3))) + " " +
                               Math.min(num1, Math.min(num2, num3)));
        }

        
        scanner.close();
    }
}