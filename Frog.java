package Frogger;

import zen.core.Zen;

public class Frog {
	static int x = 250;
	static int y = 450;
	boolean isPressedHorizontal, isPressedVertical;
	
	public void draw()
	{
		Zen.setColor("green");
		Zen.fillOval(x, y, 25, 25);
	}
	public void move()
	{
		if (Zen.isKeyPressed("right") && isPressedHorizontal == false)
		{
			x = x + 25;
			isPressedHorizontal = true;
		}
		if (Zen.isKeyPressed("left") && isPressedHorizontal == false)
		{
			x = x - 25;
			isPressedHorizontal = true;
		}
		if (Zen.isKeyPressed("down") && isPressedVertical == false)
		{
			y = y + 25;
			isPressedVertical = true;
		}
		if (Zen.isKeyPressed("up") && isPressedVertical == false)
		{
			y = y - 25;
			isPressedVertical = true;
		}

		if (! Zen.isKeyPressed("up") && ! Zen.isKeyPressed("down")) {
			isPressedVertical = false;
		}
		if (! Zen.isKeyPressed("left") && ! Zen.isKeyPressed("right")) {
			isPressedHorizontal = false;
		}
		if (x > 475)
		{
			x = 475;
		}
		if (x < 0)
		{
			x = 0;
		}
		if (y > 475)
		{
			y = 475;
		}
		if (y < 50)
		{
			y = 450;
		}
		
	}
}
