package OOP.Module2.Study;

public abstract class Student extends Learner {
    private String university;
    private String group;
    private static int baseScholarship;

    //МЕТОДЫ

    public int calculateScholarship() {
        if(averageGrade() >= 9){
            return (int)(baseScholarship * 1.6);
        }else if(averageGrade() >= 8){
            return (int)(baseScholarship * 1.4);
        }else if(averageGrade() >= 6){
            return (int)(baseScholarship * 1.2);
        }else if(averageGrade() >= 5){
            return baseScholarship;
        }else{
            return 0;
        }
    }

    //ПЕРЕОПРЕДЕЛЕНИЯ

    @Override
    public String toString() {
        return super.toString() + ";" + university + ";" + group;
    }

    //КОНСТРУКТОРЫ

    public Student() {
    }

    public Student(String name, int grade1, int grade2, String university, String group) {
        super(name, grade1, grade2);
        this.university = university;
        this.group = group;
    }

    //СЕТТЕРЫ

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static void setBaseScholarship(int baseScholarship) {
        Student.baseScholarship = baseScholarship;
    }

    //ГЕТТЕРЫ

    public String getUniversity() {
        return university;
    }

    public String getGroup() {
        return group;
    }

    public static int getBaseScholarship() {
        return baseScholarship;
    }
}
