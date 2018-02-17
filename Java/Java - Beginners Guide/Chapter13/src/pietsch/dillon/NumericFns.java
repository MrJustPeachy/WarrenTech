package pietsch.dillon;

/**
 * PROGRAM NAME: NumericFns.java
 * PROGRAM PURPOSE: Use a bounded generic
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class NumericFns<T extends Number> { // Can also extend another generic to make it either a same type/subclass

    T num;

    NumericFns(T n){
        num = n;
    }

    double reciprocal(){
        return 1 / num.doubleValue();
    }

    double fraction(){
        return num.doubleValue() - num.intValue();
    }

    // Using a wildcard
    boolean absEqual(NumericFns<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;

        return false;
    }

}
