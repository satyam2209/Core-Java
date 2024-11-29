public class MyThread2 implements Runnable{
    @Override
    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public static void main(String[] args) {
        MyThread2 t2 = new MyThread2();
        Thread thread = new Thread(t2);
        thread.start();

        // object of MyThread3

        MyThread3 t4 = new MyThread3();
        t4.start();
    }
}
