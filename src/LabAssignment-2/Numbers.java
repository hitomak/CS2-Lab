public class Numbers {
    private int Number;
    private int AmountOfDigits;
    private double Abundance;
    private int AmountOfHandShake;

    public Numbers(int Number) {
        this.Number = Number;
        this.AmountOfDigits = CountTheDigitsInNumber(Number); //Question 1 Constructor
        this.Abundance = GetAbundance(Number);//Question 2 Constructor
        //Question 3 doesn't have a constructor because of a lot of print function. You will see it below
        this.AmountOfHandShake = GetAmountOfHandShake(Number);//Question 4 Constructor
        //Question 5 doesn't have a constructor because of a lot of print function. You will see it below
    }
    public int GetThisNumber()
    {
        return this.Number;
    }

    //Question 1 Get The Amount Of Digits
    private static int CountTheDigitsInNumber(int Number)
    {
        int count=0;
        for(; Number != 0; Number/=10, ++count) {
        }
        return count;
    }

    public int GetAmountOfDigits()
    {
        return this.AmountOfDigits;
    }

    //Question 2 Get Abundance
    private double GetAbundance(double Number)
    {
        double total=0;
        double count=1;
        double Abundance=0;
        while (count<=Number) {
            if((Number % count)==0){
                total=total+count;
            }
            count++;
        }
        Abundance =total/Number;
        return Abundance;
    }

    public double GetAbundance()
    {
        return this.Abundance;
    }

    //Question 3 Helpers and printers
    public void PrintPascalTriangle()
    {
        System.out.println();
        int RowController, ColumnController, AmountOfSpace;

        for(RowController = 0; RowController < this.Number; RowController++) {
            AmountOfSpace=this.Number-RowController;
            for(ColumnController = 0; ColumnController <= AmountOfSpace; ColumnController++){
                System.out.print(" ");
            }

            for(ColumnController = 0; ColumnController <= RowController; ColumnController++){
                System.out.print(" "+NumberInTheCell(RowController, ColumnController));
            }
            System.out.println();
        }
    }

    static int NumberInTheCell(int n,int r) {
        return Factorial(n) / ( Factorial(n-r) * Factorial(r) );
    }

    static int Factorial(int Number) {
        int Factorial;

        for(Factorial = 1; Number > 1; Number--){
            Factorial *= Number;
        }
        return Factorial;
    }

    //Question 4 Handshake of the group of people
    private int GetAmountOfHandShake(int AmountOfPeople){
        return (AmountOfPeople * (AmountOfPeople - 1)) / 2;
    }
    public int GetAmountOfHandShake()
    {
        return this.AmountOfHandShake;
    }

    //Question 5 Armstrong
    public static void PrintArmstrong(int Number1, int Number2){
        if(Number1>Number2){
            PrintArmstrongHelper(Number1, Number2);
        }
        else if(Number2>Number1){
            PrintArmstrongHelper(Number2, Number1);
        }
        else{
            System.out.println("Why numbers are equal?");
        }
    }

    private static void PrintArmstrongHelper(int HighNumber, int LowNumber){
        System.out.print("ArmStrong Number list between "+ LowNumber+" and "+HighNumber+" is as below\n");
        for(int LNumber = LowNumber + 1; LNumber < HighNumber; ++LNumber) {
            int digits = CountTheDigitsInNumber(LNumber);
            int result = 0;
            int LowNumberProtector = LNumber;

            // result contains sum of nth power of its digits
            while (LowNumberProtector != 0) {
                int remainder = LowNumberProtector % 10;
                result += Math.pow(remainder, digits);
                LowNumberProtector /= 10;
            }

            if (result == LNumber)
                System.out.print(LNumber + " ");
        }
    }
}
