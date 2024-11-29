interface myInterface{
    public void method1();
    public void method2();
}

public class Interface3 implements myInterface {
    public void method1(){
        System.out.println("This is method 1");
    }

    // public void method2(){
    //     System.out.println("This is second method");
    // }

    public static void main(String args[])
    {
        Interface3 i = new Interface3();
        i.method1();
        // i.method2();
    }
}

// this give the error because i not make a method body

// The type Interface3 must implement the inherited abstract method myInterface.method2()