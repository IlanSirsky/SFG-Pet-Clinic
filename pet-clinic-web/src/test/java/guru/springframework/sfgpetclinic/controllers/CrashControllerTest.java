package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static guru.springframework.sfgpetclinic.controllers.CrashController.URL_OUPS;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class CrashControllerTest {
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new CrashController()).build();
    }

    @Test
    void triggerExceptionTest() {
        assertThatThrownBy(() -> mockMvc.perform(get(URL_OUPS)))
                .hasCauseInstanceOf(RuntimeException.class)
                .hasMessageContaining("Expected: controller used to showcase what happens when an exception is thrown");
    }
}