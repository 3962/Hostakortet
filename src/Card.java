public class Card { // class som skapar ett kort med ett nummer
    private int number; //nummer på kort

    public Card(int number){
    this.number = number;
    }

    public int getNumber() { // metod som ger numret på kortet
        return number;
    }
}
