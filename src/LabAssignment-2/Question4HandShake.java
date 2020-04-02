import java.util.Scanner;

public class Question4HandShake {
    public static void main(String args[]) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Amount of people who is going to Hand Shake:");
        Numbers N1 = new Numbers(UserInput.nextInt());
        System.out.println("Hand shake amount is :"+N1.GetAmountOfHandShake());
    }
}
