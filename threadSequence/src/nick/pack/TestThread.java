package nick.pack;

public class TestThread implements Runnable{
    private int i = 1;

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (Main.isFalseForA){
            for (; i <= 4; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Main.isFalseForA = false;
        }
    }
}
