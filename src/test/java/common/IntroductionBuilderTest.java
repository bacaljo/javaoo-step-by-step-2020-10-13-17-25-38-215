package common;

import org.junit.Before;
import org.junit.Test;

public class IntroductionBuilderTest {
    public IntroductionBuilder introductionBuilder;

    @Before
    public void setup() {
        introductionBuilder = new IntroductionBuilder("John", 23);
    }

    @Test
    public void should_introduction_builder_have_to_string_method_that_returns_an_empty_string_builder_result() {
        assert(introductionBuilder.toString()).isEmpty();
    }

    @Test
    public void should_introduction_builder_have_append_method_that_accepts_a_string_and_returns_the_same_introduction_builder() {
        IntroductionBuilder returnedIntroductionBuilder = introductionBuilder.append("");
    }

    @Test
    public void should_introduction_builder_have_append_method_that_appends_strings_to_string_builder() {
        introductionBuilder.append("Message");

        assert("Message").equals(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_mutiple_strings_separated_by_a_space() {
        introductionBuilder.append("Hi").append("Hello");

        assert("Hi Hello").equals(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_have_append_basic_method_that_appends_basic_intro_to_string_builder() {
        introductionBuilder.append("Message");

        assert("Message").equals(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_basic_appends_the_correct_intro() {
        introductionBuilder.appendBasic();

        assert("My name is John. I am 23 years old.").equals(introductionBuilder.toString());
    }
}
