import java.util.Scanner;

public class Question3PascalTriangle {
    public static void main(String args[]) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter row numbers of the Pascal's Triangle:");
        Numbers N1 = new Numbers(UserInput.nextInt());
        N1.PrintPascalTriangle();
    }
}
