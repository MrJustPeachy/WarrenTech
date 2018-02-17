package pietsch.dillon;

/**
 * PROGRAM NAME: GenQDemo.java
 * PROGRAM PURPOSE: Runs the Try This 13-1 GenQDemo
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class GenQDemo {

    public static void gqd(){

        // Create an integer queue.
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers");
        try {
            for(int i = 0; i < 5; i++){
                System.out.println("Adding " + i + " to q.");
                q.put(i);
            }
        } catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i = 0; i < 5; i++){
                System.out.print("getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmpytException exc){
            System.out.println(exc);
        }

        System.out.println();

        // Create a double queue
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);
        Double dVal;

        System.out.println("Demonstrate a queue of Doubles.");

        try {
            for(int i = 0; i < 5; i++){
                System.out.println("Adding " + (double) i / 2 + " to q2.");
                q2.put((double) i / 2 );
            }
        } catch (QueueFullException exc){
            System.out.println(exc);
        }


        try {
            for(int i = 0; i < 5; i++){
                System.out.print("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmpytException exc){
            System.out.println(exc);
        }


    }

}
