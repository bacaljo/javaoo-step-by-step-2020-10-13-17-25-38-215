package practice06;

import common.IntroductionBuilder;

public class Student extends Person {
    private final int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String studentIntroduction = new IntroductionBuilder().appendStudent()
                .appendStudentClass(klass)
                .toString();

        return String.format("%s %s", super.introduce(), studentIntroduction);
    }
}