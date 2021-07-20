package com.singtel.interview.animalkingdom;

import com.singtel.interview.animalkingdom.animals.Animal;
import com.singtel.interview.animalkingdom.animals.SwimmableAnimal;
import com.singtel.interview.animalkingdom.animals.birds.*;
import com.singtel.interview.animalkingdom.animals.fishes.ClownFish;
import com.singtel.interview.animalkingdom.animals.fishes.Shark;
import com.singtel.interview.animalkingdom.animals.insects.Butterfly;
import com.singtel.interview.animalkingdom.animals.mammals.Dolphin;
import com.singtel.interview.animalkingdom.behaviors.fly.FlyBehaviour;
import com.singtel.interview.animalkingdom.behaviors.sing.SingingBehavior;
import com.singtel.interview.animalkingdom.behaviors.state.CaterpillarState;
import com.singtel.interview.animalkingdom.behaviors.swim.SwimBehavior;
import com.singtel.interview.animalkingdom.behaviors.walk.WalkBehavior;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Bird chicken = new Chicken();
        chicken.sing();

        Bird rooster = new Rooster();
        rooster.sing();

        Bird bird = new Duck();
        bird.sing();

        Butterfly butterfly = new Butterfly();
        butterfly.fly();

        butterfly.setState(new CaterpillarState());
        butterfly.fly();

        countAnimalsBasedOnType();


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


        int swimCount = 0;
        int walkCount= 0;
        int flyCount = 0;
        int singCount = 0;
        for(Animal animal : animals) {
            if (animal instanceof SwimBehavior) {
                swimCount++;
            }

            if (animal instanceof WalkBehavior) {
                walkCount++;
            }

            if (animal instanceof FlyBehaviour && !(animal instanceof Chicken) && !(animal instanceof Rooster)) {

                flyCount++;
            }

            if (animal instanceof SingingBehavior) {
                singCount++;
            }
        }

        System.out.println("Total animals who can swim: " + swimCount);
        System.out.println("Total animals who can walk: " + walkCount);
        System.out.println("Total animals who can fly: " + flyCount);
        System.out.println("Total animals who can sing: " + singCount);
    }
}
