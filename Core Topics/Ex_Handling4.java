public class Ex_Handling4 {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 10;
            int z = y/x;
        } catch (Exception e) {
            System.out.println(e);   //output:  java.lang.ArithmeticException: / by zero
        }

    }
}

