package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.behaviors.fly.FlyHigh;
import com.singtel.interview.animalkingdom.behaviors.sing.Screech;
import com.singtel.interview.animalkingdom.behaviors.sing.SingingBehavior;

public class Parrot extends Bird {
    public Parrot() {
        flyable = new FlyHigh();
        singable = new Screech();
    }


    public void setSingable(SingingBehavior singable) {
        this.singable = singable;
    }
}
