package OOP.Module4.StandartInterface.Comment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(";|\n");
        Comment[] list = new Comment[scan.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = new Comment(scan.next(), scan.next(), scan.nextInt());
        }
        Arrays.sort(list, new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                return o2.getLike() - o1.getLike();
            }
        });
        print(list);
        System.out.println();
        Arrays.sort(list);
        print(list);
    }

    public static void print(Comment[] list) {
        for (Comment item : list) {
            System.out.println(item);
        }
    }

}
