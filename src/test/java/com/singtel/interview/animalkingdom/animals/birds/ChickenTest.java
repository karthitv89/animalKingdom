package com.singtel.interview.animalkingdom.animals.birds;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ChickenTest {

    private Bird chicken;
    @BeforeEach
    public void setup() {
        chicken = new Chicken();
    }

    @Test
    @DisplayName("Testing the chicken.sing")
    public void testSing() {
        chicken.sing();
    }
}
