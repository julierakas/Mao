package Main;
import java.util.Random;
import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards;
	Random generator ;
	
	Deck() {
		cards = new ArrayList<Card>();
		generator = new Random();

		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 13; b++) {
				cards.add(new Card(a, b));
			}
		}
	}

	public Card drawFromDeck() {
		return cards.remove(0);
	}

	public int getTotalCards() {
		return cards.size();
	}

	public void shuffle(){
		int size = cards.size() - 1;
		for (int i=0; i<100; i++) {
			int j = generator.nextInt(size);
			int k = generator.nextInt(size);
			
			Card temp = cards.get(k);
			cards.set(k, cards.get(j));
			cards.set(j, temp);
		}
	}
}
