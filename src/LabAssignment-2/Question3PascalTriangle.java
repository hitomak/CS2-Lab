import java.util.Scanner;

///!!! Important All questions works with Numbers.java class with out it it will not work

public class Question3PascalTriangle {
    public static void main(String args[]) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter row numbers of the Pascal's Triangle:");
        Numbers N1 = new Numbers(UserInput.nextInt());
        N1.PrintPascalTriangle();
    }
}
