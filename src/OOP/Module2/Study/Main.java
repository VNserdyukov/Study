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
            String data1 = scan.next();
            String data2 = scan.next();
            switch (type) {
                case 1:
                    learners[i] = new Schoolboy(name, grade1, grade2, data1, data2) {
                        @Override
                        public int holidays() {
                            return super.holidays();
                        }
                    };
                    break;
                case 2:
                    learners[i] = new Student(name, grade1, grade2, data1, data2) {
                        @Override
                        public int holidays() {
                            return super.holidays();
                        }
                    };
                    break;
                default:
                    learners[i] = null;
            }
        }

        for (Learner learner : learners) {
            System.out.println(learner.toString() + " каникулы: " + learner.holidays());
        }

        double averageGrade = 0;
        for (Learner learner : learners) {
            averageGrade += learner.averageGrade();
        }
        System.out.printf("%.1f\n", (averageGrade / mas));

        boolean flag = false;
        int calculateScholarship = 0;
        for (Learner learner : learners) {
            if (learner instanceof Student student) {
                calculateScholarship += student.calculateScholarship();
                System.out.println(student);
                flag = true;
            }
        }
        if (flag) {
            System.out.println(calculateScholarship);
        } else {
            System.out.println("NO");
        }

    }
}
