package com.learning.thread;

public class ThreadNumber extends Thread {
    private final NumberGeneration ng;

    public ThreadNumber(NumberGeneration ng){
        this.ng= ng;
    }

    // @Override
    public void run(){
        callGenerator();
    }

    private void callGenerator(){
        synchronized (ng){
            for(int i=0; i<3; i++){
                System.out.println(getName() + " " + ng.randomNumber());
            }
        }
    }
}
