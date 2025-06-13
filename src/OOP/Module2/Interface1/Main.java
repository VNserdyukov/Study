package OOP.Module2.Interface1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mas = scan.nextInt();
        IShape[] figure = new IShape[mas];
        for (int i = 0; i < figure.length; i++) {
            int type = scan.nextInt();
            switch (type) {
                case 1:
                    double side1 = scan.nextDouble();
                    double side2 = scan.nextDouble();
                    figure[i] = new Rectangle(side1, side2);
                    break;
                case 2:
                    double side = scan.nextDouble();
                    figure[i] = new Cube(side);
                    break;
            }
        }

        for (IShape iShape : figure) {
            System.out.printf("%.2f ", iShape.computeSquare());
        }

        System.out.println();

        double square = 0;
        int find = 0;
        for (int i = 0; i < figure.length; i++) {
            if (figure[i] instanceof Rectangle) {
                if (figure[i].computeSquare() > square) {
                    square = figure[i].computeSquare();
                    find = i;
                }
            }
        }

        if (find == 0) {
            System.out.println("ERROR");
        } else {
            System.out.print(figure[find]);
            System.out.printf(" Площадь = %.2f", figure[find].computeSquare());
        }


    }
}
