package nick.pack;

public class TestThread implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()){
            System.out.println("Hello");
        }
    }
}
