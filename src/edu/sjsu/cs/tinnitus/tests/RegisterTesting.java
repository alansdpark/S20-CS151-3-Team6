package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;

import org.junit.Test;

import java.awt.*;

public class RegisterTesting {

	@Test
    public void RegisterTest(){
        RegisterPatientView view = new RegisterPatientView();
        JFrame frame = new JFrame();
        frame.add(view.getPanel());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
