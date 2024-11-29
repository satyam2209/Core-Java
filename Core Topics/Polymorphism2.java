// compile Time polymorphism
// Method Overloading or function overloading

class Shape
{
    public void display()
    {
        System.out.println("Shape class");
    }
    public void display(int a)
    {
        System.out.println("the variable is "+a);
    }
}

public class Polymorphism2 {
    public static void main(String[] args)
    {
        Shape s1 = new Shape();
        s1.display();
        s1.display(9);
    }
}
