package com.clearfaun.algorythems;

public class Main {

    public static void main(String[] args) {


        //let me show you the factory method pattern

        //I am a master Pig farmer in Japan
        //My specialty is pigs
        //I make the best red pigs and black pigs in the world
        //both pigs are very different and tasty in different ways



        //Before I can make a pig I need to do a few things
        //I have two factories
        //A red pig factory and a black pig factory
        //I use a pig creator which is an interface to help me make the desired pig



        PigCreator pigCreator = new RedPigFactory();


        //the pig creator has the command make a new pig, both my factories must use this
        //command to work.
        //the red pig factory makes a new red pig
        //the pigcreator returns a new pig
        //in this case a red pig
        Pig redPig = pigCreator.MakeANewPig();

        redPig.describe();
        //output
        //I am a Red pig . I am 55.0 stone.
        //I make the sound  Oink Oink Oink.

        pigCreator = new BlackPigFactory();
        Pig newPig = pigCreator.MakeANewPig();
        newPig.describe();
        //I am a Black pig . I am 33.0 stone.
        //I make the sound  squueeeelell.
    }
}
