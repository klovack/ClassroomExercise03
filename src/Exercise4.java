import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        
        int a = sc.nextInt();
        
        if (a <= 0) {
            System.out.println("Input must be greater than 0");
            System.exit(1);
        }

        // we assume that the a > 0
        double x = 2;
        System.out.print("Output: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(x + " ");
            
            x = (x + a / x)/2;
        }
    }
}
