public class Ex_Handling11 {
    static void check(int a) throws ArithmeticException, ArrayIndexOutOfBoundsException
    {
        if(a<18)
        {
            throw new ArithmeticException("Access denied you need to be above 18");
        }
        else 
        {
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args)
    {
          check(16);
    }
}
