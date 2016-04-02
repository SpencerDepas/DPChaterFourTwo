package com.clearfaun.algorythems;

/**
 * Created by SpencerDepas on 4/1/16.
 */
public class RedPigFactory implements PigCreator {

    @Override
    public Pig MakeANewPig() {
        return new RedPig();
    }
}
