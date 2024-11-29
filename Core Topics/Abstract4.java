abstract class language{
    abstract void speak();
}

class l1 extends language{
    public void speak(){
        System.out.println("I will speak hindi");
    }
}

class l2 extends language{
    public void speak(){
        System.out.println("I will speak english");
    }
}

public class Abstract4 {
    public static void main(String[] args)
    {
        l2 obj1 = new l2();
        obj1.speak();
        l1 obj2 = new l1();
        obj2.speak();
    }
}
