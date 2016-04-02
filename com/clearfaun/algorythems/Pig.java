package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/1/16.
 */
public abstract class Pig {

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    String colour;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    double size;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    String sound;


    public void describe(){
        System.out.println("I am a " + colour + " pig ." + " I am " + size + " stone.");
        System.out.println("I make the sound  " + sound + ". " );
    }
}
