// Abstract class

abstract class sample{
    public void display(){
        System.out.println("Welcome to class sample");
    }
}

public class Abstract1 extends sample {
    public static void main(String[] args)
    {
        Abstract1 a = new Abstract1();
        a.display();
        // sample s = new sample();   // can not make a object of abstract class
    }
}
