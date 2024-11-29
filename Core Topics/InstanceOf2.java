class sample
{
    void display()
    {
        System.out.println("hello");
    }
}

public class InstanceOf2 extends sample {
    public static void main(String[] args)
    {
        InstanceOf2 I = new InstanceOf2();
        System.out.println(I instanceof sample);
    }
}
