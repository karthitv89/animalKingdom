package com.singtel.interview.animalkingdom.behaviors;

public class CaterpillarState implements State {
    @Override
    public void doMove() throws IllegalArgumentException {
        System.out.println("I cannot fly, but can crawl");
    }
}