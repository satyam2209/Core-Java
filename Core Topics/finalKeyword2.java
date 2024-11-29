final class sample
{
    public void display()
    {
        System.out.println("Hello");
    }
}

public class finalKeyword2 extends sample {
    public void display()
    {
        System.out.println("Hello from the child class");
    }
    public static void main(String[] args)
    {
        System.out.println("in main");
    }
}


// sample class is final so it cannot inherited