package pietsch.dillon;

/**
 * PROGRAM NAME: ExtendThread.java
 * PROGRAM PURPOSE: Extends the thread class rather then the Runnable class
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/22/2017
 */
public class ExtendThread extends Thread{

    //Construct a new thread.
    ExtendThread(String name){
        super(name);
        start();
    }

    // Begin execution of new thread
    public void run(){
        System.out.println(getName() + " starting.");
        try {
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch(InterruptedException exc){
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }

}
