//class declaration
public class Ball{

    //Variables
    String color;
    int size;

    //constructor
    public Ball(String color, int size) {
        this.color=color;
        this.size=size;
    }

    //method
    public String getColor()
    {
        return color;
    }
    //method
    public int getSize()
    {
        return size;
    }

    public static void main(String[] args)
    {
        /*if you look below object are created with Ball class that does not need to declare again it's method, variables and so on. */
        Ball redBall = new Ball("red",5);   // A new Object created with ball class
        System.out.println("This ball is " + redBall.getColor()+ " and size "+redBall.getSize());
        Ball hugeBall = new Ball("blue",25); // A new Object created with ball class
        System.out.println("This ball is " + hugeBall.getColor()+ " and size "+hugeBall.getSize());
    }
}


