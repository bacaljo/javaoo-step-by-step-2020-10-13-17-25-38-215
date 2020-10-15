package practice08;

import common.IntroductionBuilder;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        boolean isClassLeader = this.equals(klass.getLeader());
        String studentIntroduction = new IntroductionBuilder().appendStudent()
                .appendStudentClass(klass.getDisplayName(), isClassLeader)
                .toString();

        return String.format("%s %s", super.introduce(), studentIntroduction);
    }
}
