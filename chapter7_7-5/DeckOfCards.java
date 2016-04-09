package chapter7_7$5;

import java.util.Random;

public class DeckOfCards {
	
	private String[] face = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	private String[] suit = {"Hearts","Spades","Diamonds","Clubs"};
//	private final int numberOfCards = 52; 
	private String[] deckCards = new String[52];
	private int currentCard;
	private Random randomNumbers = new Random();
	
	
	public void creatCards() {
	// add faces and suits to 52 cards
	for (int i = 0; i < deckCards.length; i++) {
		
	Card createCard = new Card(face[i%13], suit[i/13]);
	deckCards[i] = createCard.toString();
	
	System.out.printf("%s / ", deckCards[i]);
	  }
	System.out.println();
	
	
	}
	
	//shuffle the deck of cards
	public void shuffleCards () {
		
		String temp = null;
		
		for (int i = 0; i < 52; i++) {

		int index_deckCards = randomNumbers.nextInt(52);
		// swap two cards
		temp = deckCards[i];
		deckCards[i] = deckCards[index_deckCards];
		deckCards[index_deckCards] = temp;
			
		}
		
	}
		
	public String dealing() {
		
		if (currentCard > 52 && currentCard < 0) {
			return currentCard +" cards dealt done";
		
		
		} else { 
			
//			System.out.println("the currentCard is " + currentCard);
//			System.out.println();
			
			    int index = currentCard;
			return  deckCards[currentCard++]+"/"+deckCards[index];// check operation sequence of currentCards++
				                                                  //deckcard[currentCards] executes first, than increment currentCards
		}
	}
		
}
	