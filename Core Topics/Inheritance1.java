// Example of Inheritance

class second {
    public int m = 100;

    public void display() {
        System.out.println("The Parent class");
    }
}

public class Inheritance1 extends second {
    public void childDisplay() {
        System.out.println("The child class");
    }

    public static void main(String[] args) {
        Inheritance1 f1 = new Inheritance1();
        second s = new second();
        s.display();
        f1.childDisplay();
        f1.display();
        
        f1.m = 50;
        System.out.println(s.m);
        System.out.println(f1.m);
    }
}
