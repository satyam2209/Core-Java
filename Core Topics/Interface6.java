//  Implementing Multiple Interfaces and extend class also

interface shape{
    void area(int l, int b, int h);
 }
 
 interface display{
     void dprint(int a);
 }

 class sample{
    public void sprint(){
        System.out.println("This is the inherited class");
    }
 }
 
 public class Interface6 extends sample implements shape,display {
     public void area(int l, int b, int h)
     {
         System.out.println("the area is" +(l*b*h));
     }
 
     public void dprint(int a)
     {
         System.out.println("The passsed value is" +a);
     }
 
     public static void main(String[] args)
     {
         Interface6 i = new Interface6();
         i.area(2, 3, 4);
         i.dprint(4);
         i.sprint();
     }
 }
 