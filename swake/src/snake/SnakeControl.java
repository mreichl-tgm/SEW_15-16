package snake;

/**
 * @author Markus Reichl
 * @version 22-10-15
 * 
 * Handles Snake movement including KeyListener
 * Logs our game
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import conditions.*;

/**
 * 
 * @author Re1
 * @version 02feb15
 */

public class SnakeControl implements KeyListener {
	
	private ConditionListener cl;
	private SnakeList snake;
	
	public SnakeControl(SnakeList snake, Bird bird, Corn[] corns) {
		this.snake = snake;
		// Makes our snake grow
		snake.addTile();
		snake.addTile();
		snake.addTile();
		
		cl = new ConditionListener(snake, bird, corns);
	}
	
	/**
	 * Overriding keyPresserd to change rotation on key press
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) snake.r = 0;
		if (e.getKeyCode() == KeyEvent.VK_D) snake.r = 1;
		if (e.getKeyCode() == KeyEvent.VK_S) snake.r = 2;
		if (e.getKeyCode() == KeyEvent.VK_A) snake.r = 3;
	}
	/**
	 * GENERATED
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// GENERATED
	}
	/**
	 * GENERATED
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// GENERATED
	}

	public String GameOver() {
		if(cl.get(ConditionList.CAUGHT).check()) return "caught";
		if(cl.get(ConditionList.SUICIDE).check()) return "suicide";
		return "";
	}
	
	public String MauerDa() {
		if (cl.get(ConditionList.MAUER_DA).check()) return "teleported";
		return "";
	}

	public String kornDa() {
		if (cl.get(ConditionList.KORN_DA).check()) return "corn found!";
		return "";
	}
}