public class Billing {
    public void computeBill(double price) {
        double total = price + (price * 0.08);
        System.out.println("Total bill: $" + String.format("%.6f", total));
    }

    public void computeBill(double price, int quantity) {
        double subtotal = price * quantity;
        double total = subtotal + (subtotal * 0.08);
        System.out.println("Total bill: $" + String.format("%.6f", total));
    }

    public void computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discount = (subtotal * couponDiscount) / 100;
        double total = subtotal - discount + (subtotal * 0.08);
        System.out.println("Total bill: $" + String.format("%.6f", total));
    }

    public static void main(String[] args) {
        Billing billing = new Billing();
        billing.computeBill(23.2);
        billing.computeBill(10.5, 2);
        billing.computeBill(15.0, 3, 10);
    }
}