import java.util.*;

public class calculater {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("entre a");
        int a = data.nextInt();
        System.out.println("entre b");
        int b = data.nextInt();
        System.out.println("entre operayor");
        char calculate = data.next().charAt(0);
        switch(calculate){
            case '+' :System.out.println(a+b);
            break ;
            case '-' : System.out.println(a-b);
            break ;
            case '/': System.out.println(a/b);
            break ;
            case '*':System.out.println(a*b);
            break ;
            case '%' :System.out.println(a%b);
            break ;
            default : System.out.println("you entre rong  key word ");

        }
        data.close();
    }
}
