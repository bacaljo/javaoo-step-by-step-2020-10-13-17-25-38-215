package practice11;

public interface ClassEventManager {
    void subscribe(ClassEventListener classEventListener);

    void notifySubscribersAboutANewStudent(Klass klass, Student student);

    void notifySubscribersAboutANewClassLeader(Klass klass, Student student);
}
