public class solidrombus {
    public static void mahi(int n){
        for(int i = 1 ; i<=n ;i++){
            //space
            for(int j = 1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            //star

            for(int k =1; k<=n ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        mahi(5);
    }

}
