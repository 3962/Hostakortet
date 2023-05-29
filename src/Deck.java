import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private List<Card> deck;

    public Deck(){
        deck = new arrayList<>();
        for (int i = 1; i <= 10; i++){
            deck.add(new Card(i));
        }
        shuffleDeck();
    }
public Card drawCard() {
    return deck.remove(deck.size() - 1);
}
private void shuffleDeck(){
        Collection.shuffle(deck);
    }
}

