public class Cheater extends Player {
    public Cheater(Deck deck){
        super(deck);
    }

    @Override
    public Card drawCard(){
        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();
        return card1.getNumber() > card2.getNumber() ? card1 : card2;
    }
}
