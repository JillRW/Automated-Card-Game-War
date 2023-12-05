"#Created an automated card game of 'War'


Using OOP and methods, I created an automated card game that creates and displays a new deck, deals out 26 cards to each of the 2 players, and displays each player's card as it is flipped. Other features I liked: each player's score is updated and displayed after each round, along with a message showing which player won the round (or just "DRAW" if it was a draw). At the end of the game, the winning player's name is displayed, unless it was a tie, in which case the message would show "DRAW". 

Code snippet of the main class:

public static void main(String[] args) {
		System.out.println("*****NEW DECK*****");
		System.out.println();
		Deck deck = new Deck();
		System.out.println();
		
		//deck.describe();
	
		System.out.println("*****SHUFFLED DECK*****");
		System.out.println();
		Player player1 = new Player("Alice");
		Player player2 = new Player("Carol");
		deck.shuffle();
		//deck.describe();
		for (Card card: deck.cards) {				
			card.describe();
		}
		
		
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
			 


