import java.util.Scanner;

public class WeightConvert {
    public static void main(String[] args)
    {
        float Pounds, Kilo, Rate=2.205f;
        Scanner measure = new Scanner(System.in);
        System.out.println("Pounds to Kilogram Converter");
        System.out.print("Enter Your Pounds :");
        Pounds = measure.nextFloat();
        Kilo = Pounds/Rate;
        System.out.println("You entered "+Pounds+" pounds. Converted to kilogram as "+Kilo+"kg");
    }
}
