public class FritzQuack {
  public static void main(String[] args) {
    for (int i = 0; i < 200 ; i++) {
      if (i % 3 == 0) {
        System.out.print("Fritz");
      }
      
      if (i % 5 == 0) {
        System.out.print("Quack");
      }
      
      if (i % 5 != 0 && i % 3 != 0) {
        System.out.print(i);
      }
  
      System.out.print(" ");
    }
  }
}
