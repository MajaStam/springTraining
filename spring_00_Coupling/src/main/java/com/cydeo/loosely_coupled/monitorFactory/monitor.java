package com.cydeo.loosely_coupled.monitorFactory;

public abstract class monitor {
    private String model;
    private String manufacturer;
    private int size;

    public monitor(String model, String manufacturer, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public abstract void drawPixelAt();
}
