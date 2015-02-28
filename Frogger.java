package Frogger;

import java.util.ArrayList;

import zen.core.Zen;

public class Frogger {

	public static void main(String[] args) {
		setup();
		Frog f = new Frog();
		ArrayList<Truck> trucks = new ArrayList<Truck>();
		
		for (int i = 0; i < 3; i++)
		{
			trucks.add(new Truck());
		}
		
		while (true)
		{
			drawBackground();
			f.draw();
			f.move();
			for (int i = 0; i < trucks.size(); i++)
			{
				trucks.get(i).draw();
				trucks.get(i).move();
			}
			
			Zen.buffer(33);
		}
	}
	private static void drawBackground() 
	{
		Zen.setBackground("light green");
		Zen.setColor("gray");
		Zen.fillRect(0, 300, 500, 150);
		Zen.fillRect(0, 50, 500, 150);
		
	}
	public static void setup()
	{
		Zen.create(500, 500);
		Zen.setBackground("blue");
	}

}
