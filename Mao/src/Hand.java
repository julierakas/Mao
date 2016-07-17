public class Hand {
	private ArrayList<Card> cards;

	Hand(Deck d, size) {
		cards = new new ArrayList<Card>();
		for (int x=0; x < size; x++)
			add(d.drawFromDeck());
	}

	public void displayAll() {
		for (Card card : toPlay)
      System.out.println(card);
	}

  public ArrayList<Card> play(ArrayList<Card> toPlay){
    ArrayList<Card> played;
    for (Card card : toPlay)
      played.add(cards.remove(card));
		return played;
  }

	public void add(Card card) {
		cards.add(card);
	}

	public Card remove(int card) {
		return cards.remove(card);
	}

	public Card remove(Card card) {
		return cards.remove(card);
	}

	public ArrayList<Card> getHand(){
		return cards;
	}
}
