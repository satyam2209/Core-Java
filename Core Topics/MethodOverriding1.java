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

public class MethodOverriding1 {
    public static void main(String[] args)
    {
        sample s1 = new sample();  
        sample2 s2 = new sample2();      
        s1.display();        
        s2.display();
    }
}
