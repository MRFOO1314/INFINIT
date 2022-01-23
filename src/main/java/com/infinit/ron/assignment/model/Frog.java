package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Speakable;
import com.infinit.ron.assignment.behavior.Swimmable;
import com.infinit.ron.assignment.behavior.Walkable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Frog extends Animal implements Swimmable, Walkable, Speakable {
    SingHelper singHelper;

    public Frog() {
        singHelper = new SingHelperImpl(SoundEnum.DEFAULT);
    }

    @Override
    public void sound() {
        singHelper.sing();
    }

    @Override
    public void swim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    @Override
    public void walk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
