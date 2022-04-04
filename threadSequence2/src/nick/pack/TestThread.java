package nick.pack;

public class TestThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("inside Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
