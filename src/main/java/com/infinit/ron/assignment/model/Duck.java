package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Flyable;
import com.infinit.ron.assignment.behavior.Swimmable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck() {
        super(new SingHelperImpl(SoundEnum.DUCK));
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void fly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    @Override
    public void swim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
