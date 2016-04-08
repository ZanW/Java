package chapter7_7$5;

public class Card {
	
	private String face;
	private String suit;
	
	public Card(String cardFace, String cardSuit) {
		
		face = cardFace;
		suit = cardSuit;
		
	}
	
	public String toString() {
		
		return face + " of " + suit;
	}
	
}