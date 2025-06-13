package OOP.Module2.Interface2Transport;

public interface Transport {
    boolean canCarry(double weight); //проверяет, может ли объект перевести груз
    void add(double weight); //добавляет груз
    double getTotalWeight(); //возвращает общий груз
}
