// Recursion  or Recursive Nethods

public class Recursion1 {
    public int fact(int n){
        int f= 1;
        if (n==1){
            return 1;
        }
        else
        {
            f = n*fact(n-1);
            System.out.println(f);
        }
        return f;
    }

    public static void main(String args[]){
       Recursion1 f1 = new Recursion1();
       int m;
       m=f1.fact(5);
       System.out.println("The factorial is" +m);
    }
}
