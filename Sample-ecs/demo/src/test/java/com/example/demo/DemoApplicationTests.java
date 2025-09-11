package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"app.message=Test message"})
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
