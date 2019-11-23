import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");

        int size = sc.nextInt();
        int seed = sc.nextInt();

        int[] field = new int[size];

        // There are multiple ways to generate random
        // java.util.Random most widely used, but has poor performance. Though it's ok for this,
        // java.lang.Math   Simple: Math.random() no way we can put seed in.
        // java.util.concurrent.ThreadLocalRandom
        // java.security.SecureRandom
        // java.util.SplittableRandom

        // Choose one or the other
        // SplittableRandom random1 = new SplittableRandom(seed);
        Random random2 = new Random(seed);

        // variable to hold the value a and b
        int valA = 0;
        int valB = 0;

        if (size > 0) {
            System.out.print("Numbers: ");
        }

        for (int i = 0; i < field.length ; i++) {
            // field[i] = random1.nextInt(-10, 10);
            field[i] = random2.nextInt();

            System.out.print(field[i] + " ");

            // This is ternary operator
            // condition ? value of true : value of false
            // valA += field[i] < 0 ? 1 : 0;
            // valB += field[i] > 0 ? 1 : 0;

            if (field[i] < 0) {
                valA++;
            } else if (field[i] > 0){
                valB++;
            }
        }
        
        System.out.println("\nSize: " + size);
        System.out.println("Seed: " + seed);
        System.out.println("Value a: " + valA);
        System.out.println("Value b: " + valB);
    }
}
