import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck { // class som skapar kortleken
    private List<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            cards.add(new Card(i));
        }
        shuffleDeck();
    }
public Card drawCard() { // metod som drar och tar bort ett kort från kortleken
    return cards.remove(cards.size() - 1);
}
private void shuffleDeck(){
        Collections.shuffle(cards);
    } // metod som blandar kortleken
}

