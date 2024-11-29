// User-Defined Exceptions

class ownException extends Exception{
    public ownException(String s)
    {
        super(s);
    }
}
public class Ex_Handling15 {
    public static void main(String[] args) {
        try {
            throw new ownException("user defined exception");
        } catch (ownException e) {
            System.out.println("caught");
            System.out.println(e.getMessage());
        }
    }
}
