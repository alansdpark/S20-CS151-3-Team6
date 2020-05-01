package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.PatientView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;
import java.awt.*;

public class PatientTesting {

    public static void main(String[] args){
        PatientView view = new PatientView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
