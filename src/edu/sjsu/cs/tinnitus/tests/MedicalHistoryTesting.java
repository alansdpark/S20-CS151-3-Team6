package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.MedicalHistoryView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;
import java.awt.*;

public class MedicalHistoryTesting {

    public static void main(String[] args){
        MedicalHistoryView view = new MedicalHistoryView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
