package pietsch.dillon;

/**
 * PROGRAM NAME: QueueEmptyException.java
 * PROGRAM PURPOSE: Reports error message for empty queue
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class QueueEmpytException extends Exception{

    public String toString(){
        return "\nQueue is empty.";
    }
}
