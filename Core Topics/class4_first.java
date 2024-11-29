// Multiple classes in Different files

public class class4_first {
    int m = 20;
    int n = 30;
    void add(){
        int x=m+n;
        System.out.println("The added value is");
        System.out.println(x);
    }

    public static void main(String args[])
    {
        System.out.println("My first file");
        class4_first f1 = new class4_first();
        f1.add();
        System.out.println("Calling the function of another class from a separate file");
        class4_second f2 = new class4_second();
        f2.fun();
    }
}
