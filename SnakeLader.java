package snakeLadder;

public class SnakeLader {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;
	public static void main(String[] args) {
		System.out.println("Welcome to snake ladder game");
		int start = 0;
		System.out.println("Starting position of player is: " + start);
		int rollDie = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println(rollDie);
		int pos = 0;
		System.out.println("Number on rolled dice is : " +rollDie);
		int check = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Condition: " +check);
	switch (check){
	case NO_PLAY:
		System.out.println("New Position is: " + pos);
	break;
	case LADDER:
		System.out.println("you get LADDER");
        pos = pos + rollDie;
        System.out.println("New Position is: " + pos);
        break;
	case SNAKE:
		System.out.println("you got snake");
        pos = pos - rollDie;
        if ( pos >= 0)
        	 System.out.println("New Position is: " + pos);
		else
			 pos = 0;
		     System.out.println("New Position is: " + pos);
	break;
	default:
		System.out.println("Default");
		break;
	}
  }
}