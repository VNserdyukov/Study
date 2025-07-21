package OOP.Module5.ObserverNewspapper;

public class Bear implements Subscriber {
    private String name;

    public Bear(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(int issueNumber) {
        System.out.println(name + " читает про медведей в номере " + issueNumber);
    }
}
