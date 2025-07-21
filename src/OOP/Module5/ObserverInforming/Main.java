package OOP.Module5.ObserverInforming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Informator informator1 = new Informator("МЧС");
        Informator informator2 = new Informator("Налоговая инспекция");

        Institution one = new Institution("ГГУ им. Ф. Скорины");
        Institution two = new Institution("БГУ");

        informator1.addListener(one);
        informator1.addListener(two);

        informator2.addListener(one);
        informator2.addListener(two);

        String data = scan.nextLine();
        while (!"end".equals(data)) {
            String[] words = data.split(";");
            int informatorNumber = Integer.parseInt(words[0]);
            if (informatorNumber == 1) {
                informator1.setText(words[1]);
            } else {
                informator2.setText(words[1]);
            }
            data = scan.nextLine();
        }
    }
}
