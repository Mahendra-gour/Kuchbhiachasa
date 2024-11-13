public class functionoverloadings {

    public static int mahi(int a, int b) {
        return a + b;
        // in the function overloading function are
        // multiple types and the function name should hi same but the parameters are
        // diffrent its nessasary
    }

    public static int mahi(int a, int b, int c) {
        return a + b + c;

    }

    public static void main(String args[]) {
        System.out.println(mahi(5, 3));
        System.out.println(mahi(5, 2, 1));
    }
}