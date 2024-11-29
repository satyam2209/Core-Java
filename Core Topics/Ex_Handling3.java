
public class Ex_Handling3 {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 10;
            int z = y/x;
        } catch (ArithmeticException e) {
            System.out.println(e);   //output:  java.lang.ArithmeticException: / by zero
        }
    }
}
