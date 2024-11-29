// Find maxiumu and minimum number in array
// Passing Arrays to Methods

import java.util.Scanner;

public class Array8 {
    public int maximum(int arr[])
    {
        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public int minimum(int arr[])
    {
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size on an array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        Array8 f1= new Array8();
        int max = f1.maximum(a);
        int min = f1.minimum(a);
        
        System.out.println("The maximum element is " +max);
        System.out.println("The minimum element is " +min);
        sc.close();
    }
}
