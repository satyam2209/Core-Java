class Shape{
    public void display()
    {
        System.out.println("Shape class");
    }
}

class square extends Shape{
    public void display()
    {
        System.out.println("Square class");
    }
}

class circle extends Shape{
    public void display()
    {
        System.out.println("Circle class");
    }
}

public class Polymorphism1 {
    public static void main(String[] args)
    {
        square s = new square();
        s.display();
        circle c = new circle();
        c.display();
    }
}
