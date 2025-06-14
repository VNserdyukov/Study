package OOP.Module2.Interface2Transport;

public class Ship implements Transport{
    double maxWeight; //грузоподъемность
    double totalWeight = 0; //текущий вес груза

    //МЕТОДЫ

    @Override
    public boolean canCarry(double weight) {
        return maxWeight + totalWeight > weight;
    }

    @Override
    public void add(double weight) {
        totalWeight += weight;
    }

    @Override
    public double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "maxWeight=" + maxWeight +
                ", totalWeight=" + getTotalWeight() +
                '}';
    }

    //КОНСТРУКТОРЫ

    public Ship(double maxWeight) {
        this.maxWeight = maxWeight;
    }

}
