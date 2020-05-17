package edu.sjsu.cs.tinnitus.tests;

import edu.sjsu.cs.tinnitus.controller.AudiologyController;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AudiologyControllerTesting {

    @Test
    public void audiologyControllerTestingWithPatient(){
        ClinicalController clinicalController = new clinicalController();
        Audiology audiology = new audiology();
        AudiologyView audiologyView = new audiologyView();
        Patient patient = new Patient();
        AudiologyController audiologyController = new AudiologyController(audiologyView, patient, clinicalController);

        JFrame testFrame = new JFrame();
        testFrame.add(audiologyView);
    }

    @Test
    public void audiologyControllerTestingWithVisit(){
        ClinicalController clinicalController = new clinicalController();
        Audiology audiology = new audiology();
        AudiologyView audiologyView = new audiologyView();
        Visit visit = new Visit();
        AudiologyController audiologyController = new AudiologyController(audiologyView, visit, clinicalController);

        JFrame testFrame = new JFrame();
        testFrame.add(audiologyView);
    }
}
