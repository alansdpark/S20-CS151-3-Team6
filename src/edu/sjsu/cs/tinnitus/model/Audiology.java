package edu.sjsu.cs.tinnitus.model;

import java.util.ArrayList;

// Perform audiological evaluation and register medical history including pharmacology.
public class Audiology 
{
    /**
     * Default constructor for Audiology
     */
    public Audiology()
    {
        comments = "";
        hz_pureTone_left = new int[8];
        hz_pureTone_right = new int[8];
        hz_ldl_left = new int[7];
        hz_ldl_left = new int[7];
    }

    /**
     * Constructor for Audiology with given parameters
     * @param comments
     * @param hz_ldl_left
     * @param hz_ldl_right
     * @param hz_pureTone_left
     * @param hz_pureTone_right
     */
    public Audiology(String comments, int[] hz_ldl_left, int[] hz_ldl_right, int[] hz_pureTone_left, int[] hz_pureTone_right)
    {
        this.comments = comments;
        this.hz_pureTone_left = hz_pureTone_left;
        this.hz_pureTone_right = hz_pureTone_right;
        this.hz_ldl_left = hz_ldl_left;
        this.hz_ldl_right = hz_ldl_right;
    }

    /**
     * Setter for comments
     * @param String comments
     */
    public void setComments(String comments)
    {
        this.comments = comments;
    }

    /**
     * Getter for Comments
     * @return String comments
     */
    public String getComment() {
        return comments
    }

    /**
     * Setter for the pure tone audiogram for the left ear
     * @param hz_pureTone_left
     */
    public void setHz_pureTone_left(int[] hz_pureTone_left) {
        this.hz_pureTone_left = hz_pureTone_left;
    }
    /**
     * Setter for the pure tone audiogram for the right ear
     * @param hz_pureTone_right
     */
    public void setHz_pureTone_right(int[] hz_pureTone_right) {
        this.hz_pureTone_right = hz_pureTone_right;
    }
    /**
     * Setter for the ldl audiogram for the left ear
     * @param hz_ldl_left
     */
    public void setHz_ldl_left(int[] hz_ldl_left) {
        this.hz_ldl_left = hz_ldl_left;
    }
    /**
     * Setter for the right audiogram for the left ear
     * @param hz_ldl_right
     */
    public void setHz_ldl_right(int[] hz_ldl_right) {
        this.hz_ldl_right = hz_ldl_right;
    }

    /**
     * Getter for pure tone audiogram for the left ear
     * @return hz_pureTone_left
     */
    public int[] getHz_pureTone_left() {
        return hz_pureTone_left;
    }
    /**
     * Getter for pure tone audiogram for the right ear
     * @return hz_pureTone_right
     */
    public int[] getHz_pureTone_right() {
        return hz_pureTone_right;
    }
    /**
     * Getter for ldl audiogram for the left ear
     * @return hz_ldl_left
     */
    public int[] getHz_ldl_left() {
        return hz_ldl_left;
    }
    /**
     * Getter for ldl audiogram for the right ear
     * @return hz_ldl_right
     */
    public int[] getHz_ldl_right() {
        return hz_ldl_right;
    }

    /**
     * Setter for left ear threshold
     * @param thresholdLeft
     */
    public void setThresholdLeft(int thresholdLeft) {
        this.thresholdLeft = thresholdLeft;
    }

    /**
     * Getter for left ear thershold
     * @return thresholdLeft
     */
    public int getThresholdLeft() {
        return thresholdLeft;
    }
    /**
     * Setter for right ear threshold
     * @param thresholdRight
     */
    public void setThresholdRight(int thresholdRight) {
        this.thresholdRight = thresholdRight;
    }
    /**
     * Getter for right ear thershold
     * @return thresholdRight
     */
    public int getThresholdRight() {
        return thresholdRight;
    }

    /**
     * Setter for minimum masking level for left ear
     * @param minMaskLeft
     */
    public void setMinMaskLeft(int minMaskLeft) {
        this.minMaskLeft = minMaskLeft;
    }

    /**
     * Getter for minimum masking level for left eat
     * @return minMaskLeft
     */
    public int getMinMaskLeft() {
        return minMaskLeft;
    }
    /**
     * Setter for minimum masking level for right ear
     * @param minMaskRight
     */
    public void setMinMaskRight(int minMaskRight) {
        this.minMaskRight = minMaskRight;
    }
    /**
     * Getter for minimum masking level for right eat
     * @return minMaskRight
     */
    public int getMinMaskRight() {
        return minMaskRight;
    }

    /**
     * Setter for pitch match
     * @param pitchMatch
     */
    public void setPitchMatch(int pitchMatch) {
        this.pitchMatch = pitchMatch;
    }

    /**
     * Getter for pitch match
     * @return pitchMatch
     */
    public int getPitchMatch() {
        return pitchMatch;
    }

    /**
     * Setter for pitch match
     * @param matchType
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * Getter Match Type
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    // Array follows order 250Hz, 500hz, 1000Hz, 2500Hz, 5000Hz, 10000Hz, and 12000Hz
    private int[] hz_pureTone_left;
    private int[] hz_pureTone_right;
    // Array follows order 500hz, 1000Hz, 2500Hz, 5000Hz, 10000Hz, and 12000Hz
    private int[] hz_ldl_left;
    private int[] hz_ldl_right;
    private String comments;
    //Thresholds
    private int thresholdLeft;
    private int thresholdRight;
    //minimum masking level
    private int minMaskLeft;
    private int minMaskRight;
    //pitch match and match type
    private int pitchMatch;
    private String matchType;
}
