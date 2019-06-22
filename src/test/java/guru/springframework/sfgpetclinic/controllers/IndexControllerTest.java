package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", indexController.index());
        assertEquals("index", indexController.index(), "ERROR!!!!!!!!!!!!!!!!");
        //assertEquals("indexz", indexController.index(), () ->"ERROR " + "!!!!!!!$$$$!!");
    }

    @Test
    @DisplayName("Demo test assertThrows")
    void oupsHandler() {
        assertThrows(ValueNotException.class, indexController::oopsHandler);
        //assertTimeout();
        //assertTrue("notimplemented".equals(indexController.oopsHandler()));
    }

    @Test
    @Disabled
    void timeOutTest() {
        assertTimeout(Duration.ofSeconds(1),
                () -> {
                    Thread.sleep(5000);
                    System.out.println("I AM HERE");
                }
        );
    }

    @Test
    @Disabled
    void timeOutTestPre() {
        assertTimeoutPreemptively(Duration.ofSeconds(1),
                () -> {
                    Thread.sleep(5000);
                    System.out.println("I AM HERE PRE...");
                }
        );
    }

    @Test
    void testAssumption() {
        assumeTrue("SILETTI".equals(System.getenv("SOME_ENV")));
    }
    @Test
    void testAssumptionIsTrue() {
        assumeTrue("SILETTI".equals("SILETTI"));
    }

}