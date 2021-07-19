package com.singtel.interview.animalkingdom.behaviors.sing;

public class Crowing implements SingingBehavior {
    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
