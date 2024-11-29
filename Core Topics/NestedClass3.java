// static nested classes

public class NestedClass3 {
    int i = 10;
    static class two{
        static void msg()
        {
            System.out.println("Data" + i);
        }
    }

    public static void main(String[] args) {
        NestedClass2.two.msg();
    }
}

// error: non-static variable i cannot be referenced from a static context
// System.out.println("Data" + i);
