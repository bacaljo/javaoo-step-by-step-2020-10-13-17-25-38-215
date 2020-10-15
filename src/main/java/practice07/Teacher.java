package practice07;

import common.IntroductionBuilder;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        boolean hasAClass = klass != null;
        String teacherIntroduction = new IntroductionBuilder().appendTeacher()
                .appendTeacherClass((hasAClass) ? klass.getNumber() : -1)
                .toString();

        return String.format("%s %s", super.introduce(), teacherIntroduction);
    }

    public String introduceWith(Student student) {
        boolean isMyStudent = klass.getNumber() == student.getKlass().getNumber();
        String teacherIntroduction = new IntroductionBuilder().appendTeacher()
                .appendTeacherStudent(student.getName(), isMyStudent)
                .toString();

        return String.format("%s %s", super.introduce(), teacherIntroduction);
    }
}
