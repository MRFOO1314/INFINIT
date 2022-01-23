package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Swimmable;
import com.infinit.ron.assignment.constant.Constant;

public class Dolphin extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
