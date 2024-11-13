import java.util.*;
public class functionoffactorial {
    public static int mahi (int n){
int f =1  ;
for (int i =1 ; i<=n ; i++ ){
    f = f * i;
}
return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
    // int b = mahi(n);
    System.out.println(mahi(n));
sc.close();
    }
}
