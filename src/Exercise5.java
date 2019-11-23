import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input: ");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    
    int current = n;
    
    System.out.print("Output: ");
    
    while(n < m ? current <= m : current >= m) {
      if (current % k == 0) {
        System.out.print("beep ");
      } else {
        System.out.print(current + " ");
      }
      
      current = n > m ? current - 1 : current + 1;
    }
  }
}
