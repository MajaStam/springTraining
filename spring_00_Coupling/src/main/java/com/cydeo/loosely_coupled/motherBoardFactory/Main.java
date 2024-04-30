/*package com.cydeo.loosely_coupled.motherBoardFactory;
import com.cydeo.loosely_coupled.caseFactory.Case;
import com.cydeo.loosely_coupled.caseFactory.dellCase;
import com.cydeo.loosely_coupled.monitorFactory.acerMonitor;
import com.cydeo.loosely_coupled.monitorFactory.monitor;
import com.cydeo.loosely_coupled.motherBoardFactory.AsusMotherboard;
import com.cydeo.loosely_coupled.motherBoardFactory.motherBoard;
import com.cydeo.tightly_coupled.AcerMonitor;

import javax.management.monitor.Monitor;

public class Main {

        public static void main(String[] args) {

            monitor theMonitor = new AcerMonitor("27inch Beast","Acer", 27);
            Case theCase = new dellCase.DellCase("220B", "Dell", "240");
            motherBoard theMotherboard = new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");

            PC myPc = new PC(theCase,theMonitor,theMotherboard);

            myPc.powerUp();


        }
    }



 */