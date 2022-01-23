package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Flyable;
import com.infinit.ron.assignment.behavior.Speakable;
import com.infinit.ron.assignment.behavior.Walkable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Bird extends Animal implements Walkable, Speakable, Flyable {
    private SingHelper singHelper;

    public Bird(){
        singHelper = new SingHelperImpl(SoundEnum.DEFAULT);
    }

    public Bird(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    @Override
    public void sound() {
        singHelper.sing();
    }

    @Override
    public void walk() {
        System.out.println(Constant.I_AM_WALKING);
    }

    @Override
    public void fly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
