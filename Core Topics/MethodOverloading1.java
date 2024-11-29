public class MethodOverloading1 {
    double area(double r){
        double x;
        x=3.14*r*r;
        return x;
    }

    public static void main(String args[]){
        MethodOverloading1 f1= new MethodOverloading1();
        double m;
        // int n;
        m = f1.area(2.21);
        // n = f1.area(1.81);  // this gives error Type mismatch: cannot convert from double to int
        System.out.println(m);
    }
}
