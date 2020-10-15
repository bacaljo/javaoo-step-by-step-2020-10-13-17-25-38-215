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

    private StringBuilder appendWithSpace(String text) {
        if (stringBuilder.length() > 0) {
            stringBuilder.append(" ");
        }

        stringBuilder.append(text);

        return stringBuilder;
    }

    public IntroductionBuilder append(String introductionMessage) {
        appendWithSpace(introductionMessage);

        return this;
    }

    public IntroductionBuilder appendBasic() {
        String basicIntroduction = String.format("My name is %s. I am %d years old.",
                name, age);
        stringBuilder.append(basicIntroduction);

        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}
