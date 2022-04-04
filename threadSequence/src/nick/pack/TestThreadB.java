package nick.pack;

public class TestThreadB implements Runnable{
    private int i = 4;

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (Main.isFalseForB) {
            for (; i >0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Main.isFalseForB = false;
        }
    }
}
