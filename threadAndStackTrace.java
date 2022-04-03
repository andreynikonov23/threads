package nick.pack;

public class Main{
    /*
    1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
    2. SpecialThread должен выводить в консоль свой стек-трейс.
     */
    public static void main(String[] args) {
        StackTraceElement[] mainStack = Thread.currentThread().getStackTrace();
        for(StackTraceElement element : mainStack){
            System.out.println(element);
        }
        SpecialThread specialThread = new SpecialThread();
        Thread thread = new Thread(specialThread);
        thread.start();
    }
    public static class SpecialThread implements Runnable{

        @Override
        public void run() {
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            for(StackTraceElement element : methods){
                System.out.println(element);
            }
        }
    }
}
