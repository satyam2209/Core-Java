// Narrowing Type Casting (higher to lower) done manually

public class types3 {
    public static void main(String args[])
    {
        double x=10.78;
        // int y=x;  cannot convert from double to int
        // error: incompatible types: possible lossy conversion from double to int
        int y=(int)x; 
        System.out.println("the value of x is");
        System.out.println(x);
        System.out.println("the value of y is");
        System.out.println(y);
    }
}
