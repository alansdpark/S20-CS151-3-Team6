package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.controller.AudiologyController;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyView;

import javax.swing.*;

public class AudiologyTesting {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        AudiologyView av = new AudiologyView();
       // AudiologyController ac = new AudiologyController(av, )
        frame.add(av.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
