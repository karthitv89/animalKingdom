package com.singtel.interview.animalkingdom.behaviors.state;

public class ButterflyState implements State {
    @Override
    public void doMove() throws IllegalArgumentException {
        System.out.println("I can fly");
    }
}
