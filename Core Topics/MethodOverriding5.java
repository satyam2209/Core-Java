class sample{
    protected int x = 10;
    protected void display()
    {
      System.out.println("This is base class");
    }
}

class sample2 extends sample
{
    public int x=20;
    public void display()
    {
        super.display();
        System.out.println("This is child class");
        System.out.println("the attributes");
        System.out.println("child class" +x);
        System.out.println("Base class" +super.x);
    }
}

public class MethodOverriding5 {
    public static void main(String[] args)
    {
        sample2 s2 = new sample2();
        s2.display();
    }
}
