public class Deck {
    //attributes
    Card[] deck = new Card[5];

    //constructor
public Deck(){
    for (int i = 0; i < deck.length; i++){
    deck[i] = new Card((i+1));
    }
}
}
