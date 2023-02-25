package org.example.factory;


/* This is the super type
*  can be implemented by many classes
*
*  */
public interface Computer {
    public abstract String ram();
    public abstract String hdd();
    public abstract String cpu();

    public boolean isGraphicsEnabled();
    public boolean isBluetoothEnabled();
}
