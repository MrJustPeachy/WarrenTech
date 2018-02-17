package pietsch.dillon;

/**
 * PROGRAM NAME: IGenQ.java
 * PROGRAM PURPOSE: Generic interface for Try This 13-1
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public interface IGenQ<T> {

    // Put an item into the queue
    void put(T ch) throws QueueFullException;

    // Get an item from the queue
    T get() throws QueueEmpytException;



}
