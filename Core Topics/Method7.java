// static vs non-static method

class Second{
    static void mark(){
        System.out.println("Second class static function");
    }
}

public class Method7 {
    int a = 10;
    static int b = 20;
    static void display(){
        // non-static variable cannot be referenced from a static context
        // System.out.println("static method in Method6 class" +a);  // error
        System.out.println("static method in Method6 class: " +b);
    }
    void fun(){
        // non-static variable only referenced from a non-static context
        System.out.println("non static method in Method6 class: " +a);
        // static variable also use by static and non-static both
        System.out.println("non static method in Method6 class: " +b);
    }

    public static void main(String args[]){
        Method7 f1 = new Method7();
        display();
        Second.mark();
        f1.fun();
        System.out.println(f1.a);
        System.out.println(b);
    }
}

// another class of static method can be called with by the name of class.

// non-static variable only used by non-static method

// static variable used by both static and non-static

// and for used in main method we access a non static variable or method by using object.
