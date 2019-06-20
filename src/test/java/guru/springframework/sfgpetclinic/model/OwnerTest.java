package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    @Test
    void dependentAssertions() {

        Owner owner = new Owner(1l, "Albert", "Silly");
        owner.setCity("Key West");
        owner.setTelephone("123456789");

        assertAll(" Test on blabla...",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Albert", owner.getFirstName(), "First Name Error...."),
                        () -> assertEquals("Silly", owner.getLastName())),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity(), "City Error...."),
                        () -> assertEquals("123456789", owner.getTelephone())
                ));
    }
}