public class Card {
    private SuitType suit;
    private CardRank rank;
    public Card (SuitType suit ,CardRank rank){
        this.rank= rank;
        this.suit=suit;
    }

    public SuitType getSuit() {
        return suit;
    }

    public CardRank getCardRank() {
        return rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }
    public String toString(){
        return String.format("%s of %s", this.rank.toString(),this.suit.toString());
    }
}
