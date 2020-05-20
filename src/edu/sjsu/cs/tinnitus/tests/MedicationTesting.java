package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.view.frames.MedicationView;
import edu.sjsu.cs.tinnitus.view.frames.RegisterPatientView;

import javax.swing.*;

import org.junit.Test;

import java.awt.*;

public class MedicationTesting {

	@Test
    public void medicationTest(){
		MedicationView medView = new MedicationView();
		
		JFrame window = new JFrame("Medication View Test");
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
