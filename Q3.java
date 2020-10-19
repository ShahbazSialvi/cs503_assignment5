	import java.util.*;
public class Q3{

   public static void main(String []args) {
      int a,b;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first value:");
      a = sc.nextInt();
      System.out.println("Enter the Second value:");
      b = sc.nextInt();

      while(a<b){
      	System.out.println("a is less than b");
      	a++;
      	b--;
      	}
      System.out.println("a is equal to b");
     
      
	}
}