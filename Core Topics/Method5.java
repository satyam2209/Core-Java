// satic vs non-static method

public class Method5 {
    static void display(){
        System.out.println("static method in Method5 class");
    }
    void fun(){
        System.out.println("non static function in Method5 class");
    }

    public static void main(String args[]){
        Method5 f1=new Method5();
        //f1.display()    // it is also run but give warning
        display();  // static method can be called directly without using object
        f1.fun();
    }
}

// static method can also call by using object or without object both but it should call via witout object if the static method is within same class