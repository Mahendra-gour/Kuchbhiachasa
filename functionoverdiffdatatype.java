public class functionoverdiffdatatype{

public static int  mahi(int a ,int b){
    return a+b ;

}
public static float  mahi(float a , float b   ){
    return a+b;
    
}
    public static void main(String[] args) {
        System.out.println(mahi(5 ,3));
        System.out.println(mahi(2.5f,2));
    }
}