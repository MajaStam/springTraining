package com.cydeo.loosely_coupled.monitorFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class sonyMonitor extends monitor{



        public sonyMonitor(String model, String manufacturer, int size) {
            super(model, manufacturer, size);
        }

        public void drawPixelAt() {
            System.out.println("Drawing pixel with Sony");
        }
    }

