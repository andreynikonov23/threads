package nick.pack;

public class Main {
//1. Напиши реализацию метода run в нити Stopwatch (секундомер).
//2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
//3. Выведи количество секунд в консоль.
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Thread thread = new Thread(stopwatch);
        thread.start();
    }
}
