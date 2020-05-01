package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.MedicationView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;
import java.awt.*;

public class MedicationTesting {

    public static void main(String[] args){
        MedicationView view = new MedicationView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
