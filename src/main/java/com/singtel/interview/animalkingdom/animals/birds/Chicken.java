package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.behaviors.fly.NoFly;
import com.singtel.interview.animalkingdom.behaviors.sing.Cluck;

public class Chicken extends Bird {

    public Chicken() {
        singable = new Cluck();
        flyable = new NoFly();
    }
}
