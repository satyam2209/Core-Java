interface myInterface{
    public void method1();
    public void method2();
}

public class Interface2 implements myInterface {
    public void method1(){
        System.out.println("This is method 1");
    }

    public void method2(){
        System.out.println("This is second method");
    }

    public static void main(String args[])
    {
        Interface2 i = new Interface2();
        i.method1();
        i.method2();
    }
}
