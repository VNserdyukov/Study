package BoostJava.Module2.List.PriorityQueue;

public class Service {
    private String name;
    private int priority;
    private int order;
    private static int globalOrder = 0;

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }

    public Service(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.order = globalOrder++;
    }
}
