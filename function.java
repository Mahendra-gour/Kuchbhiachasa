import java.util.*;

public class function {
    public static void calculate(int num1  , int num2){
        int sum = num1+num2;
        System.out.println("sum is :"+sum);
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("entrte the value of : a :");
        int a = sc.nextInt();
        System.out.println("entrte the value of :  b :");
        int b = sc.nextInt();
        calculate(a ,b);
        sc.close();
    }
    
    
}
