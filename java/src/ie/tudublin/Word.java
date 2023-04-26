package ie.tudublin;

import java.util.ArrayList;

public class Word
{
    ArrayList<Follow> follow = new ArrayList<Follow>();

    String word;

    public Word(ArrayList follow, String word)
    {
        this.word = word;
    }

    public String toString()
    {
        return null;
    }

    public ArrayList<Follow> getFollow()
    {
        return follow;
    }

    public void setFollow(ArrayList<Follow> follow)
    {
        this.follow = follow;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }
}
