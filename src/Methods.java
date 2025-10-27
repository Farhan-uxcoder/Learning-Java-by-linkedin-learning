
import java.util.*;

public class Methods {
        public static int calculateSum(int number1 , int number2){
            int sum = number1+number2;
            return sum;
        }

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value 1");
    int val1 = sc.nextInt();
    System.out.println("enter the value 2 ");
    int val2 = sc.nextInt();
    System.out.println("The sum is "+calculateSum(val1,val2));
}
}
