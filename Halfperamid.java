public class Halfperamid {
    // public static void mahi(int n){
    // for (int i = 1 ; i<=n ;i++){
    // for(int j =1; j<=n-i; j++){
    // System.out.print(" ");
    // }
    // for(int j = 1 ; j<=i ; j++){
    // System.out.print("*");
    // }
    // System.out.println( );
    // }

    // }
    // public static void main(String[] args) {
    // mahi(4);
    // }

    // ****...................print just opposite ......***

    public static void mahi(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        mahi(4);
    }

}
