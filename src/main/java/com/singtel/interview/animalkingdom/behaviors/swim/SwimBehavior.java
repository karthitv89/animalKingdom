package com.singtel.interview.animalkingdom.behaviors.swim;

public interface SwimBehavior {
    default void swim() {
        System.out.println("I can swim");
    }
}
