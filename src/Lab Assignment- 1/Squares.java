import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        int a;
        Scanner stdin=new Scanner(System.in);
        System.out.println("Add Number then click Enter :");
        a=stdin.nextInt();
        System.out.println("Number entered is: " + a + " Square of it: "+(Math.pow(a,2)));
    }
}
