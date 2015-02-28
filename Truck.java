package Frogger;

import zen.core.Zen;

public class Truck {
	static int x = 0;
	static int y = Zen.getRandomNumber(2,17)*25;
	static int speed = Zen.getRandomNumber(1, 7);;
	
	public void draw()
	{
		Zen.setColor("yellow");
		Zen.fillRect(x, y, 50, 25);
		Zen.setColor("red");
		Zen.fillRect(x + 45, y + 6, 10, 12);
	}
	public void move()
	{
		x = x + speed;
		if (x > 450)
		{
			x = 0;
		}
	}
}
