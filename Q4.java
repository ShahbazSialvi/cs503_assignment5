import java.util.*;
public class Q4 {

      public static void main(String []args) {
            int a,b;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number:");
            a = sc.nextInt();
            if (a<0){
                  a = (a)*(-1);
            }
            System.out.println("Table of "+a);      
            for(int i=1;i<=10;i++){
                  System.out.println(a+"X"+i+"="+a*i);
            }
      
      }
}