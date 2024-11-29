// Order of execution of constructor in Single inheritance

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
        System.out.println("child class constructor");
    }
}

public class Inheritance6 {
    public static void main(String[] args)
    {
        // parent f = new parent();
        child c = new child();  
    }
}

// when create a parent class object first then its called only its own constructor.
// when create a chld class object first then it 1st called its parent class constructor then called its own constructor.
