package practice08;

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

        return String.format("%s I am a Teacher. I teach %s.",
                super.introduce(),
                (hasAClass) ? klass.getDisplayName() : "No Class");
    }

    public String introduceWith(Student student) {
        boolean isOwnStudent = student.getKlass().getNumber() == klass.getNumber();

        return String.format("%s I am a Teacher. I %s %s.",
                super.introduce(),
                (isOwnStudent) ? "teach" : "don't teach",
                student.getName());
    }
}
