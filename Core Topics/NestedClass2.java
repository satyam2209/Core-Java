// static nested classes

public class NestedClass2 {
    static int i = 10;
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
