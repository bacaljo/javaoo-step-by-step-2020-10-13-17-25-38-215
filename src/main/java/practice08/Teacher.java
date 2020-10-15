package practice08;

import common.IntroductionBuilder;

import static common.PracticeConstants.NO_CLASS;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        boolean hasAClass = klass != null;
        String teacherIntroduction = new IntroductionBuilder().appendTeacher()
                .appendTeacherClass((hasAClass) ? klass.getNumber() : NO_CLASS)
                .toString();

        return String.format("%s %s", super.introduce(), teacherIntroduction);
    }

    public String introduceWith(Student student) {
        boolean isOwnStudent = student.getKlass().getNumber() == klass.getNumber();
        String teacherIntroduction = new IntroductionBuilder().appendTeacher()
                .appendTeacherStudent(student.getName(), isOwnStudent)
                .toString();

        return String.format("%s %s", super.introduce(), teacherIntroduction);
    }
}
