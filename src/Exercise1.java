import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");

        int x = sc.nextInt();
        int result = 0;
        do {
            int currentDigit = x % 10;
            x /= 10; // x = x / 10

            // For every successful iteration, we multiply the result by 10
            // So we shift the digit to the left to make room for the new digit
            result *= 10; // result = result * 10
            result += currentDigit; // result = result + currentDigit

            System.out.println("x: " + x);
        } while (x > 0);

        System.out.println("Output: " + result);
    }
}
