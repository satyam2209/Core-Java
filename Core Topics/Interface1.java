interface shape{
    void area(int l, int b);
}

class rectangle implements shape{
    public void area(int l, int b)
    {
        System.out.println("The area of rectangle is" +(l*b));
    }
}

public class Interface1 {
    public static void main(String[] args)
    {
        rectangle r = new rectangle();
        r.area(3, 4);
    }
}
