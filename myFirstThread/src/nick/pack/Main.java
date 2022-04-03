package nick.pack;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new TestThread());
        thread.start();
    }
}
