package com.singtel.interview.animalkingdom.behaviors.sing;

public class Quack implements SingingBehavior {
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }
}
