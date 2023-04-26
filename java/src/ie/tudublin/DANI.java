package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet
{
	String[] sonnet;

	float off = 0;

	public void loadFile()
	{}

	public String[] writeSonnet()
    {
        return null;
    }

	public void settings()
	{
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	public void setup()
	{
		colorMode(HSB);
	}

	public void keyPressed()
	{}

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
	}
}
