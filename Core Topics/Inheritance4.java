// Multilevel Inheritance

class sample{
    int m = 10;
    public void add()
    {
        m = m + 10;
        System.out.println("The value of m is" +m);
    }
}

class child extends sample{
   public void display()
   {
    System.out.println("Child class");
   }    
}

class child2 extends child{
    void display2()
    {
        System.out.println("Child 2 class");
    }
}

public class Inheritance4 {
    public static void main(String[] args)
    {
        child2 f = new child2();
        f.add();
        f.display();
        f.display2();
    }
}
