package com.cydeo.casefactory;

public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powerSupply,Dimension dimension) {

        super(model, manufacturer, powerSupply,dimension);
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }

}