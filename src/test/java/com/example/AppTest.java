package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void greetingIsCorrect() {
        assertEquals("Hello from Maven via Jenkins!", App.greeting());
    }
}
