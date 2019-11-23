import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

//        int n = (int) Math.sqrt((double) Integer.MAX_VALUE);
        int na = 8;
        int n = 2;

        // Why 0:
        // Maximum integer is 2147483647
        // add one to that, the number will become -2147483648
        while (n * n > 0) {
            n += na;
//            System.out.println("n: " + n);
        }

        System.out.println("First overflow during squaring occurs at " + n);
    }
}
