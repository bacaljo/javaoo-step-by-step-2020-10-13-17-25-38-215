package practice10;

import common.IntroductionBuilder;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        boolean isClassLeader = klass.getLeader() != null && klass.getLeader().equals(this);

        return new IntroductionBuilder().appendBasic(getName(), getAge())
                .appendStudent()
                .appendStudentClass(klass.getDisplayName(), isClassLeader)
                .toString();
    }
}
