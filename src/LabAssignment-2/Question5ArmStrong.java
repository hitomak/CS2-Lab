import java.text.DecimalFormat;
import java.util.Scanner;

///!!! Important All questions works with Numbers.java class with out it it will not work

public class Question5ArmStrong {
    public static void main(String args[]) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Your First number to check between with second Number if there is ArmStrong Number:");
        int N1 =UserInput.nextInt();
        System.out.println("Enter Your Second number to check between with first Number if there is ArmStrong Number:");
        int N2 = UserInput.nextInt();
        Numbers.PrintArmstrong(N1,N2);
    }
}
