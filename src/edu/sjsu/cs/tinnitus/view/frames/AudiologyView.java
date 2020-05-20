package edu.sjsu.cs.tinnitus.view.frames;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * The class allows the user to view Audiology
 */
public class AudiologyView
{
	/**
	 * Constructor
	 */
    public AudiologyView()
    {

        initComponents();
        addComponents();
        panel.setVisible(true);


        //NORTH


        /**
        //EAST
        comments = new JLabel();
        comments.setText("Additional Comments:");
        add(comments, BorderLayout.EAST);
        additionalComments_area = new JTextArea();
        add(additionalComments_area, BorderLayout.EAST);
        saveButton = new JButton("Save");
        add(saveButton, BorderLayout.EAST);
        nextButton = new JButton("Next");
        add(nextButton, BorderLayout.EAST);
        backButton = new JButton("Back");
        add(backButton, BorderLayout.EAST);
        cancelButton = new JButton("Cancel");
        add(cancelButton, BorderLayout.EAST);

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
        stage = 2;
         */
    }

    /**
     * Initiates components onto JPanel view.
     */
    public void initComponents(){
        //EAST
        panel = new JPanel();
        comments = new JLabel("Additional Comments");
        additionalComments_area = new JTextArea();
        additionalComments_area.setRows(8);
        additionalComments_area.setColumns(20);
        saveButton = new JButton("Save");
        graphButton =  new JButton(" Generate Graph");

        initStageOne();
        initStageTwo();

    }

    public void initStageOne(){
        stageOne = new JPanel();
        stageOne.setLayout(new GridLayout(9, 3, 10, 5));

        hz_250 = new JLabel();
        hz_250.setText("250Hz");
        hz_250.setHorizontalAlignment(SwingConstants.RIGHT);
        hz_500 = new JLabel();
        hz_500.setText("500Hz");
        hz_500.setHorizontalAlignment(SwingConstants.RIGHT);
        hz_1000 = new JLabel();
        hz_1000.setText("1000Hz");
        hz_1000.setHorizontalAlignment(SwingConstants.RIGHT);
        hz_2500 = new JLabel();
        hz_2500.setText("2500Hz");
        hz_2500.setHorizontalAlignment(SwingConstants.RIGHT);
        hz_5000 = new JLabel();
        hz_5000.setText("5000Hz");
        hz_5000.setHorizontalAlignment(SwingConstants.RIGHT);
        hz_7500 = new JLabel();
        hz_7500.setText("7500Hz");
        hz_7500.setHorizontalAlignment(SwingConstants.RIGHT);
        hz_10000 = new JLabel();
        hz_10000.setText("10000Hz");
        hz_10000.setHorizontalAlignment(SwingConstants.RIGHT);
        hz_12000 = new JLabel();
        hz_12000.setText("12000Hz");
        hz_12000.setHorizontalAlignment(SwingConstants.RIGHT);

        hz_250_field_pureTone_left = new JTextField(5);
        hz_500_field_pureTone_left = new JTextField(5);
        hz_1000_field_pureTone_left = new JTextField(5);
        hz_2500_field_pureTone_left = new JTextField(5);
        hz_5000_field_pureTone_left = new JTextField(5);
        hz_7500_field_pureTone_left = new JTextField(5);
        hz_10000_field_pureTone_left = new JTextField(5);
        hz_12000_field_pureTone_left = new JTextField(5);
        // User enters patients results for Right Ear Pure Tone Audiogram
        hz_250_field_pureTone_right = new JTextField(5);
        hz_500_field_pureTone_right = new JTextField(5);
        hz_1000_field_pureTone_right = new JTextField(5);
        hz_2500_field_pureTone_right = new JTextField(5);
        hz_5000_field_pureTone_right = new JTextField(5);
        hz_7500_field_pureTone_right = new JTextField(5);
        hz_10000_field_pureTone_right = new JTextField(5);
        hz_12000_field_pureTone_right = new JTextField(5);
        // User enters patients results for Left Ear LDL Audiogram
        hz_500_field_ldl_left = new JTextField(5);
        hz_1000_field_ldl_left = new JTextField(5);
        hz_2500_field_ldl_left = new JTextField(5);
        hz_5000_field_ldl_left = new JTextField(5);
        hz_7500_field_ldl_left = new JTextField(5);
        hz_10000_field_ldl_left = new JTextField(5);
        hz_12000_field_ldl_left = new JTextField(5);
        // User enters patients results for Right Ear LDL Audiogram
        hz_500_field_ldl_right = new JTextField(5);
        hz_1000_field_ldl_right = new JTextField(5);
        hz_2500_field_ldl_right = new JTextField(5);
        hz_5000_field_ldl_right = new JTextField(5);
        hz_7500_field_ldl_right = new JTextField(5);
        hz_10000_field_ldl_right = new JTextField(5);
        hz_12000_field_ldl_right = new JTextField(5);
    }

    public void initStageTwo(){
        stageTwo = new JPanel();
        stageTwo.setLayout(new GridLayout(3,4));

        thresholdLeft = new JLabel("Threshold (L)", SwingConstants.RIGHT);
        thresholdRight = new JLabel("Threshold (R)", SwingConstants.RIGHT);
        minMaskLeft = new JLabel("Min Masking Level (L)", SwingConstants.RIGHT);
        minMaskRight = new JLabel("Min Masking Level (R)", SwingConstants.RIGHT);
        pitchMatch = new JLabel("Pitch Match", SwingConstants.RIGHT);
        matchType = new JLabel("Match Type", SwingConstants.RIGHT);

        thresholdLeft_field = new JTextField(5);
        thresholdRight_field = new JTextField(5);
        minMaskLeft_field = new JTextField(5);
        minMaskRight_field = new JTextField(5);
        pitchMatch_field = new JTextField(5);
        matchType_field = new JTextField(5);
    }

    public void addComponents(){
        addStageOneComponents();
        addStageTwoComponents();

        JLabel stageOneTitle = new JLabel("Audiology Table (Hz vs dB)", SwingConstants.CENTER);
        JPanel stageOnePanel = new JPanel(new BorderLayout());
        stageOnePanel.add(stageOneTitle, BorderLayout.NORTH);
        stageOnePanel.add(stageOne, BorderLayout.CENTER);
        panel.add(stageOnePanel);

        JLabel stageTwoTitle = new JLabel("Additional Information (dB)", SwingConstants.CENTER);
        JPanel stageTwoPanel = new JPanel(new BorderLayout());
        stageTwoPanel.add(stageTwoTitle, BorderLayout.NORTH);
        stageTwoPanel.add(stageTwo, BorderLayout.CENTER);
        panel.add(stageTwoPanel);

        JPanel commentsPanel = new JPanel(new BorderLayout());
        commentsPanel.add(comments, BorderLayout.NORTH);
        commentsPanel.add(additionalComments_area, BorderLayout.CENTER);
        panel.add(commentsPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(graphButton);
        commentsPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void addStageOneComponents(){
        stageOne.add(new JLabel("Frequency", SwingConstants.RIGHT));
        stageOne.add(new JLabel("Pure Tone Left(dB)"));
        stageOne.add(new JLabel("Pure Tone Right(dB)"));
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
    }

    public void addStageTwoComponents(){
        stageTwo.add(thresholdLeft);
        stageTwo.add(thresholdLeft_field);
        stageTwo.add(minMaskLeft);
        stageTwo.add(minMaskLeft_field);
        stageTwo.add(thresholdRight);
        stageTwo.add(thresholdRight_field);
        stageTwo.add(minMaskRight);
        stageTwo.add(minMaskRight_field);
        stageTwo.add(pitchMatch);
        stageTwo.add(pitchMatch_field);
        stageTwo.add(matchType);
        stageTwo.add(matchType_field);
    }



    /**
     * Getter for Save JButton
     * @return saveButton - JButton
     */
    public JButton getSaveButton() {
        return saveButton;
    }




    //PURETONE FOR THE LEFT EAR

    /**
     * Setter for the Left Ear Pure Tone at 250hz
     * @param hz_250_field_pureTone_left
     */
    public void setHz_250_field_pureTone_left(JTextField hz_250_field_pureTone_left) {
        this.hz_250_field_pureTone_left = hz_250_field_pureTone_left;
    }

    /**
     * Setter for the Left Ear Pure Tone at 500hz
     * @param hz_500_field_pureTone_left
     */
    public void setHz_500_field_pureTone_left(JTextField hz_500_field_pureTone_left) {
        this.hz_500_field_pureTone_left = hz_500_field_pureTone_left;
    }

    /**
     * Setter for the Left Ear Pure Tone at 1000hz
     * @param hz_1000_field_pureTone_left
     */
    public void setHz_1000_field_pureTone_left(JTextField hz_1000_field_pureTone_left) {
        this.hz_1000_field_pureTone_left = hz_1000_field_pureTone_left;
    }

    /**
     * Setter for the Left Ear Pure Tone at 2500hz
     * @param hz_2500_field_pureTone_left
     */
    public void setHz_2500_field_pureTone_left(JTextField hz_2500_field_pureTone_left) {
        this.hz_2500_field_pureTone_left = hz_2500_field_pureTone_left;
    }

    /**
     * Setter for the Left Ear Pure Tone at 5000hz
     * @param hz_5000_field_pureTone_left
     */
    public void setHz_5000_field_pureTone_left(JTextField hz_5000_field_pureTone_left) {
        this.hz_5000_field_pureTone_left = hz_5000_field_pureTone_left;
    }

    /**
     * Setter for the Left Ear Pure Tone at 7500hz
     * @param hz_7500_field_pureTone_left
     */
    public void setHz_7500_field_pureTone_left(JTextField hz_7500_field_pureTone_left) {
        this.hz_7500_field_pureTone_left = hz_7500_field_pureTone_left;
    }

    /**
     * Setter for the Left Ear Pure Tone at 10000hz
     * @param hz_10000_field_pureTone_left
     */
    public void setHz_10000_field_pureTone_left(JTextField hz_10000_field_pureTone_left) {
        this.hz_10000_field_pureTone_left = hz_10000_field_pureTone_left;
    }

    /**
     * Setter for the Left Ear Pure Tone at 12000hz
     * @param hz_12000_field_pureTone_left
     */
    public void setHz_12000_field_pureTone_left(JTextField hz_12000_field_pureTone_left) {
        this.hz_12000_field_pureTone_left = hz_12000_field_pureTone_left;
    }

    /**
     *  Getter for puretone on the left ear at 250Hz
     * @return hz_250_field_puretone_left
     */
    public JTextField getHz_250_field_pureTone_left() {
        return hz_250_field_pureTone_left;
    }
    /**
     *  Getter for puretone on the left ear at 500Hz
     * @return hz_500_field_puretone_left
     */
    public JTextField getHz_500_field_pureTone_left() {
        return hz_500_field_pureTone_left;
    }
    /**
     *  Getter for puretone on the left ear at 1000Hz
     * @return hz_1000_field_puretone_left
     */
    public JTextField getHz_1000_field_pureTone_left() {
        return hz_1000_field_pureTone_left;
    }
    /**
     *  Getter for puretone on the left ear at 2500Hz
     * @return hz_2500_field_puretone_left
     */
    public JTextField getHz_2500_field_pureTone_left() {
        return hz_2500_field_pureTone_left;
    }
    /**
     *  Getter for puretone on the left ear at 5000Hz
     * @return hz_5000_field_puretone_left
     */
    public JTextField getHz_5000_field_pureTone_left() {
        return hz_5000_field_pureTone_left;
    }
    /**
     *  Getter for puretone on the left ear at 7500Hz
     * @return hz_7500_field_puretone_left
     */
    public JTextField getHz_7500_field_pureTone_left() {
        return hz_7500_field_pureTone_left;
    }
    /**
     *  Getter for puretone on the left ear at 10,000Hz
     * @return hz_10000_field_puretone_left
     */
    public JTextField getHz_10000_field_pureTone_left() {
        return hz_10000_field_pureTone_left;
    }
    /**
     *  Getter for puretone on the left ear at 12,000Hz
     * @return hz_12000_field_puretone_left
     */
    public JTextField getHz_12000_field_pureTone_left() {
        return hz_12000_field_pureTone_left;
    }
    //PURE TONE ON THE RIGHT EAR AT HZ
    /**
     * Setter for the Right Ear Pure Tone at 250hz
     * @param hz_250_field_pureTone_right
     */
    public void setHz_250_field_pureTone_right(JTextField hz_250_field_pureTone_right) {
        this.hz_250_field_pureTone_right = hz_250_field_pureTone_right;
    }
    /**
     * Setter for the Right Ear Pure Tone at 500hz
     * @param hz_500_field_pureTone_right
     */
    public void setHz_500_field_pureTone_right(JTextField hz_500_field_pureTone_right) {
        this.hz_500_field_pureTone_right = hz_500_field_pureTone_right;
    }
    /**
     * Setter for the Right Ear Pure Tone at 1000hz
     * @param hz_1000_field_pureTone_right
     */
    public void setHz_1000_field_pureTone_right(JTextField hz_1000_field_pureTone_right) {
        this.hz_1000_field_pureTone_right = hz_1000_field_pureTone_right;
    }
    /**
     * Setter for the Right Ear Pure Tone at 2500hz
     * @param hz_2500_field_pureTone_right
     */
    public void setHz_2500_field_pureTone_right(JTextField hz_2500_field_pureTone_right) {
        this.hz_2500_field_pureTone_right = hz_2500_field_pureTone_right;
    }
    /**
     * Setter for the Right Ear Pure Tone at 5000hz
     * @param hz_5000_field_pureTone_right
     */
    public void setHz_5000_field_pureTone_right(JTextField hz_5000_field_pureTone_right) {
        this.hz_5000_field_pureTone_right = hz_5000_field_pureTone_right;
    }

    /**
     * Setter for the Right Ear Pure Tone at 7500hz
     * @param hz_7500_field_pureTone_right
     */
    public void setHz_7500_field_pureTone_right(JTextField hz_7500_field_pureTone_right) {
        this.hz_7500_field_pureTone_right = hz_7500_field_pureTone_right;
    }

    /**
     * Setter for the Right Ear Pure Tone at 10,000hz
     * @param hz_10000_field_pureTone_right
     */
    public void setHz_10000_field_pureTone_right(JTextField hz_10000_field_pureTone_right) {
        this.hz_10000_field_pureTone_right = hz_10000_field_pureTone_right;
    }

    /**
     * Setter for the Right Ear Pure Tone at 12,000hz
     * @param hz_12000_field_pureTone_right
     */
    public void setHz_12000_field_pureTone_right(JTextField hz_12000_field_pureTone_right) {
        this.hz_12000_field_pureTone_right = hz_12000_field_pureTone_right;
    }

    /**
     *  Getter for puretone on the right ear at 250Hz
     * @return hz_250_field_puretone_right
     */
    public JTextField getHz_250_field_pureTone_right() {
        return hz_250_field_pureTone_right;
    }
    /**
     *  Getter for puretone on the right ear at 500Hz
     * @return hz_500_field_puretone_right
     */
    public JTextField getHz_500_field_pureTone_right() {
        return hz_500_field_pureTone_right;
    }
    /**
     *  Getter for puretone on the right ear at 1000Hz
     * @return hz_1000_field_puretone_right
     */
    public JTextField getHz_1000_field_pureTone_right() {
        return hz_1000_field_pureTone_right;
    }
    /**
     *  Getter for puretone on the right ear at 2500Hz
     * @return hz_2500_field_puretone_right
     */
    public JTextField getHz_2500_field_pureTone_right() {
        return hz_2500_field_pureTone_right;
    }
    /**
     *  Getter for puretone on the right ear at 5000Hz
     * @return hz_5000_field_puretone_right
     */
    public JTextField getHz_5000_field_pureTone_right() {
        return hz_5000_field_pureTone_right;
    }
    /**
     *  Getter for puretone on the right ear at 7500Hz
     * @return hz_7500_field_puretone_right
     */
    public JTextField getHz_7500_field_pureTone_right() {
        return hz_7500_field_pureTone_right;
    }
    /**
     *  Getter for puretone on the right ear at 10,000Hz
     * @return hz_10000_field_puretone_right
     */
    public JTextField getHz_10000_field_pureTone_right() {
        return hz_10000_field_pureTone_right;
    }
    /**
     *  Getter for puretone on the right ear at 12,000Hz
     * @return hz_12000_field_puretone_right
     */
    public JTextField getHz_12000_field_pureTone_right() {
        return hz_12000_field_pureTone_right;
    }
    //LDL ON THE RIGHT EAR AT HZ

    /**
     * Setter for the Right LDL Tone at 250hz
     * @param hz_500_field_ldl_right
     */
    public void setHz_500_field_ldl_right(JTextField hz_500_field_ldl_right) {
        this.hz_500_field_ldl_right = hz_500_field_ldl_right;
    }
    /**
     * Setter for the Right LDL Tone at 1000hz
     * @param hz_1000_field_ldl_right
     */
    public void setHz_1000_field_ldl_right(JTextField hz_1000_field_ldl_right) {
        this.hz_1000_field_ldl_right = hz_1000_field_ldl_right;
    }
    /**
     * Setter for the Right LDL Tone at 2500hz
     * @param hz_2500_field_ldl_right
     */
    public void setHz_2500_field_ldl_right(JTextField hz_2500_field_ldl_right) {
        this.hz_2500_field_ldl_right = hz_2500_field_ldl_right;
    }
    /**
     * Setter for the Right LDL Tone at 5000hz
     * @param hz_5000_field_ldl_right
     */
    public void setHz_5000_field_ldl_right(JTextField hz_5000_field_ldl_right) {
        this.hz_5000_field_ldl_right = hz_5000_field_ldl_right;
    }
    /**
     * Setter for the Right LDL Tone at 7500hz
     * @param hz_7500_field_ldl_right
     */
    public void setHz_7500_field_ldl_right(JTextField hz_7500_field_ldl_right) {
        this.hz_7500_field_ldl_right = hz_7500_field_ldl_right;
    }
    /**
     * Setter for the Right LDL Tone at 10,000hz
     * @param hz_10000_field_ldl_right
     */
    public void setHz_10000_field_ldl_right(JTextField hz_10000_field_ldl_right) {
        this.hz_10000_field_ldl_right = hz_10000_field_ldl_right;
    }
    /**
     * Setter for the Right LDL Tone at 12,000hz
     * @param hz_12000_field_ldl_right
     */
    public void setHz_12000_field_ldl_right(JTextField hz_12000_field_ldl_right) {
        this.hz_12000_field_ldl_right = hz_12000_field_ldl_right;
    }

    /**
     *  Getter for ldl on the right ear at 500Hz
     * @return hz_500_field_ldl_right
     */
    public JTextField getHz_500_field_ldl_right() {
        return hz_500_field_ldl_right;
    }
    /**
     *  Getter for ldl on the right ear at 1000Hz
     * @return hz_1000_field_ldl_right
     */
    public JTextField getHz_1000_field_ldl_right() {
        return hz_1000_field_ldl_right;
    }
    /**
     *  Getter for ldl on the right ear at 2500Hz
     * @return hz_2500_field_ldl_right
     */
    public JTextField getHz_2500_field_ldl_right() {
        return hz_2500_field_ldl_right;
    }
    /**
     *  Getter for ldl on the right ear at 5000Hz
     * @return hz_5000_field_ldl_right
     */
    public JTextField getHz_5000_field_ldl_right() {
        return hz_5000_field_ldl_right;
    }
    /**
     *  Getter for ldl on the right ear at 7500Hz
     * @return hz_7500_field_ldl_left
     */
    public JTextField getHz_7500_field_ldl_right() {
        return hz_7500_field_ldl_right;
    }
    /**
     *  Getter for ldl on the right ear at 10,000Hz
     * @return hz_10000_field_ldl_right
     */
    public JTextField getHz_10000_field_ldl_right() {
        return hz_10000_field_ldl_right;
    }
    /**
     *  Getter for ldl on the right ear at 12000Hz
     * @return hz_12000_field_ldl_right
     */
    public JTextField getHz_12000_field_ldl_right() {
        return hz_12000_field_ldl_right;
    }
    //LDL ON THE LEFT EAR

    /**
     * Setter for the Left LDL Tone at 500hz
     * @param hz_500_field_ldl_left
     */
    public void setHz_500_field_ldl_left(JTextField hz_500_field_ldl_left) {
        this.hz_500_field_ldl_left = hz_500_field_ldl_left;
    }

    /**
     * Setter for the Left LDL Tone at 1000hz
     * @param hz_1000_field_ldl_left
     */
    public void setHz_1000_field_ldl_left(JTextField hz_1000_field_ldl_left) {
        this.hz_1000_field_ldl_left = hz_1000_field_ldl_left;
    }

    /**
     * Setter for the Left LDL Tone at 2500hz
     * @param hz_2500_field_ldl_left
     */
    public void setHz_2500_field_ldl_left(JTextField hz_2500_field_ldl_left) {
        this.hz_2500_field_ldl_left = hz_2500_field_ldl_left;
    }

    /**
     * Setter for the Left LDL Tone at 5000hz
     * @param hz_5000_field_ldl_left
     */
    public void setHz_5000_field_ldl_left(JTextField hz_5000_field_ldl_left) {
        this.hz_5000_field_ldl_left = hz_5000_field_ldl_left;
    }

    /**
     * Setter for the Left LDL Tone at 7500hz
     * @param hz_7500_field_ldl_left
     */
    public void setHz_7500_field_ldl_left(JTextField hz_7500_field_ldl_left) {
        this.hz_7500_field_ldl_left = hz_7500_field_ldl_left;
    }

    /**
     * Setter for the Left LDL Tone at 10,000hz
     * @param hz_10000_field_ldl_left
     */
    public void setHz_10000_field_ldl_left(JTextField hz_10000_field_ldl_left) {
        this.hz_10000_field_ldl_left = hz_10000_field_ldl_left;
    }

    /**
     * Setter for the Left LDL Tone at 12,000hz
     * @param hz_12000_field_ldl_left
     */
    public void setHz_12000_field_ldl_left(JTextField hz_12000_field_ldl_left) {
        this.hz_12000_field_ldl_left = hz_12000_field_ldl_left;
    }

    /**
     *  Getter for ldl on the left ear at 500Hz
     * @return hz_500_field_ldl_left
     */
    public JTextField getHz_500_field_ldl_left() {
        return hz_500_field_ldl_left;
    }
    /**
     *  Getter for ldl on the left ear at 1000Hz
     * @return hz_1000_field_ldl_left
     */
    public JTextField getHz_1000_field_ldl_left() {
        return hz_1000_field_ldl_left;
    }
    /**
     *  Getter for ldl on the left ear at 2500Hz
     * @return hz_2500_field_ldl_left
     */
    public JTextField getHz_2500_field_ldl_left() {
        return hz_2500_field_ldl_left;
    }
    /**
     *  Getter for ldl on the left ear at 5000Hz
     * @return hz_5000_field_ldl_left
     */
    public JTextField getHz_5000_field_ldl_left() {
        return hz_5000_field_ldl_left;
    }
    /**
     *  Getter for ldl on the left ear at 7500Hz
     * @return hz_7500_field_ldl_left
     */
    public JTextField getHz_7500_field_ldl_left() {
        return hz_7500_field_ldl_left;
    }
    /**
     *  Getter for ldl on the left ear at 10000Hz
     * @return hz_10000_field_ldl_left
     */
    public JTextField getHz_10000_field_ldl_left() {
        return hz_10000_field_ldl_left;
    }
    /**
     *  Getter for ldl on the left ear at 12000Hz
     * @return hz_12000_field_ldl_left
     */
    public JTextField getHz_12000_field_ldl_left() {
        return hz_12000_field_ldl_left;
    }

    /**
     * Setter for Match Type
     * @param matchType_field
     */
    public void setMatchType_field(JTextField matchType_field) {
        this.matchType_field = matchType_field;
    }

    /**
     * Setter for Pitch Match
     * @param pitchMatch_field
     */
    public void setPitchMatch_field(JTextField pitchMatch_field) {
        this.pitchMatch_field = pitchMatch_field;
    }

    /**
     * Setter for Right Ear Minimum Masking Level
     * @param minMaskRight_field
     */
    public void setMinMaskRight_field(JTextField minMaskRight_field) {
        this.minMaskRight_field = minMaskRight_field;
    }

    /**
     * Setter for Left Ear Minimum Masking Level
     * @param minMaskLeft_field
     */
    public void setMinMaskLeft_field(JTextField minMaskLeft_field) {
        this.minMaskLeft_field = minMaskLeft_field;
    }

    /**
     * Setter for Right Ear Threshold
     * @param thresholdRight_field
     */
    public void setThresholdRight_field(JTextField thresholdRight_field) {
        this.thresholdRight_field = thresholdRight_field;
    }

    /**
     * Setter for Left Ear Threshold
     * @param thresholdLeft_field
     */
    public void setThresholdLeft_field(JTextField thresholdLeft_field) {
        this.thresholdLeft_field = thresholdLeft_field;
    }

    /**
     * Getter for the right ear threshold
     * @return thresholdRight_field
     */
    public JTextField getThresholdRight_field() {
        return thresholdRight_field;
    }
    /**
     * Getter for the left ear threshold
     * @return thresholdLeft_field
     */
    public JTextField getThresholdLeft_field() {
        return thresholdLeft_field;
    }

    /**
     * Getter for the Pitch Match
     * @return pitchMatch_field
     */
    public JTextField getPitchMatch_field() {
        return pitchMatch_field;
    }

    /**
     * Getter for the Match Type
     * @return matchType_field
     */
    public JTextField getMatchType_field() {
        return matchType_field;
    }

    /**
     * Getter for Minimun Masking for the Left Ear
     * @return minMaskLeft_field
     */
    public JTextField getMinMaskLeft_field() {
        return minMaskLeft_field;
    }

    /**
     * Getter for the Minimun Masking for the Right Ear
     * @return minMaskRight_field
     */
    public JTextField getMinMaskRight_field() {
        return minMaskRight_field;
    }

    /**
     * Getter for the Additional Comments
     * @return additionalComments_area
     */
    public JTextArea getAdditionalComments_area() {
        return additionalComments_area;
    }

    /**
     * Removes the current stage of testing
     * Adds the next stage of testing
     * Starts at Stage 1
     * Stops at Stage 3
     --
    public void moveUpStage() {
        if (stage == 1) {
            this.remove(stageOne);
            this.add(stageTwo);
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
     --
    public void moveDownStage() {
        if (stage == 3) {
            this.remove(stageThree);
            this.add(stageTwo);
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
     */

    /**
     * Getter for stage
     *
     * @return stage
     */
    public int getStage() {
        return stage;
    }

    /**
     * Setter for stage
     *
     * @param stage - stage
     */
    public void setStage(int stage) {
        this.stage = stage;
    }

    /**
     * Getter for panel
     *
     * @return panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * Setter for panel
     *
     * @param panel - panel
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * Getter for leftEar
     *
     * @return leftEar
     */
    public JLabel getLeftEar() {
        return leftEar;
    }

    /**
     * Setter for leftEar
     *
     * @param leftEar - leftEar
     */
    public void setLeftEar(JLabel leftEar) {
        this.leftEar = leftEar;
    }

    /**
     * Getter for rightEar
     *
     * @return rightEar
     */
    public JLabel getRightEar() {
        return rightEar;
    }

    /**
     * Setter for rightEar
     *
     * @param rightEar - rightEar
     */
    public void setRightEar(JLabel rightEar) {
        this.rightEar = rightEar;
    }

    /**
     * Getter for frequency
     *
     * @return frequency
     */
    public JLabel getFrequency() {
        return frequency;
    }

    /**
     * Setter for frequency
     *
     * @param frequency - frequency
     */
    public void setFrequency(JLabel frequency) {
        this.frequency = frequency;
    }

    /**
     * Getter for hz_250
     *
     * @return hz_250
     */
    public JLabel getHz_250() {
        return hz_250;
    }

    /**
     * Setter for hz_250
     *
     * @param hz_250 - hz_250
     */
    public void setHz_250(JLabel hz_250) {
        this.hz_250 = hz_250;
    }

    /**
     * Getter for hz_500
     *
     * @return hz_500
     */
    public JLabel getHz_500() {
        return hz_500;
    }

    /**
     * Setter for hz_500
     *
     * @param hz_500 - hz_500
     */
    public void setHz_500(JLabel hz_500) {
        this.hz_500 = hz_500;
    }

    /**
     * Getter for hz_1000
     *
     * @return hz_1000
     */
    public JLabel getHz_1000() {
        return hz_1000;
    }

    /**
     * Setter for hz_1000
     *
     * @param hz_1000 - hz_1000
     */
    public void setHz_1000(JLabel hz_1000) {
        this.hz_1000 = hz_1000;
    }

    /**
     * Getter for hz_2500
     *
     * @return hz_2500
     */
    public JLabel getHz_2500() {
        return hz_2500;
    }

    /**
     * Setter for hz_2500
     *
     * @param hz_2500 - hz_2500
     */
    public void setHz_2500(JLabel hz_2500) {
        this.hz_2500 = hz_2500;
    }

    /**
     * Getter for hz_5000
     *
     * @return hz_5000
     */
    public JLabel getHz_5000() {
        return hz_5000;
    }

    /**
     * Setter for hz_5000
     *
     * @param hz_5000 - hz_5000
     */
    public void setHz_5000(JLabel hz_5000) {
        this.hz_5000 = hz_5000;
    }

    /**
     * Getter for hz_7500
     *
     * @return hz_7500
     */
    public JLabel getHz_7500() {
        return hz_7500;
    }

    /**
     * Setter for hz_7500
     *
     * @param hz_7500 - hz_7500
     */
    public void setHz_7500(JLabel hz_7500) {
        this.hz_7500 = hz_7500;
    }

    /**
     * Getter for hz_10000
     *
     * @return hz_10000
     */
    public JLabel getHz_10000() {
        return hz_10000;
    }

    /**
     * Setter for hz_10000
     *
     * @param hz_10000 - hz_10000
     */
    public void setHz_10000(JLabel hz_10000) {
        this.hz_10000 = hz_10000;
    }

    /**
     * Getter for hz_12000
     *
     * @return hz_12000
     */
    public JLabel getHz_12000() {
        return hz_12000;
    }

    /**
     * Setter for hz_12000
     *
     * @param hz_12000 - hz_12000
     */
    public void setHz_12000(JLabel hz_12000) {
        this.hz_12000 = hz_12000;
    }

    /**
     * Getter for pureToneLeft
     *
     * @return pureToneLeft
     */
    public JLabel getPureToneLeft() {
        return pureToneLeft;
    }

    /**
     * Setter for pureToneLeft
     *
     * @param pureToneLeft - pureToneLeft
     */
    public void setPureToneLeft(JLabel pureToneLeft) {
        this.pureToneLeft = pureToneLeft;
    }

    /**
     * Getter for pureToneRight
     *
     * @return pureToneRight
     */
    public JLabel getPureToneRight() {
        return pureToneRight;
    }

    /**
     * Setter for pureToneRight
     *
     * @param pureToneRight - pureToneRight
     */
    public void setPureToneRight(JLabel pureToneRight) {
        this.pureToneRight = pureToneRight;
    }

    /**
     * Getter for ldlLeft
     *
     * @return ldlLeft
     */
    public JLabel getLdlLeft() {
        return ldlLeft;
    }

    /**
     * Setter for ldlLeft
     *
     * @param ldlLeft - ldlLeft
     */
    public void setLdlLeft(JLabel ldlLeft) {
        this.ldlLeft = ldlLeft;
    }

    /**
     * Getter for ldlRight
     *
     * @return ldlRight
     */
    public JLabel getLdlRight() {
        return ldlRight;
    }

    /**
     * Setter for ldlRight
     *
     * @param ldlRight - ldlRight
     */
    public void setLdlRight(JLabel ldlRight) {
        this.ldlRight = ldlRight;
    }

    /**
     * Getter for pitchMatch
     *
     * @return pitchMatch
     */
    public JLabel getPitchMatch() {
        return pitchMatch;
    }

    /**
     * Setter for pitchMatch
     *
     * @param pitchMatch - pitchMatch
     */
    public void setPitchMatch(JLabel pitchMatch) {
        this.pitchMatch = pitchMatch;
    }

    /**
     * Getter for matchType
     *
     * @return matchType
     */
    public JLabel getMatchType() {
        return matchType;
    }

    /**
     * Setter for matchType
     *
     * @param matchType - matchType
     */
    public void setMatchType(JLabel matchType) {
        this.matchType = matchType;
    }

    /**
     * Getter for comments
     *
     * @return comments
     */
    public JLabel getComments() {
        return comments;
    }

    /**
     * Setter for comments
     *
     * @param comments - comments
     */
    public void setComments(JLabel comments) {
        this.comments = comments;
    }

    /**
     * Getter for stageOne
     *
     * @return stageOne
     */
    public JPanel getStageOne() {
        return stageOne;
    }

    /**
     * Setter for stageOne
     *
     * @param stageOne - stageOne
     */
    public void setStageOne(JPanel stageOne) {
        this.stageOne = stageOne;
    }

    /**
     * Getter for stageTwo
     *
     * @return stageTwo
     */
    public JPanel getStageTwo() {
        return stageTwo;
    }

    /**
     * Setter for stageTwo
     *
     * @param stageTwo - stageTwo
     */
    public void setStageTwo(JPanel stageTwo) {
        this.stageTwo = stageTwo;
    }

    /**
     * Getter for stageThree
     *
     * @return stageThree
     */
    public JPanel getStageThree() {
        return stageThree;
    }

    /**
     * Setter for stageThree
     *
     * @param stageThree - stageThree
     */
    public void setStageThree(JPanel stageThree) {
        this.stageThree = stageThree;
    }

    /**
     * Setter for additionalComments_area
     *
     * @param additionalComments_area - additionalComments_area
     */
    public void setAdditionalComments_area(JTextArea additionalComments_area) {
        this.additionalComments_area = additionalComments_area;
    }

    /**
     * Setter for saveButton
     *
     * @param saveButton - saveButton
     */
    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    /**
     * Getter for minMaskLeft
     *
     * @return minMaskLeft
     */
    public JLabel getMinMaskLeft() {
        return minMaskLeft;
    }

    /**
     * Setter for minMaskLeft
     *
     * @param minMaskLeft - minMaskLeft
     */
    public void setMinMaskLeft(JLabel minMaskLeft) {
        this.minMaskLeft = minMaskLeft;
    }

    /**
     * Getter for minMaskRight
     *
     * @return minMaskRight
     */
    public JLabel getMinMaskRight() {
        return minMaskRight;
    }

    /**
     * Setter for minMaskRight
     *
     * @param minMaskRight - minMaskRight
     */
    public void setMinMaskRight(JLabel minMaskRight) {
        this.minMaskRight = minMaskRight;
    }

    /**
     * Getter for thresholdLeft
     *
     * @return thresholdLeft
     */
    public JLabel getThresholdLeft() {
        return thresholdLeft;
    }

    /**
     * Setter for thresholdLeft
     *
     * @param thresholdLeft - thresholdLeft
     */
    public void setThresholdLeft(JLabel thresholdLeft) {
        this.thresholdLeft = thresholdLeft;
    }

    /**
     * Getter for thresholdRight
     *
     * @return thresholdRight
     */
    public JLabel getThresholdRight() {
        return thresholdRight;
    }

    /**
     * Setter for thresholdRight
     *
     * @param thresholdRight - thresholdRight
     */
    public void setThresholdRight(JLabel thresholdRight) {
        this.thresholdRight = thresholdRight;
    }

    /**
     * Getter for graphButton
     *
     * @return graphButton
     */
    public JButton getGraphButton() {
        return graphButton;
    }

    /**
     * Setter for graphButton
     *
     * @param graphButton - graphButton
     */
    public void setGraphButton(JButton graphButton) {
        this.graphButton = graphButton;
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
    private JPanel panel;

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
    private JLabel minMaskLeft;
    private JLabel minMaskRight;
    private JLabel thresholdLeft;
    private JLabel thresholdRight;
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
    private JTextArea additionalComments_area;


    //Jbuttons based on Audiogram evaluation wireframe
    private JButton saveButton;
    private JButton graphButton;



}