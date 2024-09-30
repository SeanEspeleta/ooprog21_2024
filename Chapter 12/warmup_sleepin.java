public class warmup_sleepin {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        
        if (weekday == false && vacation == false) {
            return true;
        }
        if (weekday == true && vacation == true) {
            return true;
        }
        if (weekday == false && vacation == true) {
            return true;
        }
        if (weekday == true && vacation == false) {
            return false;
        }
        return false; 
    }

    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false)); 
        System.out.println(sleepIn(false, true)); 
    }
}