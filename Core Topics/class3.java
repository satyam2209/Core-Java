// Objects

public class class3 {
    int x = 10;
    String ch = "Wscube";
    
    void add() {
        System.out.println("Inside a function add");
    }

    public static void main(String args[]) {
        System.out.println("Hello!! Java class example");
        
        // Create an instance of class3 to call the non-static method add()
        class3 obj1 = new class3(); 
        obj1.add();  // Call the non-static method using the object
        System.out.println(obj1.x);
        System.out.println(obj1.ch);
    }
}
