import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner Data = new Scanner(System.in);
        System.out.println("e,entre your age");
        int age = Data.nextInt();
        if(age>=18){
            System.out.println( "VOTE");
        }
        else{
            System.out.println("you are not alegable for doing vote");
        }
        Data.close();
    }
}
