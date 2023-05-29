public class Player {
    protected Deck deck; //kortleken

    public Player(Deck deck) {
        this.deck = deck;
    }

    public Card drawCard(){
        return deck.drawCard(); //dra ett kort från kortleken
    }
}
