package nick.pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Run5 extends Thread implements Runnable{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            String str = scanner.nextLine();
            if (!(str.equals("N"))){
                int i = Integer.parseInt(str);
                arrayList.add(i);
            } else if (str.equals("N")) {
                int result = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    result += arrayList.get(i);
                }
                System.out.println(result);
                break;
            }
        }
    }
}
