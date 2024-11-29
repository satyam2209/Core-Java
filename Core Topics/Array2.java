// Array

public class Array2 {
    public static void main(String[] args)
    {
        int a[]= new int[]{10, 12, 33, 45, 85};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        a[4]=99;
        System.out.println(a[4]);
        System.out.println("The length of an array is: " +a.length);
    }
}
