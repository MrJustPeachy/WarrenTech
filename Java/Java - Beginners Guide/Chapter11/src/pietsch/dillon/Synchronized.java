package pietsch.dillon;

/**
 * PROGRAM NAME: Synchronized.java
 * PROGRAM PURPOSE: Demonstrates using synchronized methods
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/23/2017
 */
public class Synchronized {

    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0; // reset sum

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException exc){
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }

}

class SynchronizedThread implements Runnable{

    Thread thrd;
    static Synchronized syn = new Synchronized();
    int a[];
    int answer;

    // Construct a new thread.
    SynchronizedThread(String name, int nums[]){
        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread
    public void run(){
        int sum;

        System.out.println(thrd.getName() + " starting.");

        answer = syn.sumArray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }

}