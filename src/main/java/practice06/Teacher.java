package practice06;

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
        return String.format("%s I am a Teacher. I teach %s.",
                super.introduce(), (klass >= 0)
                        ? "Class " + klass
                        : "No Class");
    }
}
