// Multidimensional Array

public class Array7 {
    public static void main(String args[])
    {
        int a[][] = {{1,2,3,4}, {5,6,7,8,9,11}};
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The number of elements in first row" +a[0].length);
        System.out.println("The number of elements in second row" +a[1].length);
    }
}
