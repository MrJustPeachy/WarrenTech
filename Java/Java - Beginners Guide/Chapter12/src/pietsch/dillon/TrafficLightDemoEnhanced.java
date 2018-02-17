package pietsch.dillon;

/**
 * PROGRAM NAME: TrafficLightDemoEnhanced.java
 * PROGRAM PURPOSE: Makes improvements on the traffic light demo program
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */

enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;
    TrafficLightColor(int d) {
        delay = d;
    }

    int getDelay() { return delay; }
}

// A computerized traffic light.
class TrafficLightSimulator implements Runnable {
    private Thread thrd;
    private TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    // Start up the light.
    public void run() {
        while(!stop) {

            // Notice how this code has been simplified!
            try {
                Thread.sleep(tlc.getDelay());
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }

            changeColor();
        }
    }


    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }

        changed = true;
        notify(); // signal that the light has changed
    }

    // Wait until a light change occurs.
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); // wait for light to change
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }


    synchronized TrafficLightColor getColor() {
        return tlc;
    }


    synchronized void cancel() {
        stop = true;
    }
}

class TrafficLightDemoEnhanced {
    public static void tlde() {
        TrafficLightSimulator tl =
                new TrafficLightSimulator(TrafficLightColor.GREEN);

        for(int i=0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }

        tl.cancel();
    }
}

