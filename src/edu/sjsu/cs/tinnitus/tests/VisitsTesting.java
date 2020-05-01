package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

import javax.swing.*;
import java.awt.*;

public class VisitsTesting {

    public static void main(String[] args){
        VisitView view = new VisitView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
