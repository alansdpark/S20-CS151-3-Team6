package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.controller.NavigationController;
import edu.sjsu.cs.tinnitus.view.frames.LogInView;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;

import javax.swing.*;

import org.junit.Test;

import java.awt.*;

public class LogInTesting {

	@Test
    public void loginTest(){
        JFrame frame = new JFrame();
        LogInView view = new LogInView();
        frame.add(view.getPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
