package OOP.Module2.Training;

public class LightTrial extends Trial {

    //КОНСТРУКТОРЫ

    public LightTrial(String lastName, int score1, int score2) {
        super(lastName, score1, score2);
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public boolean isPassed() {
        return getScore1() + getScore2() > getPassingScore();
    }
}
