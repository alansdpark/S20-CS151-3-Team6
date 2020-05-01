package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.view.frames.PatientListView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;
import java.awt.*;

public class PatientListTesting {

    public static void main(String[] args){
        PatientListView view = new PatientListView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
