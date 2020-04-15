package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;

public class AudiologyView extends JPanel 
{
    public AudiologyView()
    {

    }

    // List of labels based on Audiogram Evaluation wireframe
    private JLabel title;
    private JLabel hz_250;
    private JLabel hz_500;
    private JLabel hz_1000;
    private JLabel hz_2500;
    private JLabel hz_5000;
    private JLabel hz_10000;
    private JLabel hz_12000;
    private JLabel additionalCommnents;
    private JLabel pureToneLeft;
    private JLabel pureToneRight;
    private JLabel ldlLeft;
    private JLabel ldlRight;
    private JLabel thresholdLeft;
    private JLabel thresholdRight;
    private JLabel minMaskLeft;
    private JLabel minMaskRight;
    private JLabel pitchMatch;
    private JLabel matchType;
    //List of text fields based on Audiogram Evaluation wireframe
    //pure tone left ear column
    private JTextField hz_250_field_pureTone_left;
    private JTextField hz_500_field_pureTone_left;
    private JTextField hz_1000_field_pureTone_left;
    private JTextField hz_2500_field_pureTone_left;
    private JTextField hz_5000_field_pureTone_left;
    private JTextField hz_10000_field_pureTone_left;
    private JTextField hz_12000_field_pureTone_left;
    //pure tone right ear column
    private JTextField hz_250_field_pureTone_right;
    private JTextField hz_500_field_pureTone_right;
    private JTextField hz_1000_field_pureTone_right;
    private JTextField hz_2500_field_pureTone_right;
    private JTextField hz_5000_field_pureTone_right;
    private JTextField hz_10000_field_pureTone_right;
    private JTextField hz_12000_field_pureTone_right;
    //ldl left ear column
    private JTextField hz_250_field_ldl_left;
    private JTextField hz_500_field_ldl_left;
    private JTextField hz_1000_field_ldl_left;
    private JTextField hz_2500_field_ldl_left;
    private JTextField hz_5000_field_ldl_left;
    private JTextField hz_10000_field_ldl_left;
    private JTextField hz_12000_field_ldl_left;
    //ldl right ear column
    private JTextField hz_250_field_ldl_right;
    private JTextField hz_500_field_ldl_right;
    private JTextField hz_1000_field_ldl_right;
    private JTextField hz_2500_field_ldl_right;
    private JTextField hz_5000_field_ldl_right;
    private JTextField hz_10000_field_ldl_right;
    private JTextField hz_12000_field_ldl_right;
    // misc textfields
    private JTextField thresholdLeft_field;
    private JTextField thresholdRight_field;
    private JTextField minMaskLeft_field;
    private JTextField minMaskRight_field;
    private JTextField pitchMatch_field;
    private JTextField matchType_field;
    private JTextField additionalCommnents_field;
    //Jbuttons based on Audiogram evaluation wireframe
    private JButton saveButton;
    private JButton cancelButton;
}