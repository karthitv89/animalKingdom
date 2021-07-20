package com.singtel.interview.animalkingdom.animals.insects;

import com.singtel.interview.animalkingdom.animals.Animal;
import com.singtel.interview.animalkingdom.behaviors.state.ButterflyState;
import com.singtel.interview.animalkingdom.behaviors.state.State;
import com.singtel.interview.animalkingdom.behaviors.fly.FlyBehaviour;
import com.singtel.interview.animalkingdom.behaviors.fly.FlyHigh;

public class Butterfly extends Animal implements FlyBehaviour {

    protected FlyBehaviour flyable;

    private State state;

    public Butterfly() {
        flyable = new FlyHigh();
        state = new ButterflyState();
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void fly() {
        state.doMove();
        ;
    }
}
