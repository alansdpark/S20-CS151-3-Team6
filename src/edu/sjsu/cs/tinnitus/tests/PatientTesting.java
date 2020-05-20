package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.PatientView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;

import org.junit.Test;

import java.awt.*;

public class PatientTesting {

	@Test
    public void PatientTest(){
        PatientView view = new PatientView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
