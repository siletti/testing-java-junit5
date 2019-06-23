package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {
    @Test
    @DisplayName("This is a @DisplayName!!!!!!!!...")
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

        assertThat(owner.getCity(), is("Key West"));
    }
}