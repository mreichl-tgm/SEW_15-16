package constants;

public class Variables {
	
	public static String character = "moneyboy";
	public static String playerName = "unnamed";
	public static int frameCount;
	public static int highScore;
	public static int swag;

	public static void init() {
		frameCount = 0;
		highScore = 0;
		swag = 0;
	}
	
	public static void setCharacter(String s) {
		character = s;
	}
	
}