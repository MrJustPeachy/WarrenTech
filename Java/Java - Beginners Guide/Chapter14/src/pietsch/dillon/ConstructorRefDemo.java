package pietsch.dillon;

/**
 * PROGRAM NAME: ConstructorRefDemo.java
 * PROGRAM PURPOSE: Demonstrates constructor references
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/26/2017
 */

interface MyFunction {
    MyClass func(String s);
}

class MyClass {
    private String str;

    MyClass(String s) { str = s; }

    MyClass() { str = ""; }

    String getStr() { return str; }
}

public class ConstructorRefDemo {

    public static void main(String args[]) {

        MyFunction myClassCons = MyClass::new;

        MyClass mc = myClassCons.func("Testing");

        System.out.println("str in mc is " + mc.getStr());
    }
}
