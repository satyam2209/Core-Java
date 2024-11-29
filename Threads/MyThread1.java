// creating our thread using Runnable Interface
public class MyThread1 implements Runnable {
    @Override
    public void run()
    {
        // task for thread...
        for(int i=10; i<20; i++)
        {
            System.out.println("value of i is " +i);
        }
    }

    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        // t1.start();
        Thread thread = new Thread(t1);
        thread.start();
    }
}
