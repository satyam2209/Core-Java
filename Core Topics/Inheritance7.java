// Order of execution of constructor in Multilevel inheritance

class parent
{
    parent()
    {
        System.out.println("Parent class constructor called");
    }
}

class child extends parent{
    child()
    {
        System.out.println("child class constructor called");
    }
}

class child2 extends child{
    child2()
    {
        System.out.println("Third child class constructor called that is Inheritance/Multilevel");
    }
}

public class Inheritance7 {
    public static void main(String[] args)
    {
        // parent f = new parent();
        child2 c = new child2();  
    }
}

// when create a parent class object first then its called only its own constructor.
// when create a chld class object first then it 1st called its parent class constructor then called its own constructor.
