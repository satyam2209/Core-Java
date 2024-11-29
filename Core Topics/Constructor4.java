// Multiple Parametrized Constructor

public class Constructor4 {
    int age;
    String s;
    public Constructor4(int m, String j)
    {
        age=m;
        s=j;
        System.out.println("the age is" +age);
        System.out.println("Name is" +s);
    }

    public static void main(String[] args)
    {
        Constructor4 f1 = new Constructor4(7, "Satyam");
        Constructor4 f2 = new Constructor4(10, "Satya");
    }
}
