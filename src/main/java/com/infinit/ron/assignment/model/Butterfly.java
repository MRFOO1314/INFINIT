package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.behavior.Flyable;
import com.infinit.ron.assignment.behavior.Speakable;
import com.infinit.ron.assignment.constant.Constant;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;

public class Butterfly extends Insect {
    private Insect state = new CatterpillarState(new SingHelperImpl(SoundEnum.CATERPILLAR));

    public Butterfly() {
        super(new SingHelperImpl(SoundEnum.CATERPILLAR));
    }

    public void transform() {
        state = new ButterflyState(new SingHelperImpl(SoundEnum.NO_SOUND));
    }

    @Override
    public void fly() {
        state.fly();
    }

    @Override
    public void sing() {
        state.sing();
    }

    @Override
    public void walk() {
        state.walk();
    }

    private class ButterflyState extends Insect implements Flyable {

        public ButterflyState(SingHelper singHelper) {
            super(singHelper);
        }

        @Override
        public void fly() {

        }

        @Override
        public void sound() {
            super.sing();
        }
    }

    private class CatterpillarState extends Insect implements Speakable {
        public CatterpillarState(SingHelper singHelper) {
            super(singHelper);

        }

        @Override
        public void fly() {
            System.out.println(Constant.I_CANT_FLY);
        }

        @Override
        public void sound() {
            super.sing();
        }
    }
}
