package pietsch.dillon;

/**
 * PROGRAM NAME: TrafficLightDemo.java
 * PROGRAM PURPOSE: Simulate a traffic light in Try This 12-1
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class TrafficLightDemo implements Runnable{

    enum TrafficLightColor {
        RED, GREEN, YELLOW
    }

    private Thread thrd; // thread that runs the simulation
    private TrafficLightColor tlc; // holds the traffic light color
    boolean stop = false; // set to true to stop the simulation
    boolean changed = false; // true when the light has changed

    TrafficLightDemo(TrafficLightColor init){
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightDemo(){
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }

    public void run(){

        while(!stop){
            try {
                switch (tlc){
                    case GREEN:
                        Thread.sleep(10000); // green for 10 seconds
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // yellow for 2 seconds
                        break;
                    case RED:
                        Thread.sleep(12000); // red for 12 seconds
                        break;
                }
            } catch (InterruptedException exc){
                System.out.println(exc);
            }
            changeColor();
        }

    }

    synchronized void changeColor(){
        switch(tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }

        changed = true;
        notify(); // signal that the light as changed
    }

    synchronized void waitForChange(){
        try {
            while (!changed)
                wait();
            changed = false;
        } catch (InterruptedException exc){
            System.out.println(exc);
        }
    }

    // Return current color
    synchronized TrafficLightColor getColor(){
        return tlc;
    }

    // Stop the traffic light
    synchronized void cancel(){
        stop = true;
    }

}
