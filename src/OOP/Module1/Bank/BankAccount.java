package OOP.Module1.Bank;

public class BankAccount {
    private String number;
    private String name;
    private int amount;
    private int id;
    private static int idNext = 1;

    public BankAccount(String name, int amount) {
        this.id = idNext++;
        this.number = String.format("%020d", id);
        this.name = name;
        this.amount = amount;
    }

    public BankAccount(String name) {
        this.id = idNext++;
        this.number = String.format("%020d", id);
        this.name = name;
        this.amount = 0;
    }
    //СЕТТЕРЫ
    public void setName(String name) {
        this.name = name;
    }
    //ГЕТТЕРЫ
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
    //МЕТОДЫ
    public void increase(int amount){
        this.amount += amount;
    }

    public void decrease(int amount){
        this.amount -=amount;
    }

    public int debt(){
        if (amount >= 0) {
            return  0;
        } else {
            return Math.abs(amount);
        }
    }

    public void show() {
        System.out.println("number = " + number + "\norganization = " + name + "\nvalue = " + amount + "\n");
    }
    //ПЕРЕОПРЕДЕЛЕНИЯ
    @Override
    public String toString() {
        return number + ";" + name + ";" + amount;
    }
}
