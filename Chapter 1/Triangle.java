public class Triangle {
    public static void main(String[] args) {
         int lines = 7;

        for (int i = 0; i < lines; i++) {
            
            System.out.print(" ".repeat(lines - i - 1));
            
            System.out.println("T".repeat(1 + 2 * i));
        }
    }
}       
