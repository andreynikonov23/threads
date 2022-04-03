package nick.pack;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
