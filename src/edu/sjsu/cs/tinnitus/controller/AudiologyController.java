package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.controller.Controller;

/**
 * Controller for Audiology and AudiologyView.
 */
public class AudiologyController implements Controller
{

    /**
     * Constructor for Audiology w/ Patient
     * @param audiologyView
     * @param patient
     * @param clinicalController
     */
    public AudiologyController(AudiologyView audiologyView, Patient patient, ClinicalController clinicalController)
    {
        stage = 1;
        this.audiology = patient.getAudiology();
        this.audiologyView = audiologyView;
        this.clinicalController = clinicalController;
        this.patient = patient;
        this.visit = null;
    }
    /**
     * Constructor for Audiology w/ Visit
     * @param audiologyView
     * @param visit
     * @param clinicalController
     */
    public AudiologyController(AudiologyView audiologyView, Visit visit, ClinicalController clinicalController)
    {
        this.audiology = patient.getAudiology();
        this.audiologyView = audiologyView;
        this.clinicalController = clinicalController;
        this.patient = null;
        this.visit = visit;
    }

    @Override
    public void initController() {
        audiologyView.getNextButton().addActionListener(e-> {
                audiologyView.moveUpStage();
        });
        audiologyView.getSaveButton().addActionListener(e -> {
            if(visit == null){
                returnToPatient();
            }
            else{
                returnToVisit();
            }
        });

    }
    /**
     * Switches Control to VisitController
     */
    public void returnToVisit(){
        updateAudiology();
        JFrame frame = clinicController.getFrame();
        frame.remove(audiologyView);
        VisitView view = new VisitView();
        VisitController visitController = new VisitController(visit, view, clinicController);
        frame.add(view.getPanel(), BorderLayout.CENTER);
        frame.validate();
        frame.repaint();
    }
    /**
     * Switches control to PatientController
     */
    public void returnToPatient(){
        updateAudiology();
        JFrame frame = clinicController.getFrame();
        frame.remove(audiologyView);
        PatientView view = new PatientView();
        PatientController patientController = new PatientController(patient, view, clinicController);
        frame.add(view.getPanel(), BorderLayout.CENTER);
        frame.validate();
        frame.repaint();
    }

    /**
     *  Updates new values into Audiology model
     */
    public void updateAudiology() {
        double[] pureToneLeft = { Double.parseDouble(audiologyView.getHz_250_field_pureTone_left().getText()),
                Double.parseDouble(audiologyView.getHz_500_field_pureTone_left().getText()),
                Double.parseDouble(audiologyView.getHz_1000_field_pureTone_left().getText()),
                Double.parseDouble(audiologyView.getHz_2500_field_pureTone_left().getText()),
                Double.parseDouble(audiologyView.getHz_5000_field_pureTone_left().getText()),
                Double.parseDouble(audiologyView.getHz_10000_field_pureTone_left().getText()),
                Double.parseDouble(audiologyView.getHz_12000_field_pureTone_left().getText())
        }; // 250, 500, 1000, 2500, 5000, 7500, 10000, 12000
        double[] pureToneRight = { Double.parse(audiologyView.getHz_250_field_pureTone_right().getText()),
                Double.parseDouble(audiologyView.getHz_500_field_pureTone_right().getText()),
                Double.parseDouble(audiologyView.getHz_1000_field_pureTone_right().getText()),
                Double.parseDouble(audiologyView.getHz_2500_field_pureTone_right().getText()),
                Double.parseDouble(audiologyView.getHz_5000_field_pureTone_right().getText()),
                Double.parseDouble(audiologyView.getHz_10000_field_pureTone_right().getText()),
                Double.parseDouble(audiologyView.getHz_12000_field_pureTone_right().getText())
        }; // 250, 500, 1000, 2500, 5000, 7500, 10000, 12000
        double[] ldlLeft = {Double.parseDouble(audiologyView.getHz_500_field_ldl_left().getText()),
                Double.parseDouble(audiologyView.getHz_1000_field_ldl_left().getText()),
                Double.parseDouble(audiologyView.getHz_2500_field_ldl_left().getText()),
                Double.parseDouble(audiologyView.getHz_5000_field_ldl_left().getText()),
                Double.parseDouble(audiologyView.getHz_7500_field_ldl_left().getText()),
                Double.parseDouble(audiologyView.getHz_10000_field_ldl_left().getText()),
                Double.parseDouble(audiologyView.getHz_12000_field_ldl_left().getText())
        }; // 500, 1000, 2500, 5000, 7500, 10000, 12000
        double[] ldlRight = {Double.parseDouble(audiologyView.getHz_500_field_ldl_right().getText()),
                Double.parseDouble(audiologyView.getHz_1000_field_ldl_right().getText()),
                Double.parseDouble(audiologyView.getHz_2500_field_ldl_right().getText()),
                Double.parseDouble(audiologyView.getHz_5000_field_ldl_right().getText()),
                Double.parseDouble(audiologyView.getHz_7500_field_ldl_right().getText()),
                Double.parseDouble(audiologyView.getHz_10000_field_ldl_right().getText()),
                Double.parseDouble(audiologyView.getHz_12000_field_ldl_right().getText())
        }; // 500, 1000, 2500, 5000, 7500, 10000, 12000
        audiology.setPureToneLeft(pureToneLeft);
        audiology.setPureToneRight(pureToneRight);
        audiology.setLdlLeft(ldlLeft);
        audiology.setLdlRight(ldlRight);
        audiology.setThresholdLeft(Double.parseDouble(audiologyView.getThresholdLeft_field().getText()));
        audiology.setThresholdRight(Double.parseDouble(audiologyView.getThresholdRight_field().getText()));
        audiology.setMinMaskLeft(Double.parseDouble(audiologyView.getMinMaskLeft_field().getText()));
        audiology.setMinMaskRight(Double.parseDouble(audiologyView.getMinMaskRight_field().getText()));
        audiology.setpitchMatch(audiologyView.getPitchType_field.getText());
        audiology.setMatchType(audiologyView.getMatchType_field.getText());
        audiology.setComments(audiologyView.getAdditionalCommnents_area().getText());
    }

    private ClinicalController clinicalController;
    private Patient patient;
    private Visit visit;
    private Audiology audiology;
    private AudiolodyView audiologyView;

}