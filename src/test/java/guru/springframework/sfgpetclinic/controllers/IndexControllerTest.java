package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        //assertTrue("notimplemented".equals(indexController.oopsHandler()));
    }
}