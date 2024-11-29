// without finally

public class Ex_Handling9 {
    public static void main(String[] args) {
        try {
            int[] mn = {1,2,3,4};
            System.out.println(mn[6]);
        } 
        catch (Exception e) {
           System.out.println(e);
        }
        // finally{
            System.out.println("After the try catch block");
        // }
    }
}
