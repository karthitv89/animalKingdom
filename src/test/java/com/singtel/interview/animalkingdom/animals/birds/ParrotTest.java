package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.BaseTest;
import com.singtel.interview.animalkingdom.behaviors.sing.Woof;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParrotTest extends BaseTest {

    private Parrot parrot;

    @BeforeEach
    void setUp() {
        baseSetUp();
        parrot = new Parrot();
    }

    @AfterEach
    void tearDown() {
        baseTearDown();
        parrot = null;
    }

    @Test
    void sing() {
        parrot.sing();
        assertEquals("Kee, Kee", outputStreamCaptor.toString().trim());

        baseTearDown();
        baseSetUp();
        parrot.setSingable(new Woof());
        parrot.sing();
        //assertEquals("Woof, woof", outputStreamCaptor.toString().trim());

    }

    @Test
    void fly() {
        parrot.fly();
        assertEquals("I can fly", outputStreamCaptor.toString().trim());

    }
}