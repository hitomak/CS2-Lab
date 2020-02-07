import java.util.Scanner;

public class BillsCoins {
    public static void main(String[] args)
    {
        /*
        Banknotes
        Freq. used	$1, $5, $10, $20, $50, $100
        Coins
        Freq. used	1¢, 5¢, 10¢, 25¢
        */
        double money,remain;
        int b100, b50, b20, b10, b5, b1, c25, c10, c5, c1; //will hold amounts of bills and coins
        Scanner imoney = new Scanner(System.in);
        System.out.println("Bills and coins need".toUpperCase());
        System.out.print("Enter amount of the money:");
        money=imoney.nextDouble();
        b100 = (int)(money/100); remain=money%100;//100 bills and remain form 100 dollars
        b50 = (int)(remain/50); remain=remain%50;//50 bills and remain form 50 dollars
        b20 = (int)(remain/20); remain=remain%20;//20 bills and remain form 20 dollars
        b10 = (int)(remain/10); remain=remain%10;//10 bills and remain form 10 dollars
        b5 = (int)(remain/5); remain=remain%5;//5 bills and remain form 5dollars
        b1 = (int)(remain/1); remain=(remain%1)*100;//1 bills and remain form 1 dollars. Remain converted to cent. 1$ is 100 cent
        c25 = (int)(remain/25); remain=remain%25;//25 quarter and remain form quarter
        c10 = (int)(remain/10); remain=remain%10;//dime and remain form dime
        c5 = (int)(remain/5); remain=remain%5;//nickel and remain form nickel
        c1 = (int)(remain/1); remain=remain%1;//pennies and remain form pennies
        
        System.out.println("Required bills and coins");
        System.out.println(b100+" hundred dollar bill");
        System.out.println(b50+" fifty dollar bill");
        System.out.println(b20+" twenty dollar bill");
        System.out.println(b10+" ten dollar bill");
        System.out.println(b5+" five dollar bill");
        System.out.println(b1+" one dollar bill");
        System.out.println(c25+" quarter");
        System.out.println(c10+" dimes");
        System.out.println(c5+" nickels");
        System.out.println(c1+" pennies");
    }
}
