package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.behaviors.sing.Cluck;
import com.singtel.interview.animalkingdom.behaviors.sing.SingingBehavior;

public class Chicken extends Bird {

    public Chicken() {
        singable = new Cluck();
    }
}
