// Multiple Catch blocks

public class Ex_Handling14 {
    public static void main(String[] args) {
        try 
        {
           int a[] = new int[5];
           a[5] = 45/0;
        } 
        catch (Exception e){
            System.out.println("General Exception " +e);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs " +e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occured " +e);
        }        
        System.out.println("Rest Of The Code");

    }
}


// it gives error because the 2nd and third block of code is already handled by 1st block of exception
