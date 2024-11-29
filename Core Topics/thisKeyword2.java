// Calling same class constructor using this keyword

class derived{
  int x;
  int y;
  derived()
  {
    this(4,6);
  }
  derived(int a, int b)
  {
    x = a;
    y = b;
  }
  void show()
  {
    System.out.println("The value of x is"+x+" And the value of y is" +y);
  }
}

public class thisKeyword2 {
    public static void main(String args[])
    {
        derived d = new derived();
        d.show();
    }
}
