package OOP.Module5.ObserverInforming;

public class Institution {
    private String name;

    public Institution(String name) {
        this.name = name;
    }

    public void receiveMessage(String source, String message) {
        System.out.println(name + " received information from " + source + ":");
        System.out.println(message);
    }
}