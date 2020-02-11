import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        int a=10,b=15,c=45;
        // write your code here
        Scanner stdin=new Scanner(System.in);
        System.out.println("Add first Number then click Enter :");
        a=stdin.nextInt();
        System.out.println("Add second Number then click Enter :");
        b=stdin.nextInt();
        System.out.println("Add third Number then click Enter :");
        c=stdin.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+" is Greatest one");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is Greatest one");
        }
        else if(c>b && c>a)
        {
            System.out.println(c+" is Greatest one");
        }
        else if(a>c && a==b)
        {
            System.out.println(a+" and is Greatest ones");
        }
        else if(c>b && c==a)
        {
            System.out.println(a+" and is Greatest ones");
        }
        else if(c>a && c==b)
        {
            System.out.println(b+" and is Greatest ones");
        }
    }
}
