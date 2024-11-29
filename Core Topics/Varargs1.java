// Variable Arguments

public class Varargs1 {
    public int sum(int ...args)
    {
        System.out.println("argument length" +args.length);
        int s=0;
        for(int x:args)
        {
            s = s + x;
        }
        return s;
    }
    public static void main(String args[])
    {
       Varargs1 f1 =new Varargs1();
       int sum1 = f1.sum(2,4);
       System.out.println("sum with 2 arguments" +sum1);

       int sum2 = f1.sum(2,4,3);
       System.out.println("sum with 2 arguments" +sum2);

       int sum3 = f1.sum(2,2,2,4);
       System.out.println("sum with 2 arguments" +sum3);
    }
}
