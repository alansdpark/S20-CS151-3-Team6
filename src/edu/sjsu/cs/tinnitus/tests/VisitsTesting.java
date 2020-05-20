package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

import javax.swing.*;

import org.junit.Test;

import java.awt.*;

public class VisitsTesting {

	@Test
    public void VisitsTest(){
        VisitView view = new VisitView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
