package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupedAssertions() {
        Person person = new Person(1L, "Alberto", "Siletti");
        assertAll("groped Test #1",
                () -> assertTrue("Alberto".equals(person.getFirstName())),
                () -> assertEquals("Siletti", person.getLastName())
        );
    }

    @Test
    void groupedAssertions2() {
        Person person = new Person(1L, "Alberto", "Siletti");
        assertAll("groped Test #2",
                () -> assertTrue("Alberto".equals(person.getFirstName()), "Error on name........"),
                () -> assertEquals("Siletti", person.getLastName(), "Error on lastName........")
        );
    }

    @RepeatedTest(value = 5, name = "{displayName} :: repetition {currentRepetition} of {totalRepetitions}")
    @DisplayName("Ciao !")
    void myRepetedTest() {
    }
}