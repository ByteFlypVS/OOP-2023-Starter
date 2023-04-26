package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class DANI extends PApplet
{
	ArrayList<Follow> follow = new ArrayList<Follow>();

	String[] sonnet;
	String line;

	float off = 0;

	int count = 0;

	public void loadFile()
	{
		sonnet = loadStrings("small.txt");

		for(int i = 0; i < sonnet.length; i++)
		{
			line = sonnet[i];

			for(int j = 0; j < line.length(); j++)
			{
				split(line, ' ');
			}
		}
	}

	public void printModel()
	{
		for(Follow f : follow)
		{
			println(f);
		}
	}

	public String findFollow()
	{
		return null;
	}

	public String findWord()
	{
		return null;
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

		loadFile();
		//printModel();
	}

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);

		writeSonnet();
	}
}
