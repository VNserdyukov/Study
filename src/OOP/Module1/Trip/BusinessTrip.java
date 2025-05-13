package OOP.Module1.Trip;

public class BusinessTrip {
    static final int DAILY = 25;
    String name;
    int expenses;
    int days;

    int getTotal() {
        return expenses + days * DAILY;
    }

    void show() {
        System.out.println("Суточные = " + DAILY);
        System.out.println("Фамилия Имя = " + name);
        System.out.println("Транспортные расходы = " + expenses);
        System.out.println("Количество дней = " + days);
        System.out.println("Итого расходы = " + getTotal());
    }

}
