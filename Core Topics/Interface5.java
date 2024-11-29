//  Implementing Multiple Interfaces

interface shape{
   void area(int l, int b, int h);
}

interface display{
    void dprint(int a);
}

public class Interface5 implements shape,display {
    public void area(int l, int b, int h)
    {
        System.out.println("the area is" +(l*b*h));
    }

    public void dprint(int a)
    {
        System.out.println("The passsed value is" +a);
    }

    public static void main(String[] args)
    {
        Interface5 i = new Interface5();
        i.area(2, 3, 4);
        i.dprint(4);
    }
}
