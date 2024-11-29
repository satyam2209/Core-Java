class sample
{
    void display()
    {
        System.out.println("This is base class");
    }
}

class sample2 extends sample
{
    void display()
    {
        System.out.println("This is child class");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args)
    {
        sample2 s2 = new sample2();      
        s2.display();
    }
}
