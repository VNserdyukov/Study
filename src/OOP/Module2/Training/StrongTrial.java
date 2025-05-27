package OOP.Module2.Training;

public class StrongTrial extends Trial{
    private static int limit;
    private int timeToFinish;

    //КОНСТРУКТОРЫ

    public StrongTrial(String lastName, int score1, int score2, int timeToFinish) {
        super(lastName, score1, score2);
        this.timeToFinish = timeToFinish;
    }

    //СЕТТЕРЫ

    public static void setLimit(int limit) {
        StrongTrial.limit = limit;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }

    //ГЕТТЕРЫ

    public static int getLimit() {
        return limit;
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public boolean isPassed() {
        return timeToFinish <= limit;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + timeToFinish;
    }
}
