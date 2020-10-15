package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass implements ClassEventManager {
    private final int number;
    private final List<Student> studentList;
    private final List<ClassEventListener> classEventListenerList;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        studentList = new ArrayList<>();
        classEventListenerList = new ArrayList<>();
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
        notifySubscribersAboutANewClassLeader(this, leader);
    }

    public void appendMember(Student student) {
        studentList.add(student);
        notifySubscribersAboutANewStudent(this, student);
    }


    @Override
    public void subscribe(ClassEventListener classEventListener) {
        classEventListenerList.add(classEventListener);
    }

    @Override
    public void notifySubscribersAboutANewStudent(Klass klass, Student student) {
        classEventListenerList.forEach(classEventListener -> classEventListener.newStudentUpdate(klass, student));
    }

    @Override
    public void notifySubscribersAboutANewClassLeader(Klass klass, Student student) {
        classEventListenerList.forEach(classEventListener -> classEventListener.newClassLeaderUpdate(klass, student));
    }
}
