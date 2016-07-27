package Main;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> cards;

	Hand(Deck d, int size) {
		cards = new ArrayList<Card>();
		for (int x=0; x < size; x++)
			add(d.drawFromDeck());
	}

	public void displayAll() {
		for (Card card : cards)
      System.out.println(card);
	}

  public ArrayList<Card> play(ArrayList<Card> toPlay){
    ArrayList<Card> played = new ArrayList<Card>();
    for (Card card : toPlay){
      played.add(card);
      cards.remove(card);
    }
		return played;
  }

	public void add(Card card) {
		cards.add(card);
	}

	public Card remove(int card) {
		return cards.remove(card);
	}

	public void remove(Card card) {
		cards.remove(card);
	}

	public ArrayList<Card> getHand(){
		return cards;
	}
}
