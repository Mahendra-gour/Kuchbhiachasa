import java.util.Scanner;

public class bionimalcofficent{
    public static int  fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        //   int g = fact(n);
        int koibhi = fact(n)/(fact(r)*fact(n-r));
        System.out.println(koibhi);
        sc.close();

    }
}