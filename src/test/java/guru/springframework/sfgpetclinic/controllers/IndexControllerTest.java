package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;
import java.util.Map;

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

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows() {
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {
        Map<String, String> map = System.getenv();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ENV.Var.= " + entry.getKey() + " ==> " + entry.getValue());
        }
    }

    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "alber")
    @Test
    void testIfUserJT() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "fred")
    @Test
    void testIfUserFred() {
    }


}