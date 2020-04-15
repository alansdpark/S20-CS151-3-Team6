package controller;

public class AudiologyController 
{
    /**
     * Stage of audiological exam.
     * 
     * 1 = pure-tone audiogram
     * 2 = loudness discomfort levels
     * 3 = tinnitus pitch match and match type
     * 4 = thresholds of hearing
     * 5 = minimal masking levels for left and right ear.
     */
    private int stage; 

    public AudiologyController()
    {
        stage = 1;
    }

    /**
     * Moves to next stage of audiological exam.
     */
    public void nextStage()
    {
        stage++;
    }
}