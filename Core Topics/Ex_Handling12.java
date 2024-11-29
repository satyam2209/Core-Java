// Multiple Catch blocks

public class Ex_Handling12 {
    public static void main(String[] args) {
        try 
        {
            int a[] = new int[5];
            a[5] = 30/0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs" +e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occured" +e);
        }
        catch (Exception e){
            System.out.println("General Exception" +e);
        }
        System.out.println("Rest Of The Code");

    }
}
