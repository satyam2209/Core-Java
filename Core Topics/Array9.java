// Returning Array from a Method

public class Array9{
    
    public static int[] methodRetArray()
    {
        int s[] = {1, 2, 3, 4, 5, 6, 7, 8};
        return s;
    }
    public static void main(String[] args)
    {
        int st[] = methodRetArray();
        for(int i=0; i<st.length; i++)
        {
            System.out.println(st[i]);
        }
    }
}