// Multiple Constructor

public class Constructor5 {
    int a;
    public Constructor5()
    {
        a=0;
        System.out.println("Default Constructor" +a);
    }
    public Constructor5(int m)
    {
        a=m;
        System.out.println("Parametrized Constructor" +a);
    }
    public static void main(String[] args)
    {
        Constructor5 f1= new Constructor5();
        Constructor5 f2= new Constructor5(5);
    }
}
