package common;

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
        return (isClassLeader)
                ? appendSentence(String.format("I am Leader of %s", classDisplayName))
                : appendSentence(String.format("I am at %s", classDisplayName));
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
