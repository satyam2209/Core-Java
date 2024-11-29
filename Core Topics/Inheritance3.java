// Single Inheritance

class sample
{
    int m = 10;
    public void add()
    {
        m = m+10;
        System.out.println("The value of m is" +m);
    }
}

class child extends sample
{
   void display()
   {
    System.out.println("Child class");
   }
} 

public class Inheritance3 extends sample {
    public static void main(String args[])
    {
        // Inheritance3 f = new Inheritance3();
        // f.add();
        child c = new child();
        c.add();
    }
}
