public class Consumer extends Thread {
    Company c;
    Consumer(Company c)
    {
        this.c = c;
    }

    public void run()
    {
        while(true)
        {
            try {
                this.c.consume_item();
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            
            
        }
    }
}
