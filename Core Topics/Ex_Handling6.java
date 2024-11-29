// Throwable Classes

public class Ex_Handling6 {
    public static void main(String[] args) {
        try {
            int i = 10/0;
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Cause "+ t.getCause());
        }
    }
}
