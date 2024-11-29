// Throwable classes

public class Ex_Handling7 {
    public static void main(String[] args) {
        try {
            int[] mn = {1,2,3,4};
            System.out.println(mn[6]);
        } 
        catch (Exception e) {
            System.out.println("Error is " +e);
        }
    }
}
