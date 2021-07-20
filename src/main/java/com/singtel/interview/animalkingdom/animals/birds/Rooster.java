package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.behaviors.sing.Crowing;

public class Rooster extends Bird {

    private Chicken chicken;
    public Rooster() {
        chicken = new Chicken();
        chicken.setSingable(new Crowing());
    }

    @Override
    public void fly() {
        chicken.fly();
    }

    @Override
    public void sing() {
        chicken.sing();
    }
}

