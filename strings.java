
import java.util.*;

public class strings {
    public static void print(String Str) {
        for (int i = 0; i < Str.length(); i++) {
            System.out.print(Str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre your string");
        String name;
        name = sc.nextLine();

        System.out.print(name + " " + name.length());
        sc.close();

        String f = "mahendra";
        String l = "gour";
        String alls = f + l;
        print(alls);

        // ,substring
        String s1 = "mahendra";

        System.out.println(s1.substring(0, 5));
    }
}
