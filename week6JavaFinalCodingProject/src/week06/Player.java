package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name){
		this.name = name;
		this.score = 0;  // what is this used for?
		this.hand = new ArrayList<Card>();

	}
	public void describe() {
		System.out.println(this.name + "'s score is" + this.score);
		System.out.println("Hand: " + this.hand);
		for (Card card: hand) {
			card.describe();
		}
	}
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	public void draw(Deck deck) { // Is this correct?
		
		hand.add(deck.draw());
		
	}
public void incrementScore() {
	score ++;
}

// do I need these getters and setters? Still confused on these- yes
public List<Card> getHand() {
	return hand;
}
public void setHand(List<Card> hand) {
	this.hand = hand;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
