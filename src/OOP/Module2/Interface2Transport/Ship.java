package OOP.Module2.Interface2Transport;

public class Ship implements Transport{
    double maxWeight;
    double totalWeight;

    //МЕТОДЫ

    @Override
    public boolean canCarry(double weight) {
        return maxWeight > weight;
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

    public Ship() {
    }

    public Ship(double maxWeight) {
        this.maxWeight = maxWeight;
    }

}
