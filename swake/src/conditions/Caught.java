package conditions;

import java.awt.Point;

import snake.Bird;
import snake.SnakeList;

public class Caught implements GameOver {
	private SnakeList snake;
	private Bird bird;
	
	public Caught(SnakeList snake, Bird bird) {
		this.snake = snake;
		this.bird = bird;
	}
	
	public boolean check() {
		for (Point p : bird.pos) {
			if (snake.contains(p)) return true;
		}
		
		return false;
	}
}
