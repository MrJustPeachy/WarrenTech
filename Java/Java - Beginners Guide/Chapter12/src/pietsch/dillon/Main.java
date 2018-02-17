package pietsch.dillon;

/**
 * PROGRAM NAME: Main.java
 * PROGRAM PURPOSE: Runs all of the separate files
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */

/*
        Enumerations: List of named constants that define a new data type
            - Allows a new type of data to be precisely defined

        Auto(un)boxing: Simplifies and streamlines code that converts primitive types into objects

        Can use static import to have a shorthand as to how objects are called
            Ex: import static java.lang.Math.sqrt; is called as just sqrt()
*/

public class Main {
    public static void main(String[] args) {

        // Demonstrates basic ENUM uses
        EnumDemo1.ed();

        System.out.println();

        // More ENUM use cases
        EnumDemo2.ed();

        System.out.println();

        // More advanced enum tools
        EnumDemo3.ed();

        System.out.println();

        // Uses ordinal and compareTo
        EnumDemo4.ed();

        System.out.println();

        // Try This 12-1
        TrafficLightDemo t1 = new TrafficLightDemo(TrafficLightDemo.TrafficLightColor.GREEN);

        for(int i = 0; i< 9; i++){
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();

        System.out.println();

        // Autobox/unboxing
        AutoBox.ab();

        // More advanced autobox/unboxing

        // 99 is automatically boxed
        AutoBox2.m(99);

        // iOb gets the int value and automatically boxes it
        Integer iOb = AutoBox2.m2();
        System.out.println("Return value from m2() is " + iOb);

        // Auto-unboxing of m3 into primitive int
        int i = AutoBox2.m3();
        System.out.println("Return value from m3() is " + i);

        // iOb is auto-unboxed and change into a double since .sqrt() needs a double passed in
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));

        System.out.println();

        // Expressions w/ autoboxing
        AutoBox3.ab();

        System.out.println();

        // Showcase annotations
        Annotations a = new Annotations("test");

        System.out.println(a.getMsg());

        System.out.println();

        // Tools.java
        Tools.tools();

        System.out.println();

        // TrafficLightDemoEnhanced.java
        TrafficLightDemoEnhanced.tlde();
    }
}
