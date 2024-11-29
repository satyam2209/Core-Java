// Run Time Polymorphism

class Shape
{
    public void display()
    {
        System.out.println("shape class");
    }
}

class square extends Shape
{
    public void display()
    {
        System.out.println("square class");
    }
}

public class Polymorphism4 {
    public static void main(String[] args)
    {
        Shape s;  // s is polymorphic variable
        s = new Shape();
        s.display();
        s = new square();
        s.display();
    }
}
