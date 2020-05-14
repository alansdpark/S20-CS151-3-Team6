package edu.sjsu.cs.tinnitus.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Perform audiological evaluation and register medical history including pharmacology.
 */
public class Audiology implements Serializable
{
    public Audiology() {
        pureToneLeft = new double[8];
        pureToneRight = new double[8];
        ldlLeft = new double[7];
        ldlRight = new double[7];
        thresholdLeft  = 0;
        thresholdRight = 0;
        minMaskLeft = 0;
        minMaskRight = 0;
        pitchMatch = "";
        matchType = "";
        comments = "";
    }

    /**
     * Getter for double value of minMaskLeft
     * @return minMaskLeft
     */
    public double getMinMaskLeft() {
        return minMaskLeft;
    }
    /**
     * Getter for double value of minMaskRight
     * @return minMaskRight
     */
    public double getMinMaskRight() {
        return minMaskRight;
    }
    /**
     * Getter for double value of thresholdLeft
     * @return thresholdLeft
     */
    public double getThresholdLeft() {
        return thresholdLeft;
    }
    /**
     * Getter for double value of thresholdRight
     * @return thresholdRight
     */
    public double getThresholdRight() {
        return thresholdRight;
    }
    /**
     * Getter for double array of ldlLeft values
     * @return ldlLeft
     */
    public double[] getLdlLeft() {
        return ldlLeft;
    }
    /**
     * Getter for double array of ldlRight values
     * @return ldlRight
     */
    public double[] getLdlRight() {
        return ldlRight;
    }
    /**
     * Getter for double array of pureToneLeft values
     * @return pureToneLeft
     */
    public double[] getPureToneLeft() {
        return pureToneLeft;
    }
    /**
     * Getter for double array of pureToneRight values
     * @return pureToneRight
     */
    public double[] getPureToneRight() {
        return pureToneRight;
    }

    public String getMatchType() {
        return matchType;
    }

    public String getComments() {
        return comments;
    }

    public String getPitchMatch() {
        return pitchMatch;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public void setPitchMatch(String pitchMatch) {
        this.pitchMatch = pitchMatch;
    }

    public void setMinMaskRight(double minMaskRight) {
        this.minMaskRight = minMaskRight;
    }

    public void setMinMaskLeft(double minMaskLeft) {
        this.minMaskLeft = minMaskLeft;
    }

    public void setThresholdRight(double thresholdRight) {
        this.thresholdRight = thresholdRight;
    }

    public void setThresholdLeft(double thresholdLeft) {
        this.thresholdLeft = thresholdLeft;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setLdlLeft(double[] ldlLeft) {
        this.ldlLeft = ldlLeft;
    }

    public void setLdlRight(double[] ldlRight) {
        this.ldlRight = ldlRight;
    }

    public void setPureToneLeft(double[] pureToneLeft) {
        this.pureToneLeft = pureToneLeft;
    }

    public void setPureToneRight(double[] pureToneRight) {
        this.pureToneRight = pureToneRight;
    }

    private double[] pureToneLeft; // 250, 500, 1000, 2500, 5000, 7500, 10000, 12000
    private double[] pureToneRight;// 250, 500, 1000, 2500, 5000, 7500, 10000, 12000
    private double[] ldlLeft; // 500, 1000, 2500, 5000, 7500, 10000, 12000
    private double[] ldlRight; // 500, 1000, 2500, 5000, 7500, 10000, 12000
    private double thresholdLeft;
    private double thresholdRight;
    private double minMaskLeft;
    private double minMaskRight;
    private String pitchMatch;
    private String matchType;
    private String comments;
}
