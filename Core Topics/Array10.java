// Returning Multidimensional Array from a Method

public class Array10 {
    public static int[][] methodRetArray()
    {
        int s[][] = {{1,2,3}, {4,5,6,7},{8,9,10,11,12,13,14}};
        return s;
    }

    public static void main(String args[])
    {
        int st[][] = methodRetArray();
        for(int i=0; i<st.length; i++)
        {
            for(int j=0; j<st[i].length; j++)
            {
                System.out.print(st[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
