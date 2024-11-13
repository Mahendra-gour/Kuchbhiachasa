public class constractorss {
    public static void main(String args[]) {
        student s1 = new student("mahendra");
        System.out.println(s1.name);
    }

}

class student {
    String name;
    int roll;

    // crete a constructer
    student(String name) {
        this.name = name;
    }

}
