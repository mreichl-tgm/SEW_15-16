package snake;

import java.awt.Point;
import java.util.LinkedList;

import constants.Finals;

public class SnakeList extends LinkedList<Point> {
	
	public int r;
	
	public SnakeList() {
		this.addFirst(new Point(0, 0));
	}
	
	public boolean addTile() {
		Point p = new Point(getLast().x, getLast().y);
		if (r == 0) p.y += Finals.TILESIZE;
		else if (r == 1) p.x -= Finals.TILESIZE;
		else if (r == 2) p.y -= Finals.TILESIZE;
		else if (r == 3) p.x += Finals.TILESIZE;
		
		addLast(p);
		vor();
		return true;
	}
	
	public Point getHead() {
		return this.getFirst();
	}

	public void vor() {
		Point p = (Point) getHead().clone();
		
		if (r == 0) p.y -= Finals.TILESIZE;
		else if (r == 1) p.x += Finals.TILESIZE;
		else if (r == 2) p.y += Finals.TILESIZE;
		else p.x -= Finals.TILESIZE;
		
		this.addFirst(p);
		this.removeLast();
	}
	
	public void linksUm() {
		this.r -= 1;
	}
	
	public void rechtsUm() {
		linksUm();
		linksUm();
		linksUm();
	}
	
	public String toString() {
		String s = "";
		s += this.getHead().toString() + " [" + this.r + "] \n";
		s += ">> ";
		for (Point p : this) s += p.toString();
		return s;
	}
}