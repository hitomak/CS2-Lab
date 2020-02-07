import java.util.Scanner;

public class SameValues {
    public static void main(String[] args)
    {
        int inum;
        double dnum;
        Scanner measure = new Scanner(System.in);
        System.out.println("Divide by 5 int and double".toUpperCase());
        System.out.print("Enter your first number(int) :");
        inum = measure.nextInt();
        System.out.print("Enter your second number(double) :");
        dnum = measure.nextDouble();
        System.out.println("You entered "+inum+" an integer number, "+dnum+" as double.");
        System.out.println("Results: "+((double)inum/5)+" and "+(dnum/5));
    }
}
