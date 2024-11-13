// import java.util.*;

public class Bubleshort {
    public static void mahi(int arrs[] ){
        for(int  turn= 0 ;turn <arrs.length-1;turn++){
            for (int j = 0 ; j<arrs.length-1-turn;j++){
                if (arrs[j]>arrs[j+1]){
                    // swap
                    int temp = arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                }

            }
        
        }

    }
    // print the element
    public static void printnu(int arr[]){
        for(int i = 0 ; i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arrs[] = { 5, 2, 1, 3, 4 };
        mahi(arrs);
        printnu(arrs);
    }
}
