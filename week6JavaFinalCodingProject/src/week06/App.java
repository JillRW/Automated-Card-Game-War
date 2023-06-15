package week06;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Alice");
		Player player2 = new Player("Carol");
		deck.shuffle();
		
		
		
		for(int i = 0; i < 52; i ++) { 
			if( i % 2 == 0) {
				player1.draw(deck);
		}else {
			player2.draw(deck);
		}
			
		}
		
		System.out.println();
		System.out.println("--------------START--------------");
		System.out.println();
	
		for(int i = 0; i < 26; i ++) {
			Card player1Card = player1.flip();
			System.out.print("(Player 1) card: " );
			player1Card.describe();
			
			
			
			Card player2Card = player2.flip();
			System.out.print("(Player 2) card: ");
			player2Card.describe();
			
			
			
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				
				
				System.out.println();
				System.out.println(">PLAYER 1< wins this round!");
				System.out.println("(Player 1) score: " + player1.getScore() + "     (Player 2) score: " + player2.getScore());
				
				
				System.out.println();
			}else if(player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				
				
				System.out.println();
				System.out.println(">PLAYER 2< wins this round!");
				System.out.println("(Player 1) score: " + player1.getScore() + "     (Player 2) score: " + player2.getScore());
				System.out.println();
				
				
		}else {
			System.out.println();
			System.out.println("--------------------DRAW--------------------");
			System.out.println("(Player 1) score: " + player1.getScore() + "        (Player 2 score: " + player2.getScore());
			System.out.println();
		}
			
			 
			 }
			 
			if( player1.getScore() > player2.getScore()) { 
				System.out.println();
				
				System.out.println( "****FINAL SCORES****");
				System.out.println("(Player 1) Score: " + player1.getScore()); 
				System.out.println("(Player 2) Score: " + player2.getScore());
				System.out.println();
				System.out.println("****PLAYER 1 WINS****");
			}else if(player2.getScore() > player1.getScore()) {
				System.out.println("****FINAL SCORES****");
				System.out.println("(Player 1) Score: " + player1.getScore()); 
				System.out.println("(Player 2) Score: " + player2.getScore());
				System.out.println();
				System.out.println("****PLAYER 2 WINS****");
			}else {
				System.out.println("****FINAL SCORES****");
				System.out.println("(Player 1) Score: " + player1.getScore());
				System.out.println("(Player 2) Score: " + player2.getScore());
				System.out.println();
				System.out.println("********DRAW********");
			}
			
		}
	
	}
		
		
	





