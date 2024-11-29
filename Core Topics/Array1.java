// array declaration

public class Array1 {
   public static void main(String[] args)
   {
    int a[];
    a = new int[5];
    a[0] = 9;
    a[1] = 10;
    a[2] = 5;
    a[3] = 15;
    a[4] = 11;
    // a[5] = 13;
    System.out.println(a[1]);
    // System.out.println(a[5]); 
    // give error index out of bounds
   } 
}
