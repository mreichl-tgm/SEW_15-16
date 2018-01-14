package snake;

import java.awt.Point;
import java.util.Random;

import constants.Finals;

public class Corn extends Point {
	
	private static final long serialVersionUID = 1L;

	public Corn() {
		Random r = new Random();
		int r1;
		int r2;

		do r1 = r.nextInt(Finals.W_WIDTH - Finals.TILESIZE * 3);
		while (r1 % Finals.TILESIZE != 0);
		
		do r2 = r.nextInt(Finals.W_HEIGHT - Finals.TILESIZE * 3);
		while (r2 % Finals.TILESIZE != 0);
		
		this.x = r1;
		this.y = r2;
	}
	
}