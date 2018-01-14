package conditions;

import java.awt.Point;

import constants.Finals;
import snake.SnakeList;

public class MauerDa implements Condition {
	SnakeList snake;
	
	public MauerDa(SnakeList snake) {
		this.snake = snake;
	}
	
	public boolean check() {
		Point head = snake.getHead();
		
		if (head.x > Finals.W_WIDTH) snake.getHead().x = 0;
		else if (head.x < 0) snake.getHead().x = Finals.W_WIDTH;
		else if (head.y > Finals.W_HEIGHT) snake.getHead().y = 0;
		else if (head.y < 0) snake.getHead().y = Finals.W_HEIGHT;
		else return false;
		
		return true;
	}
	
}
