package com.singtel.interview.animalkingdom;

import com.singtel.interview.animalkingdom.animals.birds.Bird;
import com.singtel.interview.animalkingdom.animals.birds.Chicken;
import com.singtel.interview.animalkingdom.animals.birds.Duck;

public class Solution {
    public static void main(String[] args) {
        Bird chicken = new Chicken();
        chicken.sing();

        Bird bird = new Duck();
        bird.sing();

    }
}
