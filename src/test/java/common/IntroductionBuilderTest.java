package common;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class IntroductionBuilderTest {
    public IntroductionBuilder introductionBuilder;

    @Before
    public void setup() {
        introductionBuilder = new IntroductionBuilder("John", 23);
    }

    @Test
    public void should_introduction_builder_have_to_string_method_that_returns_an_empty_string_builder_result() {
        assertThat(introductionBuilder.toString()).isEmpty();
    }

    @Test
    public void should_introduction_builder_have_append_sentence_method_that_accepts_a_string_and_returns_the_same_introduction_builder() {
        IntroductionBuilder returnedIntroductionBuilder = introductionBuilder.appendSentence("");
    }

    @Test
    public void should_introduction_builder_have_append_method_that_appends_sentence_strings_to_string_builder() {
        introductionBuilder.appendSentence("Message");

        assertThat("Message.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_sentence_mutiple_strings_separated_by_a_space_and_end_with_period() {
        introductionBuilder.appendSentence("Hi").appendSentence("Hello");

        assertThat("Hi. Hello.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_basic_appends_the_correct_intro() {
        introductionBuilder.appendBasic();

        assertThat("My name is John. I am 23 years old.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_student_appends_the_correct_intro() {
        introductionBuilder.appendStudent();

        assertThat("I am a Student.").isEqualTo(introductionBuilder.toString());
    }
}
