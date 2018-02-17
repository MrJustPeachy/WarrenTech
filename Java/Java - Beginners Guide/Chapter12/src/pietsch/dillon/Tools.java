package pietsch.dillon;

/**
 * PROGRAM NAME: Tools.java
 * PROGRAM PURPOSE:
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
enum ToolsEnum {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class Tools {
    public static void tools() {
        for(ToolsEnum d : ToolsEnum.values()) {
            System.out.print(d + " has ordinal value of " + d.ordinal());
            System.out.println();
        }
    }
}
