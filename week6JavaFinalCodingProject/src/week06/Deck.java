package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	

	public Deck(){
		System.out.println("****DECK OF CARDS****");
		System.out.println();
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for(String suit : suits) {
			int count = 2; // still not sure how this works. How does it add a new count to each 'aCard'? if it is outside the number loop?
			for(String number : numbers) {
				String aCard = number + " of " + suit;
				
				
				Card card = new Card( aCard, count);
				this.cards.add(card);
				count ++;
				
			card.describe();	// why not print out cards?

}
		}
	}

	public List<Card> getCards() { // did I need getters and setters for this?
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

    public void shuffle() {
	    Collections.shuffle(this.cards);
    }

     public Card draw() {
	    Card card = this.cards.remove(0);
	    return card;
}
}
