// Non-Static Nested Class
   // Local inner class

public class NestedClass6 {
    private int i = 30;
    void msg()
    {
        class local
        {
            void display()
            {
                System.out.println("Hello");
            }
        }
        local l = new local();
        l.display();
    }

    public static void main(String[] args)
    {
        NestedClass6 n = new NestedClass6();
        n.msg();
    }
}
