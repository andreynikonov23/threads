package nick.pack;

public class Main {

    public static void main(String[] args) {
	    Runnable runnable = new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
