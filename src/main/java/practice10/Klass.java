package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;
    private final List<Student> studentList;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        studentList = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (!studentList.contains(student)) {
            System.out.print("It is not one of us.\n");

            return;
        }

        leader = student;
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }
}
