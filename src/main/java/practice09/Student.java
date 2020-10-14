package practice09;

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
        boolean isLeaderOfClass = klass.getLeader() != null && klass.getLeader().equals(this);

        return String.format("%s I am a Student. I am %s %s.",
                super.introduce(),
                isLeaderOfClass ? "Leader of" : "at",
                klass.getDisplayName());
    }
}
