import java.util.*;

public class sumofallthenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int  i = 1;
        while (i<=x) {
            int rem =  x%10;
            sum += rem;
            i++;
            x = x/10;
            
        }
        sc.close();
        System.out.println(+sum);
    }
}
