package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.animals.Animal;
import com.singtel.interview.animalkingdom.behaviors.sing.SingingBehavior;

public abstract class Bird extends Animal implements SingingBehavior {
    protected SingingBehavior singable;

    public void setSingable(SingingBehavior singable) {
        this.singable = singable;
    }

    public void sing() {
        singable.sing();
    }
}
