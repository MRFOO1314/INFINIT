package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Dog extends Mammal {
    public Dog() {
        super((new SingHelperImpl(SoundEnum.DOG)));
    }

    public Dog(SingHelper singHelper) {
        super(singHelper);
    }

    @Override
    public void sound() {
        super.sing();
    }

    @Override
    public void walk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
