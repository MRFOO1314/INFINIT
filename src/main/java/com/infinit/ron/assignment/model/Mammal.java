package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Speakable;
import com.infinit.ron.assignment.behavior.Walkable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public abstract class Mammal extends Animal implements Walkable, Speakable {
    private SingHelper singHelper;

    public Mammal() {
        this.singHelper = new SingHelperImpl(SoundEnum.DEFAULT);
    }

    public Mammal(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void sing() {
        singHelper.sing();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
