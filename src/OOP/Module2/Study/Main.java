package OOP.Module2.Study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baseScholarship = scan.nextInt();
        Student.setBaseScholarship(baseScholarship);

        int mas = scan.nextInt();
        Learner[] learners = new Learner[mas];

        for (int i = 0; i < learners.length; i++) {
            int type = scan.nextInt();
            String name = scan.next();
            int grade1 = scan.nextInt();
            int grade2 = scan.nextInt();
            switch (type) {
                case 1:
                    String school = scan.next();
                    String gruppa = scan.next();
                    learners[i] = new Schoolboy(name, grade1, grade2, school, gruppa);
                    break;
                case 2:
                    String university = scan.next();
                    String grup = scan.next();
                    learners[i] = new Student(name, grade1, grade2, university, grup);
                    break;
                default:
                    learners[i] = null;
            }
        }

        double averageGrade = 0;
        for (Learner learner : learners) {
            System.out.println(learner.toString() + " каникулы: " + learner.holidays());
            averageGrade += learner.averageGrade();
        }
        System.out.printf("%.1f\n", (averageGrade / mas));

        boolean findStudent = false;
        int totalScholarship = 0;
        for (Learner learner : learners) {
            if (learner instanceof Student student) {
                totalScholarship += student.calculateScholarship();
                System.out.println(student);
                findStudent = true;
            }
        }
        if (findStudent) {
            System.out.println(totalScholarship);
        } else {
            System.out.println("NO");
        }

    }
}
