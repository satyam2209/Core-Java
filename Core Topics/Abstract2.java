// Abstract method

abstract class sample{
    abstract void display2();
    public void display(){
        System.out.println("Welcome to class sample");
    }
}

class sample2 extends sample{
    public void display2(){
        System.out.println("This is class sample2");
    }
}

public class Abstract2 {
    public static void main(String[] args)
    {
        sample2 s2 = new sample2(); 
        s2.display();
        s2.display2();
    }
}
