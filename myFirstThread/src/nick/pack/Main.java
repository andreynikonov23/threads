package nick.pack;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new TestThread());
        thread.start();
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
    }
    public static class ThreadTest extends Thread implements Runnable{
        static {
            System.out.println("it's static block inside TestThread");
        }
        @Override
        public void run(){
            System.out.println("it's run method");
        }
    }
}
