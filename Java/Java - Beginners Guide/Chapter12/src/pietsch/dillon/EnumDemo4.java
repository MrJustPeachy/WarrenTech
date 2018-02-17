package pietsch.dillon;

/**
 * PROGRAM NAME: EnumDemo4.java
 * PROGRAM PURPOSE: Uses ordinal() and compareTo()
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class EnumDemo4 {

    enum Transport {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT
    }

    public static void ed() {

        Transport tp, tp2, tp3;

        // Obtain all ordinal values using ordinal()
        System.out.println("Here are all Transport constants and their ordinal values");

        for(Transport t : Transport.values())
            System.out.println(t + " " + t.ordinal());

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        System.out.println();

        // Demonstrate compareTo()
        if(tp.compareTo(tp2) < 0)
            System.out.println(tp + " comes before " + tp2);

        if(tp.compareTo(tp2) > 0)
            System.out.println(tp2 + " comes before " + tp);

        if(tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);

    }
}









