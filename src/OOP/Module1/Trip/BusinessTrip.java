package OOP.Module1.Trip;

public class BusinessTrip {
    static final int daily = 25;
    String name;
    int expenses;
    int days;

    int getTotal() {
        return expenses + days * daily;
    }

    void show() {
        System.out.println("Суточные = " + daily);
        System.out.println("Фамилия Имя = " + name);
        System.out.println("Транспортные расходы = " + expenses);
        System.out.println("Количество дней = " + days);
        System.out.println("Итого расходы = " + getTotal());
    }

}
