package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

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
}