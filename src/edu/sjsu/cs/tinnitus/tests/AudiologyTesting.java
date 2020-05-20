package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.controller.AudiologyController;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyView;

import javax.swing.*;

import org.junit.Test;

public class AudiologyTesting {

	@Test
    public void AudiologyTest(){
        JFrame frame = new JFrame();
        AudiologyView av = new AudiologyView();
        frame.add(av.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
