package com.singtel.interview.animalkingdom.animals.birds;

import com.singtel.interview.animalkingdom.behaviors.sing.Quack;
import com.singtel.interview.animalkingdom.behaviors.swim.SwimBehavior;
import com.singtel.interview.animalkingdom.behaviors.swim.SwimSwim;

public class Duck extends Bird implements SwimBehavior {

    protected SwimBehavior swimmable;

    public Duck() {
        singable = new Quack();
        swimmable = new SwimSwim();
    }

    @Override
    public void swim() {
        swimmable.swim();
    }
}