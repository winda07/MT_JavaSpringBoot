package com.learning.thread;

import java.util.Random;

public class NumberGeneration {

    private final int low;
    private final int high;
    
    public NumberGeneration(int low, int high){
        this.low = low;
        this.high = high;
    }

    public int randomNumber(){
        Random r = new Random();
        int result = r.nextInt(high-low)+low;
        return result;
    }
}
