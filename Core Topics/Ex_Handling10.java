// throw

public class Ex_Handling10 {

    static void check(int a)
    {
        if(a<18)
        {
            throw new ArithmeticException("Access denied you need to be above 18");
        }
        else {
            System.out.print("Access granted");
        }
    }
    public static void main(String[] args) {
        check(16);
    }
}
