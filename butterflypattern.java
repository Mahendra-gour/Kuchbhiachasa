public class butterflypattern {
    public static void mahi(int n) {
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            //star
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
                // System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            //star
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
                // System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        mahi(4);
    }
}
