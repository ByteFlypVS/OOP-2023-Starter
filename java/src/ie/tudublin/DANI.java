package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet
{
	ArrayList<Follow> follow = new ArrayList<Follow>();

	String[] sonnet;

	float off = 0;

	public void loadFile()
	{
		loadStrings("small.txt");
	}

	public String[] writeSonnet()
    {
        return null;
    }

	public void keyPressed()
	{}

	public void settings()
	{
		fullScreen();
	}

	public void setup()
	{
		colorMode(HSB);
	}

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
	}
}
