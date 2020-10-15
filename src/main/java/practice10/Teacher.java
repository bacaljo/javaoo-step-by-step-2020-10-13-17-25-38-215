package practice10;

import common.IntroductionBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        List<Integer> classNumberList = classes.stream()
                .map(Klass::getNumber)
                .collect(Collectors.toList());
        String teacherIntroduction = new IntroductionBuilder().appendTeacher()
                .appendTeacherClass(classNumberList)
                .toString();

        return String.format("%s %s",
                super.introduce(), teacherIntroduction);
    }

    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        String teacherIntroduction = new IntroductionBuilder().appendTeacher()
                .appendTeacherStudent(student.getName(), isTeaching(student))
                .toString();

        return String.format("%s %s", super.introduce(), teacherIntroduction);
    }
}
