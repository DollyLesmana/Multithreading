/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import task2.PrimeCounter;


/**
 *
 * @author Dolly Lesmana Lubis
 */
public class ThreadedPrimeCounter extends PrimeCounter implements Runnable {
    private final Thread thread;
    private long occurrence = 0L;
    
    public ThreadedPrimeCounter(long _min, long _max){
        super(_min, _max);
        thread = new Thread(this);
    }
    
    @Override
    public void count(){
        thread.start();
        try{
            thread.join();
            }
        catch (InterruptedException _ie){
            System.err.println("interrupted.");
        }
    }
    
    @Override
    public void run(){
        super.count();
    }
}
