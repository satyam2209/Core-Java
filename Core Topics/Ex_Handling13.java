// Multiple Catch blocks

public class Ex_Handling13 {
    public static void main(String[] args) {
        try 
        {
            String s = null;
            System.out.println(s.length());
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs " +e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occured " +e);
        }
        catch (Exception e){
            System.out.println("General Exception " +e);
        }
        System.out.println("Rest Of The Code");

    }
}

