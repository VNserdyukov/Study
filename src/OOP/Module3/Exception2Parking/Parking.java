package OOP.Module3.Exception2Parking;

public class Parking {
    byte maxQuantity;

    public Parking(byte maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public void check(byte quantity) throws TooManyCarsException {
        System.out.println("Ищем место для парковки");
        if (quantity > maxQuantity) {
            throw new TooManyCarsException();
        }
        System.out.println("Нашли место для парковки");
    }
}
