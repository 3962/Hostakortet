public class Game {  // game classen som innehåller spelare fuskare och kortlek
    private Deck deck;
    private Player player1;
    private Cheater cheater;

    public Game(){
        deck = new Deck();
        player1 = new Player(deck);
        cheater = new Cheater(deck);
    }

    public void start(){  // metoden som kör spelet
        Card card1 = player1.drawCard();
        Card card2 = cheater.drawCard();

        System.out.println("player 1 drew " + card1.getNumber());
        System.out.println("cheater drew " + card2.getNumber());

        if (card1.getNumber() > card2.getNumber()){
        System.out.println("player 1 wins");
        }
        else if (card1.getNumber() < card2.getNumber()){
            System.out.println("cheater wins");
        }
        else {
            System.out.println("its a draw");
        }
    }
}
