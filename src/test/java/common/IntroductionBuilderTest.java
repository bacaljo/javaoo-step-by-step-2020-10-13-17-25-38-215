package common;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.fest.assertions.api.Assertions.assertThat;

public class IntroductionBuilderTest {
    public IntroductionBuilder introductionBuilder;

    @Before
    public void setup() {
        introductionBuilder = new IntroductionBuilder();
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
        introductionBuilder.appendBasic("John", 23);

        assertThat("My name is John. I am 23 years old.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_student_appends_the_correct_intro() {
        introductionBuilder.appendStudent();

        assertThat("I am a Student.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_student_class_appends_the_correct_intro_given_student_class_is_an_integer() {
        introductionBuilder.appendStudentClass(2);

        assertThat("I am at Class 2.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_student_class_appends_the_correct_intro_given_student_is_class_leader() {
        introductionBuilder.appendStudentClass("Class 2", true);

        assertThat("I am Leader of Class 2.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_student_class_appends_the_correct_intro_given_student_is_not_the_class_leader() {
        introductionBuilder.appendStudentClass("Class 2", false);

        assertThat("I am at Class 2.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_teacher_appends_the_correct_intro() {
        introductionBuilder.appendTeacher();

        assertThat("I am a Teacher.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_teacher_class_appends_the_correct_intro_given_teacher_has_no_class() {
        introductionBuilder.appendTeacherClass(Collections.emptyList());

        assertThat("I teach No Class.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_teacher_class_appends_the_correct_intro_given_teacher_has_a_class() {
        introductionBuilder.appendTeacherClass(asList(2));

        assertThat("I teach Class 2.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_teacher_class_appends_the_correct_intro_given_teacher_has_multiple_classes() {
        introductionBuilder.appendTeacherClass(asList(2, 4));

        assertThat("I teach Class 2, 4.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_worker_appends_the_correct_intro() {
        introductionBuilder.appendWorker();

        assertThat("I am a Worker.").isEqualTo(introductionBuilder.toString());
    }

    @Test
    public void should_introduction_builder_append_worker_job_appends_the_correct_intro() {
        introductionBuilder.appendWorkerJob();

        assertThat("I have a job.").isEqualTo(introductionBuilder.toString());
    }
}
