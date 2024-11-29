// for loop using in Array

public class Array3 {
    public static void main(String[] args)
    {
        int a[] = new int[]{3,2,1,6,7,5,4,10,9,8};
        System.out.println("The array elements are");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        a[7]=88;
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
