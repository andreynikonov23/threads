package nick.pack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Thread thread1;
    private static Thread thread2;
    private static Thread thread3;
    private static Thread thread4;
    private static Thread thread5;

    static {
        thread1 = new Thread(new Run1());
        thread2 = new Thread(new Run2());
        thread3 = new Thread(new Run3());
        thread5 = new Thread(new Run5());
        List<Thread> list = new ArrayList<>();
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
        System.out.println(list);
    }

    public static void main(String[] args) throws InterruptedException {

        thread5.start();
        thread5.join();
        Run4 run4 = new Run4();
        thread4 = new Thread(run4);
        thread4.start();
        Thread.sleep(10000);
        run4.showWarning(false);
        thread4.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread1.start();
    }
}
