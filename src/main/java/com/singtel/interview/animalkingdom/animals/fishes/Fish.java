package com.singtel.interview.animalkingdom.animals.fishes;

import com.singtel.interview.animalkingdom.animals.Animal;
import com.singtel.interview.animalkingdom.behaviors.swim.SwimBehavior;
import com.singtel.interview.animalkingdom.behaviors.swim.SwimSwim;
import com.singtel.interview.animalkingdom.util.AnimalSize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public abstract class Fish extends Animal implements SwimBehavior {
    protected SwimBehavior swimmable;
    private String color;
    private AnimalSize size;
    protected boolean isPredator;

    protected Fish(String color, AnimalSize size, boolean isPredator) {
        swimmable = new SwimSwim();
        setColor(color);
        setSize(size);
        setPredator(isPredator);
    }

    @Override
    public void swim() {
        swimmable.swim();
    }
}
