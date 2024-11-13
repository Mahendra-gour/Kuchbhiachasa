//  import java.util.*;
public class SelectionSorting {

    // public static void selection(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < n - 1; i++) {
    // int minIndex = i;
    // for (int j = i + 1; j < n; j++) {
    // if (arr[j] < arr[minIndex]) {
    // minIndex = j;
    // }
    // }
    // // Swap the found minimum element with the first element
    // int temp = arr[minIndex];
    // arr[minIndex] = arr[i];
    // arr[i] = temp;
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = {5, 4, 1, 3, 2};
    // selection(arr);
    // System.out.println("Sorted array:");
    // for (int num : arr) {
    // System.out.print(num + " ");
    // }
    // }

    public static void s(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                }
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 5, 7, 8, 1, };
        s(arr);
    }

}
