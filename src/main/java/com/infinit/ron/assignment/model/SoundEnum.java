package com.infinit.ron.assignment.model;

public enum SoundEnum {
    DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CATERPILLAR("caterpillar"),
    CAT("Meow"),
    DEFAULT("I am singing"),
    NO_SOUND("");
    private String sound;

    SoundEnum(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
