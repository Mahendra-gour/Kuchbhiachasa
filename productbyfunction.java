import java.util.Scanner;

public class productbyfunction {
    public static int mahi(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("phele number to dal 1st ::");
        int a = sc.nextInt();
        System.out.println("phele number to dal 2nd::");
        int b = sc.nextInt();
        int raju = mahi(a, b);
        System.out.println(" a * b ::==" + raju);
        sc.close();

    }
}
