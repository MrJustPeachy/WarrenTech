package pietsch.dillon;

/**
 * PROGRAM NAME: SRSThreads.java
 * PROGRAM PURPOSE: Demonstrates Suspending, Resuming, and Stopping Threads
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/23/2017
 */
public class SRSThreads implements Runnable{

    Thread thrd;

    boolean suspended;
    boolean stopped;

    SRSThreads(String name){
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");

        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Use synchronized block to check suspended and stopped
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    // Stop the thread
    synchronized void mystop(){
        stopped = true;
        suspended = false;
        notify();
    }

    // Suspend the thread
    synchronized void mysuspend(){
        suspended = true;
    }

    // Resume the thread
    synchronized void myresume(){
        suspended = false;
        notify();
    }

}
