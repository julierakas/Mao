import java.util.Random;
import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards;

	Deck() {
		cards = new ArrayList<Card>();
		int index_1, index_2;
		Random generator = new Random();
		Card temp;

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
		 j = generator.nextInt(size);
		 k = generator.nextInt(size);

		 temp = cards.get(k);
		 cards.set(k, cards.get(j));
		 cards.set(j, temp);
		}
	}
}
