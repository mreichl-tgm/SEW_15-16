package conditions;

import snake.SnakeList;

public class Suicide implements Condition {
	private SnakeList snake;
	
	public Suicide(SnakeList snake) {
		this.snake = snake;
	}
	
	@Override
	public boolean check() {
		for (int i = 0; i < snake.size(); i++) {
			for (int j = 0; j < snake.size(); j++) {
				if (j == i) continue;
				else if (snake.get(i).equals(snake.get(j))) return true;
			}
		}
					
		return false;
	}

}
