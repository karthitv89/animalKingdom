package com.singtel.interview.animalkingdom.animals.birds;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuckTest {

    private Duck duck;

    @BeforeEach
    void setUp() {
        duck = new Duck();
    }

    @AfterEach
    void tearDown() {
        duck = null;
    }

    @Test
    void swim() {
        duck.swim();

        //TODO Assert teh sout??
    }
}