package nick.pack;

public class Run4 extends Thread implements Runnable, Massage{
    private boolean stop = true;
    @Override
    public void run() {
        while (stop){
            System.out.println(isAlive());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void showWarning(boolean stop){
        this.stop = stop;
    }
}
