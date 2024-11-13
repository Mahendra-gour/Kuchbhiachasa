public class maxsubarray {
    public static void subarraysum(int num[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                curr = 0;
                for (int k = i; k <= j; k++) {
                    curr += num[k];
                }
                System.out.println(curr);
                if(max<curr){
                    max=curr;
                }
            }
            // System.out.println();
        }
        System.out.println(" max num of sum" + max);
    }

    public static void main(String[] args) {
        int num[] = { 1,-2,6,-1,3 };
        subarraysum(num);

    }
}
