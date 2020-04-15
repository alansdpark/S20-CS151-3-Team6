package edu.sjsu.cs.tinnitus.model;

// Perform audiological evaluation and register medical history including pharmacology.
public class Audiology 
{
    private ArrayList<String> comments;

    public Audiology()
    {
        comments = new ArrayList<>();
    }
    
    public void addComment(String comment)
    {
        comments.add(comment);
    }

    public ArrayList<String> getComments()
    {
        return comments;
    }

    public void puretoneAudiogramTest()
    {

    }

    public void loudnessDiscomfortTest()
    {

    }

    public void tinnitusPitchMatchTest()
    {

    }

    public void thresholdHearingTest()
    {

    }

    public void minimalMaskingLevelTest()
    {

    }
}
