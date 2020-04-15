package controller;

/**
 * Controller for Audiology.
 */
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

    /**
     * New Controller should be created for every test.
     */
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

    /**
     * Performs test of selected stage. This is so the complete audiology test is modular (Patient will not have to retake entire exam to test in certain area).
     */
    public void performTest(int stage)
    {
        switch (stage) {
            // Pure-Tone audiogram
            case 1:
                break;
            // LDL (Loudness Discomfort Levels)
            case 2:
                break;
            // Tinnitus pitch match/type
            case 3:
                break;
            // Thresholds of hearing
            case 4:
                break;
            // Minimal masking levels for left and right ear.
            case 5:
                break;
            // DEFAULT - Should not be here.
            default:
                System.out.println("performTest() malfunctioned.");
        }
    }
}