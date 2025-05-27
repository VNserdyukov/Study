package OOP.Module2.Training;

public class Trial {
    private static int passingScore;
    private String lastName;
    private int score1;
    private int score2;

    //КОНСТРУКТОРЫ

    public Trial() {
        this.score1 = 0;
        this.score2 = 0;
    }

    public Trial(String lastName, int score1, int score2) {
        this.lastName = lastName;
        this.score1 = score1;
        this.score2 = score2;
    }

    public Trial(String lastName) {
        this.lastName = lastName;
        this.score1 = 0;
        this.score2 = 0;
    }

    //ГЕТТЕРЫ

    public static int getPassingScore() {
        return passingScore;
    }

    public String getLastName() {
        return lastName;
    }

    public int getScore1() {
        return score1;
    }
    public int getScore2() {
        return score2;
    }

    //СЕТТЕРЫ

    public static void setPassingScore(int passingScore) {
        Trial.passingScore = passingScore;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    //МЕТОДЫ

    public boolean isPassed() {
        return score1 > passingScore && score2 > passingScore;
    }

    @Override
    public String toString() {
        return lastName + ";" + score1 + ";" + score2;
    }
}
