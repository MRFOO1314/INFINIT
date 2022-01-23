package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.NotFlyable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Chicken extends Bird implements NotFlyable {
    public Chicken() {
        super(new SingHelperImpl(SoundEnum.CHICKEN));
    }

    public Chicken(SingHelper singHelper) {
        super(singHelper);
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void fly() {
        System.out.println(Constant.I_CANT_FLY);
    }
}
