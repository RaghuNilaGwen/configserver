package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertEquals(1,2);
        Assertions.assertEquals(2,3);
    }

}
