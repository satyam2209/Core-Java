public class thisKeyword1 {
    int x;
    public void display(int x){
        this.x=x;
    }
    public static void main(String args[]){
        thisKeyword1 f1= new thisKeyword1();
        f1.display(10);
        System.out.println("the value of x is" +f1.x);
    }
}
