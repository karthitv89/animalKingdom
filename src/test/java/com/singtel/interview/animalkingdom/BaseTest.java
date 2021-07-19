package com.singtel.interview.animalkingdom;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTest {
    private final PrintStream standardOut = System.out;
    protected final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    protected void baseSetUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    protected void baseTearDown() {
        System.setOut(standardOut);
    }
}
