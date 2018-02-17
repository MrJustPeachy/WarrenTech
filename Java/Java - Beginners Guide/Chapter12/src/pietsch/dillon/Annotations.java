package pietsch.dillon;

/**
 * PROGRAM NAME: Annotations.java
 * PROGRAM PURPOSE: Showcase annotations in java
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */

// Deprecate Annotations

@Deprecated
public class Annotations {
    private String msg;

    Annotations(String m){
        msg = m;
    }

    // Deprecate a method whin the class
    @Deprecated
    String getMsg(){
        return msg;
    }


}
