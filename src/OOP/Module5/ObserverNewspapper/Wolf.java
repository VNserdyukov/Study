package OOP.Module5.ObserverNewspapper;

public class Wolf implements Subscriber {
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(int issueNumber) {
        System.out.println(name + " читает про волков в номере " + issueNumber);
    }
}
