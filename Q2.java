import java.util.*;
public class Q2 {

   public static void main(String []args) {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first value:");
      a = sc.nextInt();
      System.out.println("Enter the Second value:");
      b = sc.nextInt();

      if(a<b){
      	System.out.println("\nFirst value is smaller than Second one.");
      } else if(a==b){
      	System.out.println("\nBoth values are equal.");
      } else {
      	System.out.println("\nSecond value is smaller than first one");
      }
      
	}
}