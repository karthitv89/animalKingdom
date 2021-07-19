package com.singtel.interview.animalkingdom.behaviors.fly;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Sorry!! I can't fly");
    }
}
