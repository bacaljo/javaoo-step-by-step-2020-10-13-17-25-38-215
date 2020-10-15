package practice06;

import common.IntroductionBuilder;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
        klass = -1;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String teacherIntroduction = new IntroductionBuilder().appendTeacher()
                .appendTeacherClass(klass)
                .toString();

        return String.format("%s %s", super.introduce(), teacherIntroduction);
    }
}
