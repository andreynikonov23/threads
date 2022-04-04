package nick.pack;

public class Run2 implements Runnable{
    @Override
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptException");
        }
    }
}
