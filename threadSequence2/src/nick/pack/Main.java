package nick.pack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();
        thread.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("inside main: " + i);
            Thread.sleep(1000);
        }
    }
}
