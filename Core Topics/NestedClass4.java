// Non-Static Nested Class
   // Member Inner Class

public class NestedClass4 {
   private int i = 10;
   class inner {
    void display()
    {
        System.out.println("data is" +i);
    }
   }  

   public static void main(String[] args) {
      NestedClass4 n = new NestedClass4();
      NestedClass4.inner in = n.new inner();
      in.display();
   }
}
