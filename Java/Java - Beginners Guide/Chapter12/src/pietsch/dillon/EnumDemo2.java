package pietsch.dillon;

/**
 * PROGRAM NAME: .java
 * PROGRAM PURPOSE:
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class EnumDemo2 {

    // An enumeration of Transport varieties
    enum Transport {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT
    }

    public static void ed(){
        Transport tp;

        System.out.println("Here are all Transport constants");

        // use values()
        Transport allTransports[] = Transport.values();
        for(Transport t : allTransports)
            System.out.println(t);

        System.out.println();

        // use valueOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }

}
