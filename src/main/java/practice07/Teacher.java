package practice07;

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
        return String.format("%s I am a Teacher. I teach %s.",
                super.introduce(), (klass != null)
                        ? klass.getDisplayName()
                        : "No Class");
    }

    public String introduceWith(Student student) {
        boolean isMyStudent = klass.getNumber() == student.getKlass().getNumber();

        return String.format("%s I am a Teacher. %s %s.",
                super.introduce(),
                (isMyStudent) ? "I teach" : "I don't teach",
                student.getName());
    }
}
