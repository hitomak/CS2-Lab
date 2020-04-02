import java.util.Scanner;

public class Question1DigitsCount {
    public static void main(String args[]){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Your number to count digits");
        Numbers N1 = new Numbers (UserInput.nextInt());
        System.out.println(N1.GetAmountOfDigits());
    }
}
