package pietsch.dillon;

import org.omg.CORBA.INTERNAL;

/**
 * PROGRAM NAME: TickTock.java
 * PROGRAM PURPOSE: Use wait() and notify() methods
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/23/2017
 */
public class TickTock {

    String state; // contains the state of the clock

    synchronized void tick(boolean running){
        if(!running){ // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick ");

        // This makes TickTock actually keep time
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc){
            System.out.println("Thread interrupted.");
        }

        state = "ticked";

        notify();

        try{
            while(!state.equals("tocked"))
                wait(); // wait for tock() to complete
        } catch (InterruptedException exc){
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running){
        if(!running) { // stop the clock
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        // TickTock keeps time with this try block
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc){
            System.out.println("Thread interrupted.");
        }

        state = "tocked";

        notify(); // let tick() run
        try {
            while(!state.equals("ticked"))
                wait(); // wait for tick to complete
        } catch (InterruptedException exc){
            System.out.println("Thread interrupted.");
        }
    }

}

class TickTockThread implements Runnable{
    Thread thrd;
    TickTock ttOb;

    // Construct a new thread
    TickTockThread(String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }

    public void run(){
        if(thrd.getName().compareTo("Tick") == 0){
            for(int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        } else {
            for(int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}