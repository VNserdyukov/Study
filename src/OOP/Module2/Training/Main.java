package OOP.Module2.Training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Trial.setPassingScore(scan.nextInt());
        StrongTrial.setLimit(scan.nextInt());
        int mas = scan.nextInt();
        Trial[] students = new Trial[mas];
        for (int i = 0; i < students.length; i++) {
            int typeTest = scan.nextInt();
            if (typeTest == 1) {
                students[i] = new Trial(scan.next(), scan.nextInt(),scan.nextInt());
            }
            if (typeTest == 2) {
                students[i] = new LightTrial(scan.next(), scan.nextInt(), scan.nextInt());
            }
            if (typeTest == 3) {
                students[i] = new StrongTrial(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            }
        }

        /* Пример преподавателя через switch
        int n = scan.nextInt();
        Trial[] list = new Trial[n];
        for (int i = 0; i < list.length; i++) {
            int type = scan.nextInt();
            String name = scan.next();
            int ball1 = scan.nextInt();
            int ball2 = scan.nextInt();
            switch (type) {
                case 1:
                    list[i] = new Trial(name, ball1, ball2);
                    break;
                case 2:
                    list[i] = new LightTrial(name, ball1, ball2);
                    break;
                case 3:
                    list[i] = new StrongTrial(name, ball1, ball2, scan.nextInt());
                    break;
                default:
                    list[i] = null;
        */


        for (Trial student : students) {
            System.out.println(student);
        }

        System.out.println();

        for (Trial student : students) {
            if (student.isPassed()) {
                System.out.println(student);
            }
        }
    }
}
