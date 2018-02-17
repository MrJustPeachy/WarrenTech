package pietsch.dillon;

/**
 * PROGRAM NAME: AutoBox2.java
 * PROGRAM PURPOSE: Autoboxing/unboxing with method parameters and returning values
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class AutoBox2 {

    static void m(Integer v){
        System.out.println("m() received " + v);
    }

    static int m2(){
        return 10;
    }

    static Integer m3(){
        return 99; // autoboxing 99 into an Integer
    }

}
