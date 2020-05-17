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
        this.audiology = patient.getAudiology();
        this.audiologyView = audiologyView;
        this.clinicalController = clinicalController;
        this.patient = patient;
        this.visit = null;
        loadAudiology();
        initController();
    }
    /**
     * Constructor for Audiology w/ Visit
     * @param audiologyView
     * @param visit
     * @param clinicalController
     */
    public AudiologyController(AudiologyView audiologyView, Visit visit, ClinicalController clinicalController)
    {
        this.audiology = visit.getAudiology();
        this.audiologyView = audiologyView;
        this.clinicalController = clinicalController;
        this.patient = null;
        this.visit = visit;
        initController();
    }

    /**
     *
     */
    @Override
    public void initController() {
        audiologyView.getNextButton().addActionListener(e-> {
                audiologyView.moveUpStage();
        });
        audiologyView.getSaveButton().addActionListener(e -> {
            updateAudiology();
            if(visit == null){
                returnToPatient();
            }
            else{
                returnToVisit();
            }
        });
        audiologyView.getBackButton().addActionListener(e -> {
            audiologyView.moveDownStage();
        });
        audiologyView.getCancelButton().addActionListener(e -> {
            if(visit == null){
                returnToPatient();
            }
            else{
                returnToVisit();
            }
        });

    }

    /**
     * Loads pre-existing audiology data into audiologyView
     */
    public loadAudiology() {
        double[] pureToneLeft = audiology.getPureToneLeft();
        double[] pureToneRight = audiology.getPureToneRight();
        double[] ldlLeft = audiology.getLdlLeft();
        double[] ldlRight = audiology.getLdlRight();
        //pure tone left
        audiologyView.setHz_250_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[0])));
        audiologyView.setHz_500_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[1])));
        audiologyView.setHz_1000_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[2])));
        audiologyView.setHz_2500_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[3])));
        audiologyView.setHz_5000_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[4])));
        audiologyView.setHz_7500_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[5])));
        audiologyView.setHz_10000_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[6])));
        audiologyView.setHz_12000_field_pureTone_left(new JTextField(Double.toString(pureToneLeft[7])));
        //pure tone right
        audiologyView.setHz_250_field_pureTone_right(new JTextField(Double.toString(pureToneRight[0])));
        audiologyView.setHz_500_field_pureTone_right(new JTextField(Double.toString(pureToneRight[1])));
        audiologyView.setHz_1000_field_pureTone_right(new JTextField(Double.toString(pureToneRight[2])));
        audiologyView.setHz_2500_field_pureTone_right(new JTextField(Double.toString(pureToneRight[3])));
        audiologyView.setHz_5000_field_pureTone_right(new JTextField(Double.toString(pureToneRight[4])));
        audiologyView.setHz_7500_field_pureTone_right(new JTextField(Double.toString(pureToneRight[5])));
        audiologyView.setHz_10000_field_pureTone_right(new JTextField(Double.toString(pureToneRight[6])));
        audiologyView.setHz_12000_field_pureTone_right(new JTextField(Double.toString(pureToneRight[7])));
        //ldl left
        audiologyView.setHz_500_field_ldl_left(new JTextField(Double.toString(ldlLeft[0])));
        audiologyView.setHz_1000_field_ldl_left(new JTextField(Double.toString(ldlLeft[1])));
        audiologyView.setHz_2500_field_ldl_left(new JTextField(Double.toString(ldlLeft[2])));
        audiologyView.setHz_5000_field_ldl_left(new JTextField(Double.toString(ldlLeft[3])));
        audiologyView.setHz_7500_field_ldl_left(new JTextField(Double.toString(ldlLeft[4])));
        audiologyView.setHz_10000_field_ldl_left(new JTextField(Double.toString(ldlLeft[5])));
        audiologyView.setHz_12000_field_ldl_left(new JTextField(Double.toString(ldlLeft[6])));
        //ldl right
        audiologyView.setHz_500_field_ldl_right(new JTextField(Double.toString(ldlRight[0])));
        audiologyView.setHz_1000_field_ldl_right(new JTextField(Double.toString(ldlRight[1])));
        audiologyView.setHz_2500_field_ldl_right(new JTextField(Double.toString(ldlRight[2])));
        audiologyView.setHz_5000_field_ldl_right(new JTextField(Double.toString(ldlRight[3])));
        audiologyView.setHz_7500_field_ldl_right(new JTextField(Double.toString(ldlRight[4])));
        audiologyView.setHz_10000_field_ldl_right(new JTextField(Double.toString(ldlRight[5])));
        audiologyView.setHz_12000_field_ldl_right(new JTextField(Double.toString(ldlRight[6])));
        //misc
        audiologyView.setThresholdLeft_field(new JTextField(Double.toString(audiology.getThresholdLeft())));
        audiologyView.setThresholdRight_field(new JTextField(Double.toString(audiology.getThresholdRight())));
        audiologyView.setMinMaskLeft_field(new JTextField(Double.toString(audiology.getMinMaskLeft())));
        audiologyView.setMinMaskRight_field(new JTextField(Double.toString(audiology.getMinMaskRight())));
        audiologyView.setPitchMatch_field(new JTextField(audiology.getPitchMatch()));
        audiologyView.setMatchType_field(new JTextField(audiology.getMatchType()));
        audiologyView.setAdditionalComments_area(new JTextField(audiology.getComments()));
    }

    /**
     * Switches Control to VisitController
     */
    public void returnToVisit(){
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