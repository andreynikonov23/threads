package nick.pack;

public class Stopwatch implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        int i = 0;
        while (!current.isInterrupted()){
            System.out.println(i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
