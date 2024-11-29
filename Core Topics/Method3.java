// Parameters and Arguments

public class Method3 {
    public int add(int a, int b){   // this is paramters
        int x = a+b;
        return x;
    }

    public static void main(String args[])
    {
        Method3 a = new Method3();
        int m=9;
        int n=2;
        int y=a.add(m,n);   // this is arguments
        System.out.println("the addition value is" +y);
    }
}
