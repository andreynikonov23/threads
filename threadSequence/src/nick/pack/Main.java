package nick.pack;

public class Main {
    public static boolean isFalseForA = true;
    public static boolean isFalseForB = true;
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();
        thread.join();
        if (!isFalseForA){
            System.out.println("Нить A прервана");
        }
        Thread.sleep(1000);
        TestThreadB testThreadB = new TestThreadB();
        Thread thread1 = new Thread(testThreadB);
        thread1.start();
        thread1.join();
        Thread.sleep(1000);
        if (!isFalseForB){
            System.out.println("Нить B прервана");
        }
    }
}
