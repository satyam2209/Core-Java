// Extending an Interface

interface any{
    void methodany();
}

interface one extends any
{
    void methodone();
}

public class Interface4 implements one {
    public void methodany()
    {
        System.out.println("This is my first interface");
    }

    public void methodone()
    {
        System.out.println("This is the second interface");
    }

    public static void main(String[] args)
    {
        Interface4 i = new Interface4();
        i.methodone();
        i.methodany();
    }
}
