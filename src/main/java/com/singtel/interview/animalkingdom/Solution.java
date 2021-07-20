package com.singtel.interview.animalkingdom;

import com.singtel.interview.animalkingdom.animals.Animal;
import com.singtel.interview.animalkingdom.animals.birds.Bird;
import com.singtel.interview.animalkingdom.animals.birds.Chicken;
import com.singtel.interview.animalkingdom.animals.birds.Duck;
import com.singtel.interview.animalkingdom.animals.birds.Parrot;
import com.singtel.interview.animalkingdom.animals.fishes.ClownFish;
import com.singtel.interview.animalkingdom.animals.fishes.Fish;
import com.singtel.interview.animalkingdom.animals.fishes.Shark;
import com.singtel.interview.animalkingdom.animals.insects.Butterfly;
import com.singtel.interview.animalkingdom.animals.mammals.Dolphin;
import com.singtel.interview.animalkingdom.behaviors.CaterpillarState;

public class Solution {
    public static void main(String[] args) {
        Bird chicken = new Chicken();
        chicken.sing();

        Bird bird = new Duck();
        bird.sing();


        Butterfly butterfly = new Butterfly();
        butterfly.fly();

        butterfly.setState(new CaterpillarState());
        butterfly.fly();

    }

    static void countAnimalsBasedOnType (){
        Animal[] animals = new Animal[]{
                new Duck(),
                new Chicken(),
                new Parrot(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Butterfly()
        };
    }
}
