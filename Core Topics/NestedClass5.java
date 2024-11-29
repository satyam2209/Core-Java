// Non-Static Nested Class
   // Anonymous inner class

abstract class out {
    abstract void msg();
}

public class NestedClass5 {
    public static void main(String[] args) {
        out o = new out() {
            void msg(){
                System.out.println("this is a display function");
            }
        };
        o.msg();
    }
}
