// Unchecked exceptions

public class Ex_Handling2 {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        int z = y/x;

        System.out.println(z);
    }
}

// this exception give after compilation

// Exception in thread "main" java.lang.ArithmeticException: / by zero
// at Ex_Handling2.main(Ex_Handling2.java:7)


// ArithmeticException is include in an unchecked exception