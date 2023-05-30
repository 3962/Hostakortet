public class Player { //class för spelare som kan dra kort ur kortleken
    protected Deck deck;

    public Player(Deck deck) { //constructor
        this.deck = deck;
    }

    public Card drawCard(){ // metod som drar kort från korleken
        return deck.drawCard();
    }
}
