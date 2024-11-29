class Second {
  int a = 9;
  int b = 10;
  void display(){
    System.out.println("Second class method");
  }
    
}

public class class5 {
        public static void main(String args[]){
        System.out.println("In main");
        Second s = new Second();
        s.display();
    }
}
