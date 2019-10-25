package com.nobbyknox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApp() {
        assertEquals(App.greeter("stranger"), "Hello stranger");
    }
}
