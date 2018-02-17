package pietsch.dillon;

/**
 * PROGRAM NAME: MyThread.java
 * PROGRAM PURPOSE: Create a thread through Runnable
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6-21-17
 */
public class MyThread implements Runnable{

    String thrdName;

    MyThread(String name){
        thrdName = name;
    }

    // Entry point of thread
    public void run(){
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++){
                Thread.sleep(500);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch(InterruptedException exc){
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }

}