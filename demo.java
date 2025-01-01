import java.util.Scanner;

public class demo {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // input output
      int val1 = sc.nextInt();
      System.out.println("var = " + val1);
    } catch(Exception e) {
      // catching exception
      System.out.println("Exception : " + e);
    }
  }
}