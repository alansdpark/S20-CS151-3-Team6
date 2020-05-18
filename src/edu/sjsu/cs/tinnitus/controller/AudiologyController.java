package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.controller.Controller;
import edu.sjsu.cs.tinnitus.model.Audiology;
import edu.sjsu.cs.tinnitus.model.Patient;
import edu.sjsu.cs.tinnitus.model.Visit;
import edu.sjsu.cs.tinnitus.view.frames.AudiologyView;
import edu.sjsu.cs.tinnitus.view.frames.PatientView;
import edu.sjsu.cs.tinnitus.view.frames.VisitView;

import javax.swing.*;
import java.awt.*;

/**
 * Controller for Audiology and AudiologyView.
 */
public class AudiologyController implements Controller
{

    /**
     * Constructor for Audiology w/ Visit
     * @param audiologyView
     * @param visit
     * @param clinicalController
     */
    public AudiologyController(AudiologyView audiologyView, Visit visit, ClinicController clinicalController)
    {
        this.audiology = visit.getAudiology();
        this.audiologyView = audiologyView;
        this.clinicController = clinicalController;
        this.visit = visit;
        loadAudiology();
        initController();
    }

    /**
     *
     */
    @Override
    public void initController() {
        audiologyView.getSaveButton().addActionListener(e -> {
            updateAudiology();
            returnToVisit();
        });
        audiologyView.getGraphButton().addActionListener(e ->{
            updateAudiology();
            goToGraph();
        });
    }

    /**
     * Switches Control to VisitController
     */
    public void returnToVisit(){
        JFrame frame = clinicController.getFrame();
        frame.remove(audiologyView.getPanel());
        VisitView view = new VisitView();
        VisitController visitController = new VisitController(visit, view, clinicController);
        frame.add(view.getPanel(), BorderLayout.CENTER);
        frame.validate();
        frame.repaint();
    }

    public void goToGraph(){

    }

    /**
     * Loads pre-existing audiology data into audiologyView
     */
    public void loadAudiology() {
        double[] pureToneLeft = audiology.getPureToneLeft();
        double[] pureToneRight = audiology.getPureToneRight();
       // double[] ldlLeft = audiology.getLdlLeft();
        //double[] ldlRight = audiology.getLdlRight();
        //pure tone left
        audiologyView.getHz_250_field_pureTone_left().setText((Double.toString(pureToneLeft[0])));
        audiologyView.getHz_500_field_pureTone_left().setText((Double.toString(pureToneLeft[1])));
        audiologyView.getHz_1000_field_pureTone_left().setText((Double.toString(pureToneLeft[2])));
        audiologyView.getHz_2500_field_pureTone_left().setText((Double.toString(pureToneLeft[3])));
        audiologyView.getHz_5000_field_pureTone_left().setText((Double.toString(pureToneLeft[4])));
        audiologyView.getHz_7500_field_pureTone_left().setText((Double.toString(pureToneLeft[5])));
        audiologyView.getHz_10000_field_pureTone_left().setText((Double.toString(pureToneLeft[6])));
        audiologyView.getHz_12000_field_pureTone_left().setText((Double.toString(pureToneLeft[7])));
        //pure tone right
        audiologyView.getHz_250_field_pureTone_right().setText((Double.toString(pureToneRight[0])));
        audiologyView.getHz_500_field_pureTone_right().setText((Double.toString(pureToneRight[1])));
        audiologyView.getHz_1000_field_pureTone_right().setText((Double.toString(pureToneRight[2])));
        audiologyView.getHz_2500_field_pureTone_right().setText((Double.toString(pureToneRight[3])));
        audiologyView.getHz_5000_field_pureTone_right().setText((Double.toString(pureToneRight[4])));
        audiologyView.getHz_7500_field_pureTone_right().setText((Double.toString(pureToneRight[5])));
        audiologyView.getHz_10000_field_pureTone_right().setText((Double.toString(pureToneRight[6])));
        audiologyView.getHz_12000_field_pureTone_right().setText((Double.toString(pureToneRight[7])));
        //ldl left
        /**
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
         */
        //misc
        audiologyView.getThresholdLeft_field().setText((Double.toString(audiology.getThresholdLeft())));
        audiologyView.getThresholdRight_field().setText((Double.toString(audiology.getThresholdRight())));
        audiologyView.getMinMaskLeft_field().setText((Double.toString(audiology.getMinMaskLeft())));
        audiologyView.getMinMaskRight_field().setText((Double.toString(audiology.getMinMaskRight())));
        audiologyView.getPitchMatch_field().setText((audiology.getPitchMatch()));
        audiologyView.getMatchType_field().setText((audiology.getMatchType()));
        audiologyView.getAdditionalComments_area().setText(audiology.getComments());
    }

    /**
     *  Updates new values into Audiology model
     */
    public void updateAudiology() {
        try {
            double[] pureToneLeft = {Double.parseDouble(audiologyView.getHz_250_field_pureTone_left().getText()),
                    Double.parseDouble(audiologyView.getHz_500_field_pureTone_left().getText()),
                    Double.parseDouble(audiologyView.getHz_1000_field_pureTone_left().getText()),
                    Double.parseDouble(audiologyView.getHz_2500_field_pureTone_left().getText()),
                    Double.parseDouble(audiologyView.getHz_5000_field_pureTone_left().getText()),
                    Double.parseDouble(audiologyView.getHz_7500_field_pureTone_left().getText()),
                    Double.parseDouble(audiologyView.getHz_10000_field_pureTone_left().getText()),
                    Double.parseDouble(audiologyView.getHz_12000_field_pureTone_left().getText())
            }; // 250, 500, 1000, 2500, 5000, 7500, 10000, 12000
            double[] pureToneRight = {Double.parseDouble(audiologyView.getHz_250_field_pureTone_right().getText()),
                    Double.parseDouble(audiologyView.getHz_500_field_pureTone_right().getText()),
                    Double.parseDouble(audiologyView.getHz_1000_field_pureTone_right().getText()),
                    Double.parseDouble(audiologyView.getHz_2500_field_pureTone_right().getText()),
                    Double.parseDouble(audiologyView.getHz_5000_field_pureTone_right().getText()),
                    Double.parseDouble(audiologyView.getHz_7500_field_pureTone_right().getText()),
                    Double.parseDouble(audiologyView.getHz_10000_field_pureTone_right().getText()),
                    Double.parseDouble(audiologyView.getHz_12000_field_pureTone_right().getText())
            }; // 250, 500, 1000, 2500, 5000, 7500, 10000, 12000
            /**
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
             */
            audiology.setPureToneLeft(pureToneLeft);
            audiology.setPureToneRight(pureToneRight);
            //audiology.setLdlLeft(ldlLeft);
            //audiology.setLdlRight(ldlRight);
            audiology.setThresholdLeft(Double.parseDouble(audiologyView.getThresholdLeft_field().getText()));
            audiology.setThresholdRight(Double.parseDouble(audiologyView.getThresholdRight_field().getText()));
            audiology.setMinMaskLeft(Double.parseDouble(audiologyView.getMinMaskLeft_field().getText()));
            audiology.setMinMaskRight(Double.parseDouble(audiologyView.getMinMaskRight_field().getText()));
            audiology.setPitchMatch(audiologyView.getPitchMatch_field().getText());
            audiology.setMatchType(audiologyView.getMatchType_field().getText());
            audiology.setComments(audiologyView.getAdditionalComments_area().getText());
        }
        catch(NumberFormatException ne){
            System.out.println("Fix the formatting!");
        }


    }

    private ClinicController clinicController;
    private Visit visit;
    private Audiology audiology;
    private AudiologyView audiologyView;

}