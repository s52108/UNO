public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public void push(Card newCard) {
        this.cards[++this.counter] = newCard;
    }

    public Card pop() {
        return this.cards[this.counter--];
    }
}