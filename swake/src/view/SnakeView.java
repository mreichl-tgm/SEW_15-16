package view;

/**
 * @author Markus Reichl
 * @version 22-10-15
 * 
 * Handles GUI of the Game while playing
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;

import constants.*;
import snake.*;

public class SnakeView extends JPanel {
	private static final long serialVersionUID = 1L;
	// Fixed images
	private Image corn = Imports.getCornImg();
	// Buffered
	private Point pb;
	// Models
	private SnakeList s;
	private Bird b;
	private Corn[] c;
	// Random
	Random r;
	// Labels
	private CounterLabel cl;
	
	public SnakeView(SnakeList s, Bird b, Corn[] c) {
		this.s = s;
		this.b = b;
		this.c = c;
		this.r = new Random();
		
		cl = new CounterLabel();
		this.add(cl);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Image head = Imports.getSnakeHeadImg()[s.r % 2];
		Image bird = Imports.getBirdImg()[b.r % 2];
		Image[][] body = Imports.getSnakeBodyImg();
		
		pb = b.pos[0];
		
		// Draws playerName
		cl.repaint();
		// Draws head
		boolean sh = g.drawImage(head, s.getFirst().x, s.getFirst().y, Finals.TILESIZE, Finals.TILESIZE, null);
		if (!sh) System.out.println("ERR -> Head failed initialization " + s.getFirst().toString());
		// Draws body
		for (int i = 1; i < s.size(); i++) {
			int x = i % body.length;
			boolean sb = g.drawImage(body[x][r.nextInt(2)], s.get(i).x, s.get(i).y, Finals.TILESIZE, Finals.TILESIZE , null);
			if (!sb) System.out.println("ERR -> Body-" + i + " failed initialization" + s.get(i).toString());
		}
		// Draws corn
		for (int i = 0; i < c.length; i++) {
			boolean cc = g.drawImage(corn, c[i].x, c[i].y, Finals.TILESIZE, Finals.TILESIZE, null);
			if (!cc) System.out.println("ERR -> Corn-" + i + " failed initialization" + c[i].toString());
		}
		// Draws bird
		boolean bb = g.drawImage(bird, pb.x, pb.y, Finals.TILESIZE * 2, Finals.TILESIZE * 2, null);
		if (!bb) System.out.println("ERR -> Bird failed initialization" + pb.toString());
	}
}