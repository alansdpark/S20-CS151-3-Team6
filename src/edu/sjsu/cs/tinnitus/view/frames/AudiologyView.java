package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;
import java.awt.*;

/**
 * The class allows the user to view Audiology
 */
public class AudiologyView extends JPanel
{
    public AudiologyView()
    {

        setLayout(new BorderLayout());

        //NORTH
        title = new JLabel();
        title.setText("Audiogram Evaluation");
        add(title, BorderLayout.NORTH);

        //EAST
        comments = new JLabel();
        comments.setText("Additional Comments:");
        add(comments, BorderLayout.EAST);
        additionalCommnents = new JTextArea();
        add(additionalCommnents_area, BorderLayour.EAST);
        saveButton = new JButton();
        saveButton.setText("Save");
        add(saveButton, BorderLayout.EAST);
        nextButton = new JButton();
        nextButton.setText("Next");
        add(nextButton, BorderLayout.EAST);

        //WEST
        //Stages
        stageOne = new JPanel();
        stageOne.setLayout(new GridLayout(9, 3));
        stageTwo = new JPanel();
        stageTwo.setLayout(new GridLayout(8,3));
        stageThree = new JPanel();
        stageThree.setLayout(new GridLayout(3, 5));
        //ear Labels
        leftEar = new JLabel();
        leftEar.setText("Left Ear");
        rightEar = new JLabel();
        rightEar.setText("Right Ear");
        //hz labels
        frequency = new JLabel();
        frequency.setText("frequency (Hz)");
        hz_250 = new JLabel();
        hz_250.setText("250Hz");
        hz_500 = new JLabel();
        hz_500.setText("500Hz");
        hz_1000 = new JLabel();
        hz_1000.setText("1000Hz");
        hz_2500 = new JLabel();
        hz_2500.setText("2500Hz");
        hz_5000 = new JLabel();
        hz_5000.setText("5000Hz");
        hz_7500 = new JLabel();
        hz_7500.setText("7500Hz");
        hz_10000 = new JLabel();
        hz_10000.setText("10000Hz");
        hz_12000 = new JLabel();
        hz_12000.setText("12000Hz");
        //misc labels
        threshold = new JLabel();
        threshold.setText("Threshold");
        minMask = new JLabel();
        minMask.setText("Min. Masking Level");
        pitchMatch = new JLabel();
        pitchMatch.setText("Pitch Match");
        matchType = new JLabel();
        matchType.setText("Match Type");
        // The empty label is to fill a spot in the grid layout
        JLabel emptyLabel = new JLabel();
        // User enters patients results for Left Ear Pure Tone Audiogram
        hz_250_field_pureTone_left = new JTextField();
        hz_500_field_pureTone_left = new JTextField();
        hz_1000_field_pureTone_left = new JTextField();
        hz_2500_field_pureTone_left = new JTextField();
        hz_5000_field_pureTone_left = new JTextField();
        hz_7500_field_pureTone_left = new JTextField();
        hz_10000_field_pureTone_left = new JTextField();
        hz_12000_field_pureTone_left = new JTextField();
        // User enters patients results for Right Ear Pure Tone Audiogram
        hz_250_field_pureTone_right = new JTextField();
        hz_500_field_pureTone_right = new JTextField();
        hz_1000_field_pureTone_right = new JTextField();
        hz_2500_field_pureTone_right = new JTextField();
        hz_5000_field_pureTone_right = new JTextField();
        hz_7500_field_pureTone_right = new JTextField();
        hz_10000_field_pureTone_right = new JTextField();
        hz_12000_field_pureTone_right = new JTextField();
        // User enters patients results for Left Ear LDL Audiogram
        hz_500_field_ldl_left = new JTextField();
        hz_1000_field_ldl_left = new JTextField();
        hz_2500_field_ldl_left = new JTextField();
        hz_5000_field_ldl_left = new JTextField();
        hz_7500_field_ldl_left = new JTextField();
        hz_10000_field_ldl_left = new JTextField();
        hz_12000_field_ldl_left = new JTextField();
        // User enters patients results for Right Ear LDL Audiogram
        hz_500_field_ldl_right = new JTextField();
        hz_1000_field_ldl_right = new JTextField();
        hz_2500_field_ldl_right = new JTextField();
        hz_5000_field_ldl_right = new JTextField();
        hz_7500_field_ldl_right = new JTextField();
        hz_10000_field_ldl_right = new JTextField();
        hz_12000_field_ldl_right = new JTextField();
        //User enters Patients threshold for left and right ear respectively
        thresholdLeft_field = new JTextField();
        thresholdRight_field = new JTextField();
        //User enters Patients minimum masking level for the left and right ear respectively
        minMaskLeft_field = new JTextField();
        minMaskRight_field = new JTextField();
        //User enters
        pitchMatch_field = new JTextField();
        matchType_field = new JTextField();

        //STAGE ONE
        stageOne.add(frequency);
        stageOne.add(leftEar);
        stageOne.add(rightEar);
        stageOne.add(hz_250);
        stageOne.add(hz_250_field_pureTone_left);
        stageOne.add(hz_250_field_pureTone_right);
        stageOne.add(hz_500);
        stageOne.add(hz_500_field_pureTone_left);
        stageOne.add(hz_500_field_pureTone_right);
        stageOne.add(hz_1000);
        stageOne.add(hz_1000_field_pureTone_left);
        stageOne.add(hz_1000_field_pureTone_right);
        stageOne.add(hz_2500);
        stageOne.add(hz_2500_field_pureTone_left);
        stageOne.add(hz_2500_field_pureTone_right);
        stageOne.add(hz_5000);
        stageOne.add(hz_5000_field_pureTone_left);
        stageOne.add(hz_5000_field_pureTone_right);
        stageOne.add(hz_7500);
        stageOne.add(hz_7500_field_pureTone_left);
        stageOne.add(hz_7500_field_pureTone_right);
        stageOne.add(hz_10000);
        stageOne.add(hz_10000_field_pureTone_left);
        stageOne.add(hz_10000_field_pureTone_right);
        stageOne.add(hz_12000);
        stageOne.add(hz_12000_field_pureTone_left);
        stageOne.add(hz_12000_field_pureTone_right);
        //STAGE TWO
        stageTwo.add(frequency);
        stageTwo.add(leftEar);
        stageTwo.add(rightEar);
        stageTwo.add(hz_500);
        stageTwo.add(hz_500_field_ldl_left);
        stageTwo.add(hz_500_field_ldl_right);
        stageTwo.add(hz_1000);
        stageTwo.add(hz_1000_field_ldl_left);
        stageTwo.add(hz_1000_field_ldl_right);
        stageTwo.add(hz_2500);
        stageTwo.add(hz_2500_field_ldl_left);
        stageTwo.add(hz_2500_field_ldl_right);
        stageTwo.add(hz_5000);
        stageTwo.add(hz_5000_field_ldl_left);
        stageTwo.add(hz_5000_field_ldl_right);
        stageTwo.add(hz_7500);
        stageTwo.add(hz_7500_field_ldl_left);
        stageTwo.add(hz_7500_field_ldl_right);
        stageTwo.add(hz_10000);
        stageTwo.add(hz_10000_field_ldl_left);
        stageTwo.add(hz_10000_field_ldl_right);
        stageTwo.add(hz_12000);
        stageTwo.add(hz_12000_field_ldl_left);
        stageTwo.add(hz_12000_field_ldl_right);
        //STAGE THREE
        stageThree.add(emptyLabel);
        stageThree.add(leftEar);
        stageThree.add(rightEar);
        stageThree.add(emptyLabel);
        stageThree.add(emptyLabel);
        stageThree.add(threshold);
        stageThree.add(thresholdLeft_field);
        stageThree.add(thresholdRight_field);
        stageThree.add(pitchMatch);
        stageThree.add(pitchMatch_field);
        stageThree.add(minMask);
        stageThree.add(minMaskLeft_field);
        stageThree.add(minMaskRight_field);
        stageThree.add(matchType);
        stageThree.add(matchType_field);
    }

    /**
     * Getter for Next JButton
     * @return nextButton
     */
    public JButton getNextButton() {
        return nextButton;
    }

    /**
     * Getter for Save JButton
     * @return saveButton
     */
    public JButton getSaveButton() {
        return saveButton;
    }



    /**
     * Removes the current stage of testing
     * Adds the next stage of testing
     * Starts at Stage 1
     * Stops at Stage 3
     */
    public void moveUpStage() {
        if (stage == 1) {
            this.remove(stageOne);
            this.add(StageTwo);
            stage++;
        } else if (stage == 2) {
            this.remove(stageTwo);
            this.add(stageThree);
            stage++;
        } else {
            //do nothing
        }

    }
    /**
     * Removes the current stage of testing
     * Adds the last stage of testing
     * Starts at Stage 1
     * Stops at Stage 3
     */
    public void moveDownStage() {
        if (stage == 3) {
            this.remove(stageThree);
            this.add(StageTwo);
            repaint();
            stage--;
        } else if (stage == 2) {
            this.remove(stageTwo);
            this.add(stageOne);
            stage--;
            repaint();
        } else {
            //do nothing
        }

    }

    /**
     * Stage of audiological exam.
     *
     * 1 = pure-tone audiogram
     * 2 = loudness discomfort levels
     * 3 = tinnitus pitch matc, match type, thresholds of hearing, minimal masking levels for left and right ear.
     */
    private int stage;

    // List of labels based on Audiogram Evaluation wireframe
    private JLabel title;

    private JLabel leftEar;
    private JLabel rightEar;
    //Labels for Stage One and Stage Two
    private JLabel frequency;
    private JLabel hz_250;
    private JLabel hz_500;
    private JLabel hz_1000;
    private JLabel hz_2500;
    private JLabel hz_5000;
    private JLabel hz_7500;
    private JLabel hz_10000;
    private JLabel hz_12000;

    //List of text fields based on Audiogram Evaluation wireframe
    private JLabel pureToneLeft;
    private JLabel pureToneRight;
    private JLabel ldlLeft;
    private JLabel ldlRight;
    private JLabel minMask;
    private JLabel threshold;
    private JLabel pitchMatch;
    private JLabel matchType;
    private JLabel comments;

    // STAGE ONE
    private JPanel stageOne;
    //pure tone left ear column
    private JTextField hz_250_field_pureTone_left;
    private JTextField hz_500_field_pureTone_left;
    private JTextField hz_1000_field_pureTone_left;
    private JTextField hz_2500_field_pureTone_left;
    private JTextField hz_5000_field_pureTone_left;
    private JTextField hz_7500_field_pureTone_left;
    private JTextField hz_10000_field_pureTone_left;
    private JTextField hz_12000_field_pureTone_left;
    //pure tone right ear column
    private JTextField hz_250_field_pureTone_right;
    private JTextField hz_500_field_pureTone_right;
    private JTextField hz_1000_field_pureTone_right;
    private JTextField hz_2500_field_pureTone_right;
    private JTextField hz_5000_field_pureTone_right;
    private JTextField hz_7500_field_pureTone_right;
    private JTextField hz_10000_field_pureTone_right;
    private JTextField hz_12000_field_pureTone_right;
    // STAGE TWO
    private JPanel stageTwo;
    //ldl left ear column
    private JTextField hz_500_field_ldl_left;
    private JTextField hz_1000_field_ldl_left;
    private JTextField hz_2500_field_ldl_left;
    private JTextField hz_5000_field_ldl_left;
    private JTextField hz_7500_field_ldl_left;
    private JTextField hz_10000_field_ldl_left;
    private JTextField hz_12000_field_ldl_left;
    //ldl right ear column
    private JTextField hz_500_field_ldl_right;
    private JTextField hz_1000_field_ldl_right;
    private JTextField hz_2500_field_ldl_right;
    private JTextField hz_5000_field_ldl_right;
    private JTextField hz_7500_field_ldl_right;
    private JTextField hz_10000_field_ldl_right;
    private JTextField hz_12000_field_ldl_right;
    //STAGE THREE
    private JPanel stageThree;
    // misc textfields
    private JTextField thresholdLeft_field;
    private JTextField thresholdRight_field;
    private JTextField minMaskLeft_field;
    private JTextField minMaskRight_field;
    private JTextField pitchMatch_field;
    private JTextField matchType_field;
    private JTextArea additionalCommnents_area;


    //Jbuttons based on Audiogram evaluation wireframe
    private JButton saveButton;
    private JButton nextButton;



}