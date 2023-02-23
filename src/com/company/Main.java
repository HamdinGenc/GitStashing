package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {

        // Write your code here
       BasicFeatures Audi=new BasicFeatures();
        Audi.color="red";
        Audi.doors="4";
        Audi.engineCapacity="V8";
        Audi.headlights="blue";
        Audi.regNo="tuzik";

        //Let's write our own code.
        System.out.println("Welcome to my car");
        System.out.println("the radio is set to 80MHZ");
        System.out.println("Turn on the air conditioner");
    }

}
