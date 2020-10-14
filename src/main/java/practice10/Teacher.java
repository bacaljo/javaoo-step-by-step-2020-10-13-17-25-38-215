package practice10;

import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String classesDisplayName = String.format("Class %s",
                classes.stream()
                        .map(klass -> Integer.toString(klass.getNumber()))
                        .collect(Collectors.joining(", ")));

        return String.format("%s I am a Teacher. I teach %s.",
                super.introduce(), classesDisplayName);
    }
}
