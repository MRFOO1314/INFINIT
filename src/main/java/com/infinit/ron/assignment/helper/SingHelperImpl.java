package com.infinit.ron.assignment.helper;

import com.infinit.ron.assignment.model.SoundEnum;

public class SingHelperImpl implements SingHelper {
    private SoundEnum soundEnum;

    public SingHelperImpl(SoundEnum soundEnum) {
        this.soundEnum = soundEnum;
    }

    @Override
    public void sing() {
        System.out.println(soundEnum.getSound());
    }
}
