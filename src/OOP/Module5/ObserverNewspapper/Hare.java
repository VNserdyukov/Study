package OOP.Module5.ObserverNewspapper;

public class Hare implements Subscriber {
    private String name;

    public Hare(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(int issueNumber) {
        System.out.println(name + " читает про зайцев в номере " + issueNumber);
    }
}
