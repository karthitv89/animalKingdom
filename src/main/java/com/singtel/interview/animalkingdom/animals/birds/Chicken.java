package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.behaviors.sing.Cluck;
import com.singtel.interview.animalkingdom.behaviors.sing.SingingBehavior;

public class Chicken extends Bird {
    private SingingBehavior singable;

    public Chicken() {
        singable = new Cluck();
    }

    public void setSingable(SingingBehavior singable) {
        this.singable = singable;
    }

    public void sing() {
        singable.sing();
    }
}
