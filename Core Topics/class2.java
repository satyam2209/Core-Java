// Objects

public class class2 {
    int x=10;
    String ch = "Wscube";
    void add()
    {
        System.out.println("Inside a function add");
    }

    public static void main(String args[])
    {
        System.out.println("Hello!! Java class example");
        // add();
        // error: non-static method add() cannot be referenced from a static context
    }
}


//  The error message "Cannot make a static reference to the non-static method add() from the type class2" occurs because you're trying to call the add() method,
//  which is non-static, from the main() method, which is static.


// Static vs Non-static in Java:
// Static Methods: Belong to the class and can be called without creating an instance of the class. The main() method in Java is static, so it can be called directly by the JVM without creating an object of the class.
// Non-static Methods: Belong to the instance of the class, meaning you need to create an object of the class to call them.


// Why the error happens:
// The main() method is static, and you're trying to directly call the non-static add() method. But you cannot call a non-static method from a static method without an instance(also called an "object") of the class.
