package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.controller.NavigationController;
import edu.sjsu.cs.tinnitus.view.frames.NavigationView;

import javax.swing.*;
import java.awt.*;

public class NavigationTesting {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        NavigationView view = new NavigationView();
        NavigationController controller = new NavigationController(view, frame);
        frame.add(view.getPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
