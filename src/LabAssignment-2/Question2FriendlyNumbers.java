import java.util.Scanner;
import java.text.DecimalFormat;

///!!! Important All questions works with Numbers.java class with out it it will not work

public class Question2FriendlyNumbers {

    private static DecimalFormat df2 = new DecimalFormat("#.##");//New format for double unit to write it shorter

    public static void main(String args[]) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Your First number to check with second Number if they are Friendly:");
        Numbers N1 = new Numbers (UserInput.nextInt());
        System.out.println("Enter Your Second number to check with first Number if they are Friendly:");
        Numbers N2 = new Numbers (UserInput.nextInt());
        if(N1.GetAbundance()==N2.GetAbundance())
        {
            System.out.println("This Numbers "+N1.GetThisNumber()+","+N2.GetThisNumber()+" is Friendly and their Abundance is: "+  df2.format(N1.GetAbundance()));
        }
        else
        {
            System.out.println("This Numbers "+N1.GetThisNumber()+","+N2.GetThisNumber()+" is not Friendly first numbers Abundance is: " + df2.format(N1.GetAbundance())+" second numbers Abundance is:" + df2.format(N2.GetAbundance()));
        }
    }
}
