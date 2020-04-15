package edu.sjsu.cs.tinnitus.model;

import java.util.ArrayList;

/**
 * Perform audiological evaluation and register medical history including pharmacology.
 */
public class Audiology
{
    // Physician's discretionary comments regarding audiology.
    private ArrayList<String> comments;

    public Audiology()
    {
        comments = new ArrayList<>();
    }

    /**
     * Adds new comment to comments
     * @param comment String comment
     */
    public void addComment(String comment)
    {
        comments.add(comment);
    }

    /**
     * Returns all comments regarding audiology.
     */
    public ArrayList<String> getComments()
    {
        return comments;
    }

    /**
     * Pure-Tone audiogram test for left and right ear in all frequencies (from 0.25 kHz to 12 kHz).
     */
    public void puretoneAudiogramTest()
    {

    }

    /**
     * LDL (Loudness Discomfort Levels) test for left and right ear in frequencies (0.5 kHz to 12 kHz).
     */
    public void loudnessDiscomfortTest()
    {

    }

    /**
     * Tinnitus Pitch match test, and match type.
     */
    public void tinnitusPitchMatchTest()
    {

    }

    /**
     * Threshold of hearing test.
     */
    public void thresholdHearingTest()
    {

    }

    /**
     * Minimal masking levels for left and right ear.
     */
    public void minimalMaskingLevelTest()
    {

    }
}
