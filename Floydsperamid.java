public class Floydsperamid {
    public static void mahi(int n,int count    ) {
        for (int i= 1 ; i<= n ; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main (String args []){
        mahi(5,1);
    }

}
