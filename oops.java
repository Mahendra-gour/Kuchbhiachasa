public class oops
 {
    public static void main(String[] args) {
        pen p1 = new pen(); // create a pen object called p1 ;
        p1.setcolor("bule");
        System.out.println(p1.color);
        p1.settip(6);
        System.out.println(p1.tip);
        Student s1 = new Student();
        s1.setname("mahendra");
        System.out.println(s1.name);
        s1.setclasss(10);
        System.out.println(s1.classs);
        // s1.setcgpa(6.5);
        // System.out.println(s1.cgpa);

    }
}

class pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;

    }

    void settip(int newtip) {
        tip = newtip;

    }
}

class Student {
    String name;
    int classs;
    float cgpa;

    void setname(String newname) {
        name = newname;

    }

    void setclasss(int newclass) {
        classs = newclass;
    }

    void setcpga(float newcgpa) {
        cgpa = newcgpa;
    }
}