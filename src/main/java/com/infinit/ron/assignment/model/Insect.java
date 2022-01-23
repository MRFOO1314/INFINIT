package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Flyable;
import com.infinit.ron.assignment.behavior.Speakable;
import com.infinit.ron.assignment.behavior.Walkable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;

public class Insect extends Animal implements Flyable, Walkable, Speakable {
    private SingHelper singHelper;

    public Insect(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void fly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void sing() {
        singHelper.sing();
    }

    public void walk() {
        System.out.println(Constant.I_AM_WALKING);
    }

    @Override
    public void sound() {
        singHelper.sing();
    }
}
