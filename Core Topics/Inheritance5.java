// Hierarchical Inheritance

class sample {
    int m = 10;

    public void add() {
        m = m + 10;
        System.out.println("The value of m is" + m);
    }
}

class child extends sample {
    public void display() {
        System.out.println("Child class");
    }
}

class child2 extends sample {
    void display2() {
        System.out.println("Child 2 class");
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        child c1 = new child();
        child2 c2 = new child2();
        c1.add();
        c2.add();
        c1.display();
        c2.display2();

    }
}
