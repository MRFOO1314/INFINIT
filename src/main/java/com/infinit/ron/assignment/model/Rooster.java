package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Rooster extends Chicken {
    SingHelper singHelper;

    public Rooster() {
        this.singHelper = new SingHelperImpl(SoundEnum.ROOSTER);
    }

    @Override
    public void sound() {
        singHelper.sing();
    }
}
