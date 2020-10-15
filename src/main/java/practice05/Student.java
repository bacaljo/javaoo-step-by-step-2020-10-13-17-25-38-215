package practice05;

import common.IntroductionBuilder;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return new IntroductionBuilder().appendBasic(getName(), getAge())
                .appendStudent()
                .appendStudentClass(klass)
                .toString();
    }
}