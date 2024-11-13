public class binaryearch {
    public static int element(int num[],int key){
        int n= num.length;
        int start = 0; 
        int  end = n;
        for(int s = 0; s<=n-1;s++){
             int mid = (start+end)/2;
             if (num[mid]==key){
                return  mid; 
             }
             else if (num[mid]>key)
             {
                end=mid-1;
             }
             else
             {
                start=mid+1;
             }
        }
       return -1;
    }
    public static void main (String args[]){
        int num[]={2,4,6,8,10,12};
        int key =10;
        System.out.print("the key is present is index :"+ element(num, key));
    }
}
