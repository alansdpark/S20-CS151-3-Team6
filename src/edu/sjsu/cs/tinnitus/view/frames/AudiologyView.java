package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;

/**
 * The class allows the user to view Audiology
 */
public class AudiologyView extends JPanel 
{
    public AudiologyView()
    {

        AudiologyView.setLayout(new BorderLayout());
        //north title
        title = new JLabel(BorderLayout.NORTH);
        title.setText("Audiogram Evaluation");

        //hz labels
        frequency = new JLabel();
        frequency.setText("frequency (Hz)")
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
        additionalCommnents = new JTextArea();

        saveButton = new JButton();
        saveButton.setText("Save");
        cancelButton = new JButton();
        cancelButton.setText("Cancel");

        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(8, 4));

        centerPanel.add(frequency);
        centerPanel.add(pureToneLeft);
        centerPanel.add(pureToneRight);
        centerPanel.add(ldlLeft);
        centerPanel.add(ldlRight);
        centerPanel.add(hz_250);
        centerPanel.add(hz_250_field_pureTone_left);
        centerPanel.add(hz_250_field_pureTone_right);
        centerPanel.add(emptyLabel);
        centerPanel.add(emptyLabel);
        centerPanel.add(hz_500);
        centerPanel.add(hz_500_field_pureTone_left);
        centerPanel.add(hz_500_field_pureTone_right;
        centerPanel.add(hz_500_field_ldl_left);
        centerPanel.add(hz_500_field_ldl_right);
        centerPanel.add(hz_1000);
        centerPanel.add(hz_1000_field_pureTone_left);
        centerPanel.add(hz_1000_field_pureTone_right);
        centerPanel.add(hz_1000_field_ldl_left);
        centerPanel.add(hz_1000_field_ldl_right);
        centerPanel.add(hz_2500);
        centerPanel.add(hz_2500_field_pureTone_left);
        centerPanel.add(hz_2500_field_pureTone_right);
        centerPanel.add(hz_2500_field_ldl_left);
        centerPanel.add(hz_2500_field_ldl_right);
        centerPanel.add(hz_5000);
        centerPanel.add(hz_5000_field_pureTone_left);
        centerPanel.add(hz_5000_field_pureTone_right);
        centerPanel.add(hz_5000_field_ldl_left);
        centerPanel.add(hz_5000_field_ldl_right);
        centerPanel.add(hz_7500);
        centerPanel.add(hz_7500_field_pureTone_left);
        centerPanel.add(hz_7500_field_pureTone_right);
        centerPanel.add(hz_7500_field_ldl_left);
        centerPanel.add(hz_7500_field_ldl_right);
        centerPanel.add(hz_10000);
        centerPanel.add(hz_10000_field_pureTone_left);
        centerPanel.add(hz_10000_field_pureTone_right);
        centerPanel.add(hz_10000_field_ldl_left);
        centerPanel.add(hz_10000_field_ldl_right);
        centerPanel.add(hz_12000);
        centerPanel.add(hz_12000_field_pureTone_left);
        centerPanel.add(hz_12000_field_pureTone_right);
        centerPanel.add(hz_12000_field_ldl_left);
        centerPanel.add(hz_12000_field_ldl_right);
    }

    public JLabel getFrequency() {
        return frequency;
    }

    public JLabel getAdditionalCommnents() {
        return additionalCommnents;
    }
    public JButton getSaveButton() {
        return saveButton;
    }
    public JButton getCancelButton() {
        return cancelButton;
    }

    public JLabel getLdlLeft() {
        return ldlLeft;
    }
    public JLabel getLdlRight() {
        return ldlRight;
    }

    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JLabel getMatchType() {
        return matchType;
    }

    public JLabel getMinMaskLeft() {
        return minMaskLeft;
    }

    public JLabel getMinMaskRight() {
        return minMaskRight;
    }

    public JLabel getPitchMatch() {
        return pitchMatch;
    }

    public JLabel getPureToneLeft() {
        return pureToneLeft;
    }

    public JLabel getPureToneRight() {
        return pureToneRight;
    }

    public JLabel getThresholdLeft() {
        return thresholdLeft;
    }

    public JLabel getThresholdRight() {
        return thresholdRight;
    }

    public JLabel getTitle() {
        return title;
    }

    public JPanel getHzPanel() {
        return hzPanel;
    }
    public String getHz_250_field_pureTone_left() {
        return hz_250_field_pureTone_left.getText();
    }

    public String getHz_500_field_pureTone_left() {
        return hz_500_field_pureTone_left.getText();
    }

    public String getHz_1000_field_pureTone_left() {
        return hz_1000_field_pureTone_left.getText();
    }

    public String getHz_2500_field_pureTone_left() {
        return hz_2500_field_pureTone_left.getText();
    }

    public String getHz_5000_field_pureTone_left() {
        return hz_5000_field_pureTone_left.getText();
    }

    public String getHz_7500_field_pureTone_left() {
        return hz_7500_field_pureTone_left.getText();
    }

    public String getHz_10000_field_pureTone_left() {
        return hz_10000_field_pureTone_left.getText();
    }

    public String getHz_12000_field_pureTone_left() {
        return hz_12000_field_pureTone_left.getText();
    }

    public String getHz_250_field_pureTone_right() {
        return hz_250_field_pureTone_right.getText();
    }

    public String getHz_500_field_pureTone_right() {
        return hz_500_field_pureTone_right.getText();
    }

    public String getHz_1000_field_pureTone_right() {
        return hz_1000_field_pureTone_right.getText();
    }

    public String getHz_2500_field_pureTone_right() {
        return hz_2500_field_pureTone_right.getText();
    }

    public String getHz_5000_field_pureTone_right() {
        return hz_5000_field_pureTone_right.getText();
    }

    public String getHz_7500_field_pureTone_right() {
        return hz_7500_field_pureTone_right.getText();
    }

    public String getHz_10000_field_pureTone_right() {
        return hz_10000_field_pureTone_right.getText();
    }

    public String getHz_12000_field_pureTone_right() {
        return hz_12000_field_pureTone_right.getText();
    }

    public String getHz_500_field_ldl_left() {
        return hz_500_field_ldl_left.getText();
    }

    public String getHz_1000_field_ldl_left() {
        return hz_1000_field_ldl_left.getText();
    }

    public String getHz_2500_field_ldl_left() {
        return hz_2500_field_ldl_left.getText();
    }

    public String getHz_5000_field_ldl_left() {
        return hz_5000_field_ldl_left.getText();
    }

    public String getHz_7500_field_ldl_left() {
        return hz_7500_field_ldl_left.getText();
    }

    public String getHz_10000_field_ldl_left() {
        return hz_10000_field_ldl_left.getText();
    }

    public String getHz_12000_field_ldl_left() {
        return hz_12000_field_ldl_left.getText();
    }

    public String getHz_500_field_ldl_right() {
        return hz_500_field_ldl_right.getText();
    }

    public String getHz_1000_field_ldl_right() {
        return hz_1000_field_ldl_right.getText();
    }

    public String getHz_2500_field_ldl_right() {
        return hz_2500_field_ldl_right.getText();
    }

    public String getHz_5000_field_ldl_right() {
        return hz_5000_field_ldl_right.getText();
    }

    public String getHz_7500_field_ldl_right() {
        return hz_7500_field_ldl_right.getText();
    }

    public String getHz_10000_field_ldl_right() {
        return hz_10000_field_ldl_right.getText();
    }

    public String getHz_12000_field_ldl_right() {
        return hz_12000_field_ldl_right.getText();
    }

    public String getAdditionalCommnents_area() {
        return additionalCommnents_area.getText();
    }

    public String getMatchType_field() {
        return matchType_field.getText();
    }

    public String getMinMaskLeft_field() {
        return minMaskLeft_field.getText();
    }

    public String getMinMaskRight_field() {
        return minMaskRight_field.getText();
    }

    public String getPitchMatch_field() {
        return pitchMatch_field.getText();
    }

    public String getThresholdLeft_field() {
        return thresholdLeft_field.getText();
    }

    public String getThresholdRight_field() {
        return thresholdRight_field.getText();
    }

    // List of labels based on Audiogram Evaluation wireframe
    private JLabel title;
    //set hz labels on the west border of the audiogram evaluation
    private JPanel hzPanel;
    private JLabel frequency;
    private JLabel hz_250;
    private JLabel hz_500;
    private JLabel hz_1000;
    private JLabel hz_2500;
    private JLabel hz_5000;
    private JLabel hz_7500;
    private JLabel hz_10000;
    private JLabel hz_12000;
    private JLabel additionalCommnents;
    private JLabel thresholdLeft;
    private JLabel thresholdRight;
    private JLabel minMaskLeft;
    private JLabel minMaskRight;
    private JLabel pitchMatch;
    private JLabel matchType;
    //List of text fields based on Audiogram Evaluation wireframe
    private JLabel pureToneLeft;
    private JLabel pureToneRight;
    private JLabel ldlLeft;
    private JLabel ldlRight;
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
    private JButton cancelButton;

    private JPanel centerPanel;
}