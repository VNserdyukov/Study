package OOP.Module5.DecoratorMarvel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String descr1 = scan.nextLine();
        String descr2 = scan.nextLine();
        String[] words1 = descr1.split(" +");
        String[] words2 = descr2.split(" +");
        SuperHero one = createHero(words1);
        SuperHero two = createHero(words2);
        fight(one, two);
    }

    public static SuperHero createHero(String[] words) { //создание героя
        SuperHero result = null;
        if (Integer.parseInt(words[0]) == 1) {
            result = new GreenSuperHero();
        } else {
            result = new RedSuperHero();
        }
        for (int i = 1; i < words.length; i++) {
            int type = Integer.parseInt(words[i]);
            switch (type) {
                case 1:
                    result = new SuperPower(result);
                    break;
                case 2:
                    result = new SuperAgility(result);
                    break;
                case 3:
                    result = new SuperIntelligence(result);
                    break;
            }
        }
        return result;
    }

    public static void fight(SuperHero one, SuperHero two) { //сражение
        if (one.getChanceToSurvive() > two.getChanceToSurvive()) {
            System.out.println(one.getDescription() + " победит " + two.getDescription());
        } else if (one.getChanceToSurvive() < two.getChanceToSurvive()) {
            System.out.println(two.getDescription() + " победит " + one.getDescription());
        } else {
            System.out.println("Силы " + one.getDescription() + " и " + two.getDescription() + " равны!");
        }
    }
}