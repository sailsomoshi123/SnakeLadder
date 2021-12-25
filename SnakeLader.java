package snakeLadder;

public class SnakeLader {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START = 0;
	public static void main(String[] args){
		int position = 0, position1 = 0, cntr1 = 0, cntr2 = 0, cntr3 = 0, cntr4 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
		System.out.println("Starting position of player is: " + START);
		while(position < 100 && position1 < 100){
			int check = 1;
a:		while(check == 1){
			System.out.println("PLAYER 1");
			int rollDie = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			cntr1++;
			System.out.println("Number on rolled dice is : " +rollDie);
			check = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("Condition: " +check);
			switch (check){
            case NO_PLAY:
            	System.out.println("you not pay");
            	System.out.println("NO PLAY");
                System.out.println("New Position is: " + position);
                cntr4++;
                 break;
            case LADDER:
            	System.out.println("you got ladder");
            	System.out.println("Got LADDER");
            	position = position + rollDie;
                if(position <= 100)
                	System.out.println("New Position is: " + position);
                else{
                	position = position - rollDie;
                	System.out.println("Remains at same position: " + position);
				}
                	cntr2++;
	continue a;
            case SNAKE:
            	System.out.println("Got SNAKE");
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
                	cntr3++;
                	break;
            default:
            	System.out.println("Default");
                break;
         }
	}
		int con1 = 1;
b:		while(con1 == 1 && position1 < 100){
		System.out.println("PLAYER 2");
		int roll1 = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		c1++;
		System.out.println("Number on rolled dice is : " +roll1);
		con1 = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Condition: " +con1);
		switch (con1){
            case NO_PLAY:
            	System.out.println("NO PLAY");
                System.out.println("New Position is: " + position1);
                c4++;
                break;
            case LADDER:
            	System.out.println("Got LADDER");
                position1 = position1 + roll1;
                if(position1 <= 100)
                	System.out.println("New Position is: " + position1);
                else{
                	position1 = position1 - roll1;
                	System.out.println("Remains at same position: " + position1);
                }
                c2++;
               continue b;
            	case SNAKE:
            		System.out.println("Got SNAKE");
            		position1 = position1 - roll1;
            		if (position1 <= 100){
            			if (position1 >= 0 ){
            				System.out.println("New Position is: " + position1);
            			}
            			else{
            				position1 = 0;
            				System.out.println("New Position is: " + position1);
            			}
            		}
            		else{
            			System.out.println("New position is:" + position1);
            		}
            		c3++;
            		break;
            	default:
            		System.out.println("Default");
            		break;
			}
		}
	}

      System.out.println();
		System.out.println("-------------------");
      if (position == 100){
    	  System.out.println("Player1 ROLLED DICE "+ cntr1 +" time and got SNAKE "+ cntr3 +
    		  " times and got LADDER "+ cntr2 +" times and got NO PLAY "+ cntr4 +" times to win the game");
    	  System.out.println("    PLAYER1 WON");
      }
      else{
    	  System.out.println("Player2 ROLLED DICE "+ c1 +" time and got SNAKE "+ c3 +
    		  " times and got LADDER "+ c2 +" times and got NO PLAY "+c4+" times to win the game");
    	  System.out.println("    PLAYER2 WON");
      }
	}
}