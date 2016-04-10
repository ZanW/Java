package chapter7_7$5;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		
		DeckOfCards test = new DeckOfCards();
		
		test.creatCards();
		test.shuffleCards();
		
		for (int i = 1; i <= 52; i++) {
			
			System.out.printf("%-40s", test.dealing());
			
			if (i%4 == 0) {
				System.out.println();
			} 
			
		

			
	}
		
	}
	
}
