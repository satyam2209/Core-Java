// Multiple Parameters

public class Method4 {
    public void myFunction(String sname, int sage)
    {
        System.out.println("The name is: " + sname + ", age is :" +sage);
    }

    public static void main(String args[]){
        Method4 a = new Method4();
        a.myFunction("Lina", 10);

        Method4 b = new Method4();
        b.myFunction("Chriss", 12);

        Method4 c = new Method4();
        c.myFunction("Ryan", 14);
    }
}
