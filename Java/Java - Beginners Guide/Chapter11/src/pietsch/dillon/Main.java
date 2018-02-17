package pietsch.dillon;

/*
    PROGRAM NAME: Main.java
    PROGRAM PURPOSE: Runs all of the programs in Chapter 11
    PROGRAMMER: Dillon Pietsch
    DATE WRITTEN: 6-21-17
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread starting.");

        // First, construct a MyThread object.
        MyThread mt = new MyThread("Child #1");

        // NExt, construct a thread from that object.
        Thread newThrd = new Thread(mt);

        // Finally, start execution of the thread.
        newThrd.start();

        for(int i=0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");


        System.out.println("\nImproved MyThread");

        MyThreadEnhanced mte = new MyThreadEnhanced("Child #2");

        for(int i=0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");

        System.out.println("\nExtendThread.java");
        ExtendThread et = new ExtendThread("Child #3");

        for(int i=0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
        System.out.println("\nMultipleThreads.java");

        // All three child threads share the CPU.
        MultipleThreads mlt1 = new MultipleThreads("Child #4");
        MultipleThreads mlt2 = new MultipleThreads("Child #5");
        MultipleThreads mlt3 = new MultipleThreads("Child #6");

        for(int i=0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");


        System.out.println("\nMyThreadEnhanced.java");

        // Using the join() method
        MyThreadEnhanced join1 = new MyThreadEnhanced("Child #7");
        MyThreadEnhanced join2 = new MyThreadEnhanced("Child #8");
        MyThreadEnhanced join3 = new MyThreadEnhanced("Child #9");


        try{
            join1.thrd.join();
            System.out.println("Child #7 joined.");
            join2.thrd.join();
            System.out.println("Child #8 joined");
            join3.thrd.join();
            System.out.println("Child #9 joined");
        } catch(InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }


        System.out.println("Main thread ending.");

        System.out.println("\nPriority.java");

        // Threads have priority levels
        // Higher priority threads have greater potential access to the CPU

        Priority p1 = new Priority("High Priority");
        Priority p2 = new Priority("Low Priority");

        // set the priorities
        p1.thrd.setPriority(Thread.NORM_PRIORITY + 4);
        p2.thrd.setPriority(Thread.NORM_PRIORITY - 4);

        // start the threads
        p1.thrd.start();
        p2.thrd.start();

        try {
            p1.thrd.join();
            p2.thrd.join();
        } catch (InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("\nHigh priority thread counted to " + p1.count);
        System.out.println("\nLow priority thread counted to " + p2.count);

        /*
            Synchronization is coordinating the activities of two or more threads
                - Used when two+ threads need access to a resource that can only be used by one thread at a time
         */

        System.out.println("\nPriority.java");
        int a[] = {1, 2, 3, 4, 5};

        SynchronizedThread st1 = new SynchronizedThread("Child 10", a);
        SynchronizedThread st2 = new SynchronizedThread("Child 11", a);

        try {
            st1.thrd.join();
            st2.thrd.join();
        } catch (InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nTickTock.java");

        TickTock tt = new TickTock();
        TickTockThread ttt1 = new TickTockThread("Tick", tt);
        TickTockThread ttt2 = new TickTockThread("Tock", tt);

        try {
            ttt1.thrd.join();
            ttt2.thrd.join();
        } catch (InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\nSRSThreads.java");
        SRSThreads srs = new SRSThreads("My Thread");

        try {
            Thread.sleep(1000); // let srs thread start executing

            srs.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            srs.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            srs.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            srs.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            srs.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            srs.mystop();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // wait for thread to finish
        try {
            srs.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");

        /*
        TRY THIS 11-2
         */

        System.out.println("\nTryThis11-2");

        Thread thrd;
        thrd = Thread.currentThread();

        //Display main thread's name
        System.out.println("Main thread is called: " + thrd.getName());

        // Display main thread's priority
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        // Set the name and priority
        System.out.println("Setting name and priority.\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("Main thread is now called: " + thrd.getName());
        System.out.println("Priority is now " + thrd.getPriority());


    }
}




















