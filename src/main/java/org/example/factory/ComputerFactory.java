package org.example.factory;


/*This class makes a call to
   AbstractComputerFactory which shows the extra layer
   of Abstraction
 */
public class ComputerFactory {
    private ComputerFactory() {

    }

    public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
        return abstractComputerFactory.createComputer();
    }
}
