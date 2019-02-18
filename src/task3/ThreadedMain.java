/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import task1.Stopwatch;

/**
 *
 * @author Dolly Lesmana Lubis
 */

public class ThreadedMain {
    public static void main(String _args[]){
        Stopwatch stopwatch = new Stopwatch();
        long elapsedTime = 0L;
        long min = 0L;
        long max = 1000000L;
        int numWorker = 4;
        PrimeCounterManager pcm = new PrimeCounterManager(min, max, numWorker);
        stopwatch.record();
        pcm.count();
        elapsedTime = stopwatch.capture();
        System.out.printf("finished in %d sec(s)\n", elapsedTime);
    }
    
}
