public class MyThread3 extends Thread{
    @Override
    public void run()
    {
        for(int i=10; i>=0; i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }


    // not need of this when we run this thread with MyThread2.java

    // public static void main(String[] args) {
    //     MyThread3 t3 = new MyThread3();
    //     t3.start();
    // }
    
}
