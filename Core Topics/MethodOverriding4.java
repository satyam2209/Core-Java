class sample
{
    protected void display()
    {
        System.out.println("This is base class");
    }
}

class sample2 extends sample
{
    public void display()
    {
        super.display();
        System.out.println("This is child class");
    }
}

public class MethodOverriding4 {
    public static void main(String[] args)
    {        
        sample2 s2 = new sample2();      
        s2.display();
    }
}
