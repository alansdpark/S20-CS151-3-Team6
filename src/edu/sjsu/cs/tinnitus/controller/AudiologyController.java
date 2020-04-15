package edu.sjsu.cs.tinnitus.controller;

import edu.sjsu.cs.tinnitus.controller.Controller;

/**
 * Controller for Audiology.
 */
public class AudiologyController implements Controller
{

    public AudiologyController(Audiology data, AudiologyView aView, JFrame frame)
    {
        this.data = data;
        this.aView = aView;
        load(); // loads data from audiology into data
        addActions();
        changeFrom(frame);
    }

    /**
     * removes all current components of frame and
     * adds aView, which extends JPanel.
     * then repaints to make change visible.
     * @param frame
     */
    public void changeFrom(JFrame frame) {

    }

    /**
     * Sets the save and cancel action listener to the
     * Save and Cancel JButton in the AudiologyView
     */
    public void addActions() {
        ActionListener save = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        };
        ActionListener cancel = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancel();
            }
        };
        aView.setSaveButtonAction(save);
        aView.setCancelButtonAction(cancel);
    }

    /**
     * Saves all the inputs from the AudiologyView to Audiology
     * within their respective fields
     */
    public void save() {
        /** String Comments = aView.getAdditionalComments();
        int[] hz_pureTone_left = new int[8];
            hz_pureTone_left[0] = Integer.parseInt(aView.getHz_250_field_pureTone_left());
            hz_pureTone_left[1] = Integer.parseInt(aView.getHz_500_field_pureTone_left());
            hz_pureTone_left[2] = Integer.parseInt(aView.getHz_1000_field_pureTone_left());
            hz_pureTone_left[3] = Integer.parseInt(aView.getHz_2500_field_pureTone_left());
            hz_pureTone_left[4] = Integer.parseInt(aView.getHz_5000_field_pureTone_left());
            hz_pureTone_left[5] = Integer.parseInt(aView.getHz_7500_field_pureTone_left());
            hz_pureTone_left[6] = Integer.parseInt( aView.getHz_10000_field_pureTone_left());
            hz_pureTone_left[7] = Integer.parseInt(aView.getHz_12000_field_pureTone_left());
        int[] hz_pureTone_right = new int[8];
            hz_pureTone_right[0] = Integer.parseInt(aView.getHz_250_field_pureTone_right());
            hz_pureTone_right[1] = Integer.parseInt(aView.getHz_500_field_pureTone_right());
            hz_pureTone_right[2] = Integer.parseInt(aView.getHz_1000_field_pureTone_right());
            hz_pureTone_right[3] = Integer.parseInt(aView.getHz_2500_field_pureTone_right());
            hz_pureTone_right[4] = Integer.parseInt(aView.getHz_5000_field_pureTone_right());
            hz_pureTone_right[5] = Integer.parseInt(aView.getHz_7500_field_pureTone_right());
            hz_pureTone_right[6] = Integer.parseInt(aView.getHz_10000_field_pureTone_right());
            hz_pureTone_right[7] = Integer.parseInt(aView.getHz_12000_field_pureTone_right());
        int[] hz_ldl_left = new int[7];
            hz_ldl_left[0] = Integer.parseInt(aView.getHz_500_field_ldl_left());
            hz_ldl_left[1] = Integer.parseInt(aView.getHz_1000_field_ldl_left());
            hz_ldl_left[2] = Integer.parseInt(aView.getHz_2500_field_ldl_left());
            hz_ldl_left[3] = Integer.parseInt(aView.getHz_5000_field_ldl_left());
            hz_ldl_left[4] = Integer.parseInt(aView.getHz_7500_field_ldl_left());
            hz_ldl_left[5] = Integer.parseInt(aView.getHz_10000_field_ldl_left());
            hz_ldl_left[6] = Integer.parseInt(aView.getHz_12000_field_ldl_left());
        int[] hz_ldl_right = new int[7];
            hz_ldl_right[0] = Integer.parseInt(aView.getHz_500_field_ldl_right());
            hz_ldl_right[1] = Integer.parseInt(aView.getHz_1000_field_ldl_right());
            hz_ldl_right[2] = Integer.parseInt(aView.getHz_2500_field_ldl_right());
            hz_ldl_right[3] = Integer.parseInt(aView.getHz_5000_field_ldl_right());
            hz_ldl_right[4] = Integer.parseInt(aView.getHz_7500_field_ldl_right());
            hz_ldl_right[5] = Integer.parseInt(aView.getHz_10000_field_ldl_right());
            hz_ldl_right[6] = Integer.parseInt(aView.getHz_12000_field_ldl_right());

        data.setComments();
        data.setHz_pureTone_left(hz_pureTone_left);
        data.setHz_pureTone_right(hz_pureTone_right);
        data.setHz_ldl_left(hz_ldl_left);
        data.setHz_ldl_right(hz_ldl_right);
        data.setThresholdLeft(Integer.parseInt(aView.getThresholdLeft_field()));
        data.setThresholdRight(Integer.parseInt(aView.getThresholdRight_field()));
        data.setMinMaskLeft(Integer.parseInt(aView.getMinMaskLeft_field()));
        data.setMinMaskRight(Integer.parseInt(aView.getMinMaskRight_field()));
        data.setPitchMatch(Integer.parseInt(aView.getPitchMatch_field()));
        data.setMatchType(aView.getMatchType_field());
         */
    }

    /**
     * Loads already saved audiology data into the textfields of audiologyview
     */
    public void load() {

    }

    @Override
    public void initController() {

    }
    private AudiologyView aView;
    private Audiology data;
}