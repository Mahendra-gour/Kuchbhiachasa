import java.util.*;

public class breakinloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("entre the number ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;

            }
            System.out.println(n);
            sc.close();

        } while (true);
    } 
}
