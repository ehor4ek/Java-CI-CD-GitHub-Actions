// HelloControllerUnitTest.java
package ru.bmstu.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import ru.bmstu.api.controller.HelloController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = HelloController.class, excludeAutoConfiguration = SecurityAutoConfiguration.class)
class HelloControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Тест /api/url1 на возврат \"Привет CI/CD!!!\"")
    void testUrl1() throws Exception {
        mockMvc.perform(get("/api/url1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Привет CI/CD!!!"));
    }

    @Test
    @DisplayName("Тест /api/url2 на возврат числа 2025")
    void testUrl2() throws Exception {
        mockMvc.perform(get("/api/url2"))
                .andExpect(status().isOk())
                .andExpect(content().string("2025"));
    }

    @Test
    @DisplayName("Тест /api/url3 на возврат true")
    void testUrl3() throws Exception {
        mockMvc.perform(get("/api/url3"))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));
    }
}