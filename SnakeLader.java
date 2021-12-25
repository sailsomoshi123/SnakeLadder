package snakeLadder;

public class SnakeLader {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;
	public static void main(String[] args){
		
		int position = 0;
		System.out.println("Starting position of player is: " + START);
		while (position < 100){
			int rollDie = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println("Number on rolled dice is : " +rollDie);
			int check = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("Condition: " +check);
			switch (check){
			 case NO_PLAY:
				 System.out.println("sorry you cant play");
                 System.out.println("New Position is: " + position);
                 break;
           case LADDER:
        	   System.out.println("you get a ladder");
        	   position = position + rollDie;
               if(position <= 100) 
            	   System.out.println("New Position is: " + position);
               else{
            	   position = position - rollDie;
            	   System.out.println("Remains at same position: " + position);
				}
                   break;
           case SNAKE:
        	   System.out.println("you get a snake");
        	   position = position - rollDie;
               if (position <= 100){
            	   if (position >= 0 ){
            		   System.out.println("New Position is: " + position);
            	   }
            	   else{
            		   position = 0;
            		   System.out.println("New Position is: " + position);
            	   }
				}
                else{
                	 System.out.println("New position is:" + position);
				}
                     break;
           default:
                 System.out.println("Default");
                 break;
        }
     }
     System.out.println();
     if (position == 100)
     System.out.println("*******************");
     System.out.println("    PLAYER WON");
     System.out.println("*******************");
     }
  }