package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Characteristics;
import com.infinit.ron.assignment.behavior.Swimmable;
import com.infinit.ron.assignment.constant.Constant;

public class Fish extends Animal implements Swimmable, Characteristics {
    @Override
    public void swim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
