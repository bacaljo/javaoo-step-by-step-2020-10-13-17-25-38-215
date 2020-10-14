package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person implements ClassEventListener {
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new ArrayList<>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> klass.subscribe(this));
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        boolean hasAnyClass = !classes.isEmpty();
        String classesDisplayName = (hasAnyClass)
                ? String.format("Class %s", classes.stream().map(klass -> Integer.toString(klass.getNumber())).collect(Collectors.joining(", ")))
                : "No Class";

        return String.format("%s I am a Teacher. I teach %s.",
                super.introduce(), classesDisplayName);
    }

    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }

    public String introduceWith(Student student) {
        return String.format("%s I am a Teacher. I %s %s.",
                super.introduce(),
                (isTeaching(student)) ? "teach" : "don't teach",
                student.getName());
    }

    @Override
    public void newStudentUpdate(Klass klass, Student student) {
        System.out.printf("I am %s. I know %s has joined %s.\n",
                getName(), student.getName(), klass.getDisplayName());
    }
}
