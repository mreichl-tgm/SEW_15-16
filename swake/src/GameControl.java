import snake.SnakeControl;
import constants.Imports;
import constants.Variables;
import snake.*;
import view.GameView;

public class GameControl {
	
	private GameView gv;
	private SnakeControl sc;
	
	private SnakeList snake;
	private Bird bird;
	private Corn[] corns;
	
	private boolean run;
	
	public GameControl() {
		Imports.init();
		Variables.init();
		
		snake = new SnakeList();
		bird = new Bird(snake);
		corns = new Corn[2];
		
		for (int i = 0; i < corns.length; i++) corns[i] = new Corn();
		
		gv = new GameView(snake, bird, corns);
		sc = new SnakeControl(snake, bird, corns);
		run = true;
		
		gv.addKeyListener(sc);
		
		while (run) update();
	}
	/**
	 * Updates our frame and gives Feedback
	 */
	private void update() {
		Variables.highScore += snake.size();
		snake.vor();
		
		if (sc.GameOver() != "") {
			System.out.println("INF -> Died at " + Variables.highScore + " due to " + sc.GameOver() + "...");
			run = false;
			gv.dispose();
			return;
		}
		
		if (sc.kornDa() != "") {
			System.out.println("INF -> Got some Cash!");
			Variables.highScore += 1000;
			snake.addTile();
		}
		
		if (sc.MauerDa() != "") {
			System.out.println("INF -> Teleport Actions!!");
		}
		
		bird.update();
		gv.repaint();
		// Adds delay to update
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}