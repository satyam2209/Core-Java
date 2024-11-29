// Throwable classes

public class Ex_Handling5 {
    public static void main(String[] args)
    {
        try {
            int i = 10/0;
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
