package pietsch.dillon;

/**
 * PROGRAM NAME: EnumDemo3.java
 * PROGRAM PURPOSE: Incorporates constructors, methods, instance variables, and enumerations.
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */

public class EnumDemo3 {

    enum Transport {
        CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

        private int speed; // typical speed of each transport

        // Constructor
        Transport(int s) { speed = s; }
        int getSpeed() { return speed; }
    }

    public static void ed(){

        Transport tp;

        // Display speed of an airplane
        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

        // Display all Transports and speeds
        System.out.println("All Transport speeds: ");
        for(Transport t : Transport.values())
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
    }

}
