// Calling superclass(parent class) constructor using super keyword

class sample
{
    int x;
    sample(int a)
    {
        x=a;
    }
}

class derived extends sample
{
    int y;
    derived(int a, int b)
    {
       super(a);
       y=b;
    }
    void show()
    {
        System.out.println("The value of x is"+x+" and the value of y is"+y);
    }
}

public class Inheritance8 {
    public static void main(String[] args)
    {
        System.out.println("use of super keyword");
        derived d = new derived(1, 2);
        d.show();
    }
}
