package com.singtel.interview.animalkingdom.behaviors.swim;

public class NoSwimming implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}
