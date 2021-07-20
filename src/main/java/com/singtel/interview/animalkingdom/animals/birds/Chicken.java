package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.behaviors.fly.NoFly;
import com.singtel.interview.animalkingdom.behaviors.sing.Cluck;
import com.singtel.interview.animalkingdom.behaviors.sing.SingingBehavior;

public class Chicken extends Bird {

    public void setSingable(SingingBehavior singable){
        this.singable = singable;
    }

    public Chicken() {
        singable = new Cluck();
        flyable = new NoFly();
    }
}
