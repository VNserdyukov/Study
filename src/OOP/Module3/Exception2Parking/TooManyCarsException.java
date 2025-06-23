package OOP.Module3.Exception2Parking;

public class TooManyCarsException extends Exception {
    public TooManyCarsException() {
        super("Вся парковка занята. Свободных мест нет.");
    }
}
