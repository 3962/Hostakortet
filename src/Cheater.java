public class Cheater extends Player {
    public Cheater(Deck deck){
        super(deck);
    }

    @Override
    public Card drawCard(){
        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();

    }
}
