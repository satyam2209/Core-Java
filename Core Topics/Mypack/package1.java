package Mypack;
public class package1 {
    int n1,n2;
    public package1(int n, int m)    // when public then only its access outside this class
    {
       n1 = n;
       n2 = m;
    }
    public void max()
    {
        if(n1>n2)
        {
            System.out.println("maximum value is " + n1);
        }
        else{
            System.out.println("maximum value is " + n2);
        }
    }
    public static void main(String args[])
    {
        package1 c = new package1(4,6);
        c.max();
    }
}


// how to run
//-1-  javac package1.java
//-2-  javac -d . package1.java       
//-3-  java Mypack.package1
//output:- maximum value is 6