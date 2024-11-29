// method declaration

public class Method1 {
    // method not return any value then use void
    public void add(){
        int x = 2+5;
        System.out.println("The addition value is: "+ x);
    }
    public static void main(String args[])
    {
        Method1 a = new Method1();
        a.add();
    }
}
