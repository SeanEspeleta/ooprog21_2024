public class Fibonacci {

      public static int fibonacci (int n) {
          if (n < 0){
            return 1;
      } else if (n == 0){
           return 0;
      }else if (n == 0){
      return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
     public static void main(String[] args) {
       for (int i= 0; i <= 10;  i++) {
           System.out.println("Fibonacci number " + i + " is: " + fibonacci(i));
      }
   }   
  
 }      
       
          
       
        
      
     
 
 