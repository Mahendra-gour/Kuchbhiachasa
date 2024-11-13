import java.util.Scanner;

public class Arry {

  public static void main(String[] args) {
    int mahi[] = new int[50];
    Scanner sc = new Scanner(System.in);
    System.out.println("entre your number");
    mahi[0] = sc.nextInt();
    System.out.println("entre your number");
    mahi[1] = sc.nextInt();
    System.out.println("entre your number");
    mahi[2] = sc.nextInt();
    // System.out.println("phy = :" +mahi[0]);
    // System.out.println("chem = :" +mahi[1]);
    // System.out.println("math = :" +mahi[2]);
    // System.out.println("length"+mahi.length);
      sc.close();
    // update the arry
    // mahi[1]=mahi[1]+5;
    // System.out.println(mahi[1]);
    double percantage = ((mahi[0] + mahi[1] + mahi[2]) / (float) 300) * 100;
    System.out.println(percantage);

  }
}