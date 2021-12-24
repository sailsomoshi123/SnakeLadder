package snakeLadder;

public class SnakeLader {
	public static void main(String[] args) {
		System.out.println("Welcome to snake ladder game");
		int start = 0;
		System.out.println("Starting position of player is: " + start);
		int rollDie = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println(rollDie);
	}
}
