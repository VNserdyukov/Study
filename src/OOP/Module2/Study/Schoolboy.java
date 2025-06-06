package OOP.Module2.Study;

public class Schoolboy extends Learner {
    private String school;
    private String classRoom;

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return super.toString() + ";" + school + ";" + classRoom;
    }

    @Override
    public int holidays() {
        return 124;
    }

    //КОНСТРУКТОРЫ

    public Schoolboy() {
    }

    public Schoolboy(String name, int grade1, int grade2, String school, String classRoom) {
        super(name, grade1, grade2);
        this.school = school;
        this.classRoom = classRoom;
    }

    //СЕТТЕРЫ

    public void setSchool(String school) {
        this.school = school;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    //ГЕТТЕРЫ

    public String getSchool() {
        return school;
    }

    public String getClassRoom() {
        return classRoom;
    }

}
