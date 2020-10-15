package common;

import java.util.List;

public class IntroductionBuilder {
    private String name;
    private int age;
    private StringBuilder stringBuilder;

    public IntroductionBuilder(String name, int age) {
        this.name = name;
        this.age = age;

        stringBuilder = new StringBuilder();
    }

    public IntroductionBuilder appendSentence(String text) {
        if (stringBuilder.length() > 0) {
            stringBuilder.append(" ");
        }

        stringBuilder.append(text).append(".");

        return this;
    }

    public IntroductionBuilder appendBasic() {
        return appendSentence(String.format("My name is %s", name))
                .appendSentence(String.format("I am %d years old", age));
    }

    public IntroductionBuilder appendStudent() {
        return appendSentence("I am a Student");
    }

    public IntroductionBuilder appendStudentClass(String classDisplayName, boolean isClassLeader) {
        return appendSentence((isClassLeader)
                ? String.format("I am Leader of %s", classDisplayName)
                : String.format("I am at %s", classDisplayName));
    }

    public IntroductionBuilder appendTeacher() {
        return appendSentence("I am a Teacher");
    }

    public IntroductionBuilder appendTeacherClass(List<Integer> classNumberList) {
        return appendSentence((classNumberList.isEmpty())
                ? "I teach No Class"
                : String.format("I teach Class %d", classNumberList.get(0)));
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
