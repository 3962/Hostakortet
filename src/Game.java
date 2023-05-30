public class Game {
    private Deck deck;
    private Player player;
    private Cheater cheater;

    public Game(){
        deck = new Deck();
        player1 = new Player(deck);
        cheater = new Cheater(deck);
    }

    public void start(){
        Card card1 = player1.drawCard();
        Card card2 = cheater.drawCard();

        System.out.println("player 1 drew" + card1.getNumber());
        System.out.println("cheater drew" + card2.getNumber());

        if (card1.getNumber() > card2.getNumber()){

        }
    }
}
