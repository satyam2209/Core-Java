public class MethodOverloading2 {
    double area(double r){
        double x;
        x=3.14*r*r;
        return x;
    }

    int area(int m, int n){
        int x;
        x = m*n;
        return x;
    }

    public static void main(String args[]){
        MethodOverloading2 f1= new MethodOverloading2();
        double m;
        m = f1.area(2.1);
        System.out.println(m);
        int k;
        k = f1.area(5, 10);
        System.out.println(k);
    }
}
