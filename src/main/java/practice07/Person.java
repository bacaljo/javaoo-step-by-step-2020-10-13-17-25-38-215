package practice07;

import common.IntroductionBuilder;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return new IntroductionBuilder().appendBasic(name, age).toString();
    }
}
