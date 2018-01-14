package constants;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Imports {
	
	private static Image[] birdImg = new Image[4];
	private static Image[] snakeHeadImg = new Image[2];
	private static Image[][] snakeBodyImg = new Image[5][2];
	private static Image cornImg;
	private static Image derBoy;
	
	public static void init() {
		try {
			// bird
	    	birdImg[0] = ImageIO.read(new File(Variables.character + "/bird_0.png"));
	    	birdImg[1] = ImageIO.read(new File(Variables.character + "/bird_1.png"));
	    	// Snake
	    	snakeHeadImg[0] = ImageIO.read(new File(Variables.character + "/head_0.png"));
	    	snakeHeadImg[1] = ImageIO.read(new File(Variables.character + "/head_1.png"));
	    	
	    	for (int i = 0; i < snakeBodyImg.length; i++) {
	    		for (int j = 0; j < snakeBodyImg[i].length; j++) {
	    			System.out.println(Variables.character + "/" + i + "_" + j + ".png loading...");
	    			snakeBodyImg[i][j] = ImageIO.read(new File(Variables.character + "/" + i + "_" + j + ".png"));
	    		}
	    	}

	    	cornImg = ImageIO.read(new File(Variables.character + "/corn.png"));
		} catch (IOException e) {
	        System.out.println("ERR: Image " + e.getCause() + " not found");
	        System.exit(0);
		}
		// Debug
		System.out.println();
	}
	
	public static Image[] getBirdImg() { return birdImg; }
	public static Image[] getSnakeHeadImg() { return snakeHeadImg; }
	public static Image[][] getSnakeBodyImg() { return snakeBodyImg; }
	public static Image getCornImg() { return cornImg; }
	public static Image getBoyImg() { return derBoy; }
}
