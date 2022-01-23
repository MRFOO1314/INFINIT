package com.infinit.ron.assignment.model;

import com.infinit.ron.assignment.constant.Constant;

public class Clownfish extends Fish {
    @Override
    public String size() {
        return "small";
    }

    @Override
    public String color() {
        return "orange";
    }

    public void makeJoke() {
        System.out.println(Constant.I_MAKE_JOKES);
    }
}
