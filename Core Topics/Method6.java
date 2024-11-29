// static vs non-static method

class Second{
    static void mark(){
        System.out.println("Second class static function");
    }
}

public class Method6 {
    static int a = 10;
    static void display(){
        System.out.println("static method in Method6 class" +a);
    }
    void fun(){
        System.out.println("non static method in Method6 class" +a);
    }

    public static void main(String args[]){
        Method6 f1 = new Method6();
        display();
        Second.mark();
        f1.fun();
    }
}

// another class of static method can be called with by the name of class.
