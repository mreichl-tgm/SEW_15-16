package snake;

import constants.Finals;
import java.awt.Point;

public class Bird {
	
	private SnakeList target;
	private boolean skip;
	
	public Point[] pos;
	public int r;
	
	public Bird(SnakeList target) {
		this.target = target;
		
		pos = new Point[4];
		skip = true;
		r = 3;
		
		pos[0] = new Point(Finals.W_WIDTH - Finals.TILESIZE, Finals.W_HEIGHT - Finals.TILESIZE);
		update();
	}
	
	public void update() {
		Point head = target.getHead();
		
		if (skip) {
			skip = false;
			return;
		}
		
		if (head.x != pos[0].x) {
			if (head.x > pos[0].x) r = 1;
			else r = 3;
		}
		
		if (head.y != pos[0].y) {
			if (head.y > pos[0].y) r = 2;
			else r = 0;
		}
		
		if (r == 0) pos[0].y -= Finals.TILESIZE;
		else if (r == 1) pos[0].x += Finals.TILESIZE;
		else if (r == 2) pos[0].y += Finals.TILESIZE;
		else pos[0].x -= Finals.TILESIZE;
		
		for (int i = 1; i < pos.length; i++) pos[i] = (Point) pos[0].clone();
		
		pos[1].y += Finals.TILESIZE;
		pos[2].x += Finals.TILESIZE;
		pos[3].y += Finals.TILESIZE;
		pos[3].x += Finals.TILESIZE;
		
		skip = true;
	}
	
}