package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.constant.Constant;

public class Shark extends Fish {
    @Override
    public String size() {
        return "large";
    }

    @Override
    public String color() {
        return "grey";
    }

    public void canEat() {
        System.out.println(Constant.I_EAT_FISH);
    }
}
