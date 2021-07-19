package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;


public class ChickenTest extends BaseTest {

    private Bird chicken;

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
        chicken = new Chicken();
    }

    @Test
    @DisplayName("Testing the chicken.sing")
    public void testSing() {
        chicken.sing();
        Assertions.assertEquals("Cluck, Cluck", outputStreamCaptor.toString()
                .trim());

    }
}
