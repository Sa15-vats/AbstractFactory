package org.example.factory;

import org.example.factoryImpl.PC;

public class PCFactory implements AbstractComputerFactory{


    private String ram;
    private String hdd;
    private String cpu;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public PCFactory(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu,isGraphicsEnabled,isBluetoothEnabled);
    }
}
