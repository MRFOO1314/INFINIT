package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Speakable;
import com.infinit.ron.assignment.behavior.Walkable;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Cat extends Mammal implements Speakable, Walkable {
    public Cat() {
        super(new SingHelperImpl(SoundEnum.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }

    @Override
    public void sound() {

    }

    @Override
    public void walk() {

    }
}
