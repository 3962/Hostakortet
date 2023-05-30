public class Cheater extends Player { // subclass till spelare, skapar en fuskare som kan dra 2 kort och välja
    public Cheater(Deck deck){
        super(deck);
    }

    @Override
    public Card drawCard(){ // drar 2 kort och väljer det högsta
        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();

        if (card1.getNumber() > card2.getNumber()){
            return card1;
            }
        else { return card2;}
    }
}
