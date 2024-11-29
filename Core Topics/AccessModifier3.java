// Private AccessModifier

class sample{
    private int a=10;
    public void use()
    {
        System.out.println("The value of a is" +a);
    }
}

public class AccessModifier3 {
    public static void main(String[] args)
    {
        sample f1=new sample();
        // cannot access because it is private and only access within the class not outside the class
        // System.out.println(f1.a); 
        f1.use();
    }
    
}
