// Array
// take input from user of array using scanner by import java.util.Scanner


import java.util.Scanner;

public class Array5 {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements in an array, write number less than 10");
        n = sc.nextInt();

        int a[] = new int[10];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("The array elements are ");
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
        sc.close(); // Closing the scanner to avoid resource leak warning
    }
}


// If you close System.in, you won't be able to read from it again later in the program. Therefore, in larger applications, it’s sometimes left 
// open to allow further user input. However, for small programs like this, closing the scanner at the end is safe and good practice.