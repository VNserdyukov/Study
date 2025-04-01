import java.util.Scanner;
//Вычислите стоимость товара с учетом скидки. Пользователь вводит цену товара в виде двух целых чисел через пробел (рубли копейки).
//В следующей строке он вводит размер скидки в процентах (также целое число). Цену нужно вывести так, как показано в тесте.
//Учтите, что здесь не применяется округление по правилам математики. Стоимость товара всегда учитывается в большую сторону.
class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rub = scan.nextInt();
        int cop = scan.nextInt();
        int skid = scan.nextInt();
        rub = (rub*100) + cop;
        int proc = rub - (rub * skid / 100);
        System.out.printf("%02d руб. %02d коп.", proc / 100, proc % 100);
    }
}