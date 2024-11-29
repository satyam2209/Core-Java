// static nested classes

public class NestedClass1 {
    static int i = 10;
    static class two{
        void msg()
        {
            System.out.println("Data" + i);
        }
    }

    public static void main(String[] args) {
        NestedClass1.two obj = new NestedClass1.two();
        obj.msg();
    }
}
