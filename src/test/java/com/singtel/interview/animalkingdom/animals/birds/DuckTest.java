package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuckTest extends BaseTest {

    private Duck duck;

    @BeforeEach
    void setUp() {
        super.baseSetUp();
        duck = new Duck();
    }

    @AfterEach
    void tearDown() {
        super.baseTearDown();
        duck = null;
    }

    @Test
    void swim() {
        duck.swim();
    }
}