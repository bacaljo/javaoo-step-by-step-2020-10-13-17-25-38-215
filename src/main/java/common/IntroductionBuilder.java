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
        String basicIntroduction = String.format("My name is %s. I am %d years old.",
                name, age);
        stringBuilder.append(basicIntroduction);

        return this;
    }

    public IntroductionBuilder appendStudent() {
        return appendSentence("I am a Student");
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
