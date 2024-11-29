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

public class Abstract3 {
    public static void main(String[] args)
    {
        // sample s1 = new sample();   // cannot make an object

        sample s1 = new sample2();   // this is called reference object
        s1.display();
        s1.display2();           
        
    }
}
