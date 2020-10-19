import java.util.*;
public class Q5 {

   public static void main(String []args) {
            int a,b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first value:");
            a = sc.nextInt();
            System.out.println("Enter the Second value:");
            b = sc.nextInt();

            System.out.println("First Value + Second Value = "+sum(a,b));
	}

      public static int sum(int v1, int v2){
            int v = v1+v2;
            return v;
      }
}
