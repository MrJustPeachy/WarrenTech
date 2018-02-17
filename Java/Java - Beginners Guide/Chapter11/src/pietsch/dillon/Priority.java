package pietsch.dillon;

/**
 * PROGRAM NAME: Priority.java
 * PROGRAM PURPOSE: Demonstrates thread priorities
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/23/2017
 */
public class Priority implements Runnable{

    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    /*
    Construct a new thread but don't start it.
     */

    Priority(String name){
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    // begin execution of new thread.
    public void run(){
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;

            if(currentName.compareTo(thrd.getName()) != 0){
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(!stop && count < 10000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " terminating.");
    }

}
