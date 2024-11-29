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
public class Inheritance2 extends sample {
    public static void main(String args[])
    {
        Inheritance2 f = new Inheritance2();
        f.add();
    }
}
