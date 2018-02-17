package pietsch.dillon;

/**
 * PROGRAM NAME: QueueFullException.java
 * PROGRAM PURPOSE: Returns error message for a full queue
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class QueueFullException extends Exception{

    int size;

    QueueFullException(int s) { size = s; }

    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }

}
