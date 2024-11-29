// Method declaration

public class Method2 {
    // method return integer type of value
    public int add(){
        int x = 2+5;
        return x;
    }

    public static void main(String args[]){
        Method2 a = new Method2();
        int y=a.add();
        System.out.println("the addition value is" +y);
    }
}
