package pietsch.dillon;

/**
 * PROGRAM NAME: GenQueue.java
 * PROGRAM PURPOSE: Shows a generic, fixed-size queue
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class GenQueue<T> implements IGenQ<T> {

    private T q[];
    private int putloc, getloc;

    public GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    // Put an item into the queue
    public void put(T obj) throws QueueFullException {
        if(putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    // Get a char from the queue

    public T get() throws QueueEmpytException{
        if(getloc == putloc)
            throw new QueueEmpytException();

        return q[getloc++];
    }

}
