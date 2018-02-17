package pietsch.dillon;

/**
 * PROGRAM NAME: MyThreadEnhanced.java
 * PROGRAM PURPOSE: Shows a more efficient way of creating threads
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/22/2017
 */
public class MyThreadEnhanced implements Runnable{
    Thread thrd;

    //Construct a new thread.
    MyThreadEnhanced(String name){
        thrd = new Thread(this, name); // The thread is named when it is created
        thrd.start(); // start the thread
    }

    // Begin execution of new thread
    public void run(){
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch(InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}