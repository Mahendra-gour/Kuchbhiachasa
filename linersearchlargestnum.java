public class linersearchlargestnum {
    public static int largests(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }if(smallest>num[i]){
                smallest =num[i];
            }
            
        }
        System.out.println(" smallest vale of an array : ==="+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int largest[]={ 1, 3, 6, 10 ,14, 2, 4};
        System.out.println(largests(largest));
    }
}
