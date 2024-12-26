package rockpaperscissors;

import java.util.Random;

public class RockPaperScissors {
	private Object[] objects = { new Rock(), new Paper(), new Scissors() };

	public void run() {
		System.out.println("Game Running");

		Random random = new Random();
		var obj = objects[random.nextInt(objects.length)];

		System.out.println(obj);
	}
}
