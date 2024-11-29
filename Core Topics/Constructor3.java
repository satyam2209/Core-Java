// single Parametrized Constructor

public class Constructor3 {
    int a;
    public Constructor3(int m)
    {
        a=m;
        System.out.println("the value of a is" +a);
    }

    public static void main(String[] args)
    {
        Constructor3 f1 = new Constructor3(7);
    }
}
