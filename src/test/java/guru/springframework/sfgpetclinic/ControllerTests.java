package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@Tag("controllers")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ControllerTests {
    @BeforeAll
    default void beforeAllDemoMethod() {
        System.out.println("ControllerTests.beforeAllDemoMethod");
    }
}
