package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.animals.Animal;
import com.singtel.interview.animalkingdom.behaviors.fly.FlyBehaviour;
import com.singtel.interview.animalkingdom.behaviors.sing.SingingBehavior;

public abstract class Bird extends Animal implements SingingBehavior, FlyBehaviour {
    protected SingingBehavior singable;
    protected FlyBehaviour flyable;

    public void sing() {
        singable.sing();
    }

    public void fly() {
        flyable.fly();
    }
}
