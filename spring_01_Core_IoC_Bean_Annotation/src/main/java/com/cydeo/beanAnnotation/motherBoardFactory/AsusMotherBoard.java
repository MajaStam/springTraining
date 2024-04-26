package com.cydeo.beanAnnotation.motherBoardFactory;

public class AsusMotherBoard extends Motherboard {

    public AsusMotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer, ramSlots, cardSlots, bios);
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }


}
