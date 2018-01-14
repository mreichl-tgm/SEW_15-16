package conditions;

import java.awt.Point;

import snake.*;

public class KornDa implements Condition {
	private SnakeList s;
	private Corn[] c;
	
	public KornDa(SnakeList s, Corn[] c) {
		this.s = s;
		this.c = c;
	}
	
	@Override
	public boolean check() {
		Point p = s.getFirst();
		
		for (int i = 0; i < c.length; i++) {
			if (c[i].equals(p)) {
				c[i] = new Corn();
				return true;
			}
		}
		
		return false;
	}
	
}
