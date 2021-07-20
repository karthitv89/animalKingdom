package com.singtel.interview.animalkingdom;

import com.singtel.interview.animalkingdom.animals.Animal;
import com.singtel.interview.animalkingdom.behaviors.walk.WalkBehavior;

public abstract class WalkableAnimal extends Animal implements WalkBehavior {
    protected WalkBehavior walkBehavior;
    @Override
    public void walk() {
        walkBehavior.walk();
    }
}
