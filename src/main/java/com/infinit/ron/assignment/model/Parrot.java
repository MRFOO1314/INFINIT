package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Flyable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Parrot extends Bird implements Flyable {
    public Parrot() {
        super(new SingHelperImpl(SoundEnum.DEFAULT));
    }

    public Parrot(SingHelper singHelper) {
        super(singHelper);
    }

    public void fly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
