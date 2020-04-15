package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;

/**
 * The class allows the user to view Audiology
 */
public class AudiologyView extends JPanel 
{
    public AudiologyView()
    {

        setLayout(new BorderLayout());
        //north title
            title = new JLabel(BorderLayout.NORTH);
            title.setText("Audiogram Evaluation");
            add(title, BorderLayout.NORTH);

        //Setting the text on frequency labels
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
        //LEFT
            thresholdLeft = new JLabel();
            thresholdLeft.setText("Threshold (L)");
            add(thresholdLeft, BorderLayout.EAST);
            thresholdLeft_field = new JTextField();
            add(thresholdLeft_field, BorderLayout.EAST);
        //RIGHT
            thresholdRight = new JLabel();
            thresholdRight.setText("Threshold (R)");
            add(thresholdRight, BorderLayout.EAST);
            thresholdRight_field = new JTextField();
            add(thresholdRight_field, BorderLayout.EAST);
        //User enters Patients minimum masking level for the left and right ear respectively
        //LEFT
            minMaskLeft = new JLabel();
            minMaskLeft.setText("Min Masking Level (L)");
            add(minMaskLeft, BorderLayout.EAST);
            minMaskLeft_field = new JTextField();
            add(minMaskLeft_field, BorderLayout.EAST);
        //RIGHT
            minMaskRight = new JLabel();
            minMaskRight.setText("Min Masking Level (R)");
            add(minMaskRight, BorderLayout.EAST);
            minMaskRight_field = new JTextField();
            add(minMaskRight_field, BorderLayout.EAST);
        //User enters Pitch Match
            pitchMatch = new JLabel();
            pitchMatch.setText("Pitch Match");
            add(pitchMatch, BorderLayout.EAST);
            pitchMatch_field = new JTextField();
            add(pitchMatch_field, BorderLayout.EAST);
        //User enters the match type
            matchType = newJLabel();
            matchType.setText("Match Type");
            add(matchType, BorderLayout.EAST);
            matchType_field = new JTextField();
            add(matchType_field, BorderLayout.EAST);
        //User enters anyfurther comments
            additionalCommnents = JLabel();
            additionalCommnents.setText("Additional Comments:");
            add(additionalCommnents, BorderLayout.EAST);
            additionalCommnents_area = new JTextArea();
            add(additionalCommnents_area, BorderLayout.EAST);

        //User pushes button with actionlisteners set in controller
            saveButton = new JButton();
            saveButton.setText("Save");
            cancelButton = new JButton();
            cancelButton.setText("Cancel");
            add(cancelButton, BorderLayout.SOUTH);
            add(saveButton, BorderLayout.SOUTH);
        //Center Panel is created to organize the audiogram table with 9 rows and 4 columns
        //including labels and textfields
            centerPanel = new JPanel();
            centerPanel.setLayout(new GridLayout(9, 4));
        //Row1
            centerPanel.add(frequency);
            centerPanel.add(pureToneLeft);
            centerPanel.add(pureToneRight);
            centerPanel.add(ldlLeft);
            centerPanel.add(ldlRight);
        //Row2
            centerPanel.add(hz_250);
            centerPanel.add(hz_250_field_pureTone_left);
            centerPanel.add(hz_250_field_pureTone_right);
            centerPanel.add(emptyLabel); // The LDL evaluation does not account for sounds below 500hz
            centerPanel.add(emptyLabel); // The LDL evaluation does not account for sounds below 500hz
        //Row3
            centerPanel.add(hz_500);
            centerPanel.add(hz_500_field_pureTone_left);
            centerPanel.add(hz_500_field_pureTone_right;
            centerPanel.add(hz_500_field_ldl_left);
            centerPanel.add(hz_500_field_ldl_right);
        //Row4
            centerPanel.add(hz_1000);
            centerPanel.add(hz_1000_field_pureTone_left);
            centerPanel.add(hz_1000_field_pureTone_right);
            centerPanel.add(hz_1000_field_ldl_left);
            centerPanel.add(hz_1000_field_ldl_right);
        //Row5
            centerPanel.add(hz_2500);
            centerPanel.add(hz_2500_field_pureTone_left);
            centerPanel.add(hz_2500_field_pureTone_right);
            centerPanel.add(hz_2500_field_ldl_left);
            centerPanel.add(hz_2500_field_ldl_right);
        //Row6
            centerPanel.add(hz_5000);
            centerPanel.add(hz_5000_field_pureTone_left);
            centerPanel.add(hz_5000_field_pureTone_right);
            centerPanel.add(hz_5000_field_ldl_left);
            centerPanel.add(hz_5000_field_ldl_right);
        //Row7
            centerPanel.add(hz_7500);
            centerPanel.add(hz_7500_field_pureTone_left);
            centerPanel.add(hz_7500_field_pureTone_right);
            centerPanel.add(hz_7500_field_ldl_left);
            centerPanel.add(hz_7500_field_ldl_right);
        //Row8
            centerPanel.add(hz_10000);
            centerPanel.add(hz_10000_field_pureTone_left);
            centerPanel.add(hz_10000_field_pureTone_right);
            centerPanel.add(hz_10000_field_ldl_left);
            centerPanel.add(hz_10000_field_ldl_right);
        //Row9
            centerPanel.add(hz_12000);
            centerPanel.add(hz_12000_field_pureTone_left);
            centerPanel.add(hz_12000_field_pureTone_right);
            centerPanel.add(hz_12000_field_ldl_left);
            centerPanel.add(hz_12000_field_ldl_right);

        add(centerPanel, BorderLayout.CENTER);
    }

    /**
     * sets the action listener to the Save Button
     * @param listener
     */
    public void setSaveButtonAction(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    /**
     * sets the action listener to the Cancel Button
     * @param listener
     */
    public void setCancelButtonAction(ActionListener listener) {
        cancelButton.addActionListener(listener);
    }
    public void setHz_250_field_pureTone_left(String value) {
        this.hz_250_field_pureTone_left.setText(value);
    }

    public void setHz_250_field_pureTone_right(String value) {
        this.hz_250_field_pureTone_right.setText(value);
    }

    public void setHz_1000_field_pureTone_left(String value) {
        this.hz_1000_field_pureTone_left.setText(value);
    }

    public void setHz_1000_field_pureTone_right(String value) {
        this.hz_1000_field_pureTone_right.setText(value);
    }

    public void setHz_2500_field_pureTone_left(String value) {
        this.hz_2500_field_pureTone_left.setText(value);
    }

    public void setHz_2500_field_pureTone_right(String value) {
        this.hz_2500_field_pureTone_right.setText(value);
    }

    public void setHz_5000_field_pureTone_left(String value) {
        this.hz_5000_field_pureTone_left.setText(value);
    }

    public void setHz_5000_field_ldl_right(String value) {
        this.hz_5000_field_ldl_right.setText(value);
    }

    public void setHz_7500_field_pureTone_left(String value) {
        this.hz_7500_field_pureTone_left.setText(value);
    }

    public void setHz_7500_field_pureTone_right(String value) {
        this.hz_7500_field_pureTone_right.setText(value);
    }

    public void setHz_10000_field_pureTone_left(String value) {
        this.hz_10000_field_pureTone_left.setText(value);
    }

    public void setHz_10000_field_pureTone_right(String value) {
        this.hz_10000_field_pureTone_right.setText(value);
    }

    public void setHz_12000_field_pureTone_left(String value) {
        this.hz_12000_field_pureTone_left.setText(value);
    }

    public void setHz_12000_field_pureTone_right(String value) {
        this.hz_12000_field_pureTone_right.setText(value);
    }

    public void setHz_500_field_ldl_left(String value) {
        this.hz_500_field_ldl_left.setText(value);
    }

    public void setHz_500_field_ldl_right(String value) {
        this.hz_500_field_ldl_right.setText(value);
    }

    public void setHz_1000_field_ldl_left(String value) {
        this.hz_1000_field_ldl_left.setText(value);
    }

    public void setHz_1000_field_ldl_right(String value) {
        this.hz_1000_field_ldl_right.setText(value);
    }

    public void setHz_2500_field_ldl_left(String value) {
        this.hz_2500_field_ldl_left.setText(value);
    }

    public void setHz_2500_field_ldl_right(String value) {
        this.hz_2500_field_ldl_right.setText(value);
    }

    public void setHz_5000_field_ldl_left(String value) {
        this.hz_5000_field_ldl_left.setText(value);
    }

    public void setHz_7500_field_ldl_left(String value) {
        this.hz_7500_field_ldl_left.setText(value);
    }

    public void setHz_7500_field_ldl_right(String value) {
        this.hz_7500_field_ldl_right.setText(value);
    }

    public void setHz_10000_field_ldl_left(String value) {
        this.hz_10000_field_ldl_left.setText(value);
    }

    public void setHz_10000_field_ldl_right(String value) {
        this.hz_10000_field_ldl_right.setText(value);
    }

    public void setHz_12000_field_ldl_left(String value) {
        this.hz_12000_field_ldl_left.setText(value);
    }

    public void setHz_12000_field_ldl_right(String value) {
        this.hz_12000_field_ldl_right.setText(value);
    }

    public void setMatchType_field(String value) {
        this.matchType_field.setText(value);
    }

    public void setMinMaskLeft_field(String value) {
        this.minMaskLeft_field.setText(value);
    }

    public void setMinMaskRight_field(String value) {
        this.minMaskRight_field =.setText(value);
    }

    public void setPitchMatch_field(String value) {
        this.pitchMatch_field.setText(value);
    }

    public void setThresholdLeft_field(String value) {
        this.thresholdLeft_field.setText(value);
    }

    public void setThresholdRight_field(String value) {
        this.thresholdRight_field.setText(value);
    }

    /**
     * Getter for the input of 250hz pure tone left ear audiogram
     * @return text from hz_250_field_puretone_left
     */
    public String getHz_250_field_pureTone_left() {
        return hz_250_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 500hz pure tone left ear audiogram
     * @return text from hz_500_field_puretone_left
     */
    public String getHz_500_field_pureTone_left() {
        return hz_500_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 1,000hz pure tone left ear audiogram
     * @return text from hz_1000_field_puretone_left
     */
    public String getHz_1000_field_pureTone_left() {
        return hz_1000_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 2,500hz pure tone left ear audiogram
     * @return text from hz_2500_field_puretone_left
     */
    public String getHz_2500_field_pureTone_left() {
        return hz_2500_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 5,000hz pure tone left ear audiogram
     * @return text from hz_5000_field_puretone_left
     */
    public String getHz_5000_field_pureTone_left() {
        return hz_5000_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 7,500hz pure tone left ear audiogram
     * @return text from hz_7500_field_puretone_left
     */
    public String getHz_7500_field_pureTone_left() {
        return hz_7500_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 10,000hz pure tone left ear audiogram
     * @return text from hz_10000_field_puretone_left
     */
    public String getHz_10000_field_pureTone_left() {
        return hz_10000_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 12,000hz pure tone left ear audiogram
     * @return text from hz_12000_field_puretone_left
     */
    public String getHz_12000_field_pureTone_left() {
        return hz_12000_field_pureTone_left.getText();
    }
    /**
     * Getter for the input of 250hz pure tone right ear audiogram
     * @return text from hz_250_field_puretone_right
     */
    public String getHz_250_field_pureTone_right() {
        return hz_250_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 500hz pure tone right ear audiogram
     * @return text from hz_500_field_puretone_right
     */
    public String getHz_500_field_pureTone_right() {
        return hz_500_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 1,000hz pure tone right ear audiogram
     * @return text from hz_1000_field_puretone_right
     */
    public String getHz_1000_field_pureTone_right() {
        return hz_1000_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 2,500hz pure tone right ear audiogram
     * @return text from hz_2500_field_puretone_right
     */
    public String getHz_2500_field_pureTone_right() {
        return hz_2500_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 5,000hz pure tone right ear audiogram
     * @return text from hz_5000_field_puretone_right
     */
    public String getHz_5000_field_pureTone_right() {
        return hz_5000_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 7,500hz pure tone right ear audiogram
     * @return text from hz_7500_field_puretone_right
     */
    public String getHz_7500_field_pureTone_right() {
        return hz_7500_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 10,000hz pure tone right ear audiogram
     * @return text from hz_10000_field_puretone_right
     */
    public String getHz_10000_field_pureTone_right() {
        return hz_10000_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 12,000hz pure tone right ear audiogram
     * @return text from hz_12000_field_puretone_right
     */
    public String getHz_12000_field_pureTone_right() {
        return hz_12000_field_pureTone_right.getText();
    }
    /**
     * Getter for the input of 500hz ldl left ear audiogram
     * @return text from hz_500_field_ldl_left
     */
    public String getHz_500_field_ldl_left() {
        return hz_500_field_ldl_left.getText();
    }
    /**
     * Getter for the input of 1,000hz ldl left ear audiogram
     * @return text from hz_1000_field_ldl_left
     */
    public String getHz_1000_field_ldl_left() {
        return hz_1000_field_ldl_left.getText();
    }
    /**
     * Getter for the input of 2,500hz ldl right ear audiogram
     * @return text from hz_2500_field_ldl_right
     */
    public String getHz_2500_field_ldl_left() {
        return hz_2500_field_ldl_left.getText();
    }
    /**
     * Getter for the input of 5000hz ldl left ear audiogram
     * @return text from hz_5000_field_ldl_left
     */
    public String getHz_5000_field_ldl_left() {
        return hz_5000_field_ldl_left.getText();
    }
    /**
     * Getter for the input of 7,500hz ldl left ear audiogram
     * @return text from hz_7500_field_ldl_left
     */
    public String getHz_7500_field_ldl_left() {
        return hz_7500_field_ldl_left.getText();
    }
    /**
     * Getter for the input of 10,000hz ldl left ear audiogram
     * @return text from hz_10000_field_ldl_left
     */
    public String getHz_10000_field_ldl_left() {
        return hz_10000_field_ldl_left.getText();
    }
    /**
     * Getter for the input of 12,000hz ldl left ear audiogram
     * @return text from hz_12000_field_ldl_left
     */
    public String getHz_12000_field_ldl_left() {
        return hz_12000_field_ldl_left.getText();
    }
    /**
     * Getter for the input of 500hz ldl right ear audiogram
     * @return text from hz_500_field_ldl_right
     */
    public String getHz_500_field_ldl_right() {
        return hz_500_field_ldl_right.getText();
    }
    /**
     * Getter for the input of 1,000hz ldl right ear audiogram
     * @return text from hz_1000_field_ldl_right
     */
    public String getHz_1000_field_ldl_right() {
        return hz_1000_field_ldl_right.getText();
    }
    /**
     * Getter for the input of 2,500hz ldl right ear audiogram
     * @return text from hz_2500_field_ldl_right
     */
    public String getHz_2500_field_ldl_right() {
        return hz_2500_field_ldl_right.getText();
    }
    /**
     * Getter for the input of 5000hz ldl right ear audiogram
     * @return text from hz_5000_field_ldl_right
     */
    public String getHz_5000_field_ldl_right() {
        return hz_5000_field_ldl_right.getText();
    }
    /**
     * Getter for the input of 7,500hz ldl right ear audiogram
     * @return text from hz_7500_field_ldl_right
     */
    public String getHz_7500_field_ldl_right() {
        return hz_7500_field_ldl_right.getText();
    }
    /**
     * Getter for the input of 10,000hz ldl right ear audiogram
     * @return text from hz_10000_field_ldl_right
     */
    public String getHz_10000_field_ldl_right() {
        return hz_10000_field_ldl_right.getText();
    }
    /**
     * Getter for the input of 12,000hz ldl right ear audiogram
     * @return text from hz_12000_field_ldl_right
     */
    public String getHz_12000_field_ldl_right() {
        return hz_12000_field_ldl_right.getText();
    }
    /**
     * Getter for the input of the additional comments block
     * @return text from additionalComments_area
     */
    public String getAdditionalComments_area() {
        return additionalCommnents_area.getText();
    }
    /**
     * Getter for the input of match type
     * @return text from matchType_field
     */
    public String getMatchType_field() {
        return matchType_field.getText();
    }
    /**
     * Getter for the input of the minimum masking level for the left ear
     * @return text from minMaskLeft_field
     */
    public String getMinMaskLeft_field() {
        return minMaskLeft_field.getText();
    }
    /**
     * Getter for the input of the minimum masking level for the Right ear
     * @return text from minMaskRight_field
     */
    public String getMinMaskRight_field() {
        return minMaskRight_field.getText();
    }
    /**
     * Getter for the input of the pitch match
     * @return text from pitchMatch_field
     */
    public String getPitchMatch_field() {
        return pitchMatch_field.getText();
    }
    /**
     * Getter for the input of the threshold of the left ear
     * @return text from thresholdLeft_field
     */
    public String getThresholdLeft_field() {
        return thresholdLeft_field.getText();
    }
    /**
     * Getter for the input of the threshold of the Right ear
     * @return text from thresholdRight_field
     */
    public String getThresholdRight_field() {
        return thresholdRight_field.getText();
    }

    /**
     * Getter for comments
     * @return String from additionalComments_area
     */
    public String getAdditionalComments() {
        return additionalCommnents_area.getText();
    }

    //List of Panels to organize components within audiologyview
    private JPanel centerPanel;
    // List of labels based on Audiogram Evaluation wireframe
    private JLabel title;
    //set hz labels on the west border of the audiogram evaluation
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