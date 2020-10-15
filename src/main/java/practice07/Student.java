package practice07;

import common.IntroductionBuilder;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return new IntroductionBuilder().appendBasic(getName(), getAge())
                .appendStudent()
                .appendStudentClass(klass.getDisplayName(), false)
                .toString();
    }
}
