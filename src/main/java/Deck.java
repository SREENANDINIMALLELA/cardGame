import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    private Card card;
    private ArrayList<Card>pickedCards;
    public Deck() {
        this.cards = new ArrayList<Card>();
        this.pickedCards=new ArrayList<Card>();
    }

    public int getNocards() {
        return cards.size();
    }


    public void addCards(CardRank[] rank, SuitType[] type) {
        for (int i=0 ;i < rank.length;i++){
           for(int j=0 ; j < type.length;j++){
               card = new Card(type[j], rank[i]);
                cards.add(card);
           }
        }
    }


    public void ShuffelCards() {
        Collections.shuffle(cards);
    }



    public  Card dealCard(){

        Card pickedCard ;

        ShuffelCards();
        pickedCard=cards.get(0);
        pickedCards.add(pickedCard);
        cards.remove(0);
       return pickedCard;
    }
    public String checkWhoWins(int player1Score ,int player2Score, String player1, String player2){
        String winner;
        if (player1Score > player2Score) {
           winner = player1 + "  Won the Game";
        }else if(player1Score < player2Score ){
            winner = player2 +"   Won the Game";
        }else {
            winner= "Draw";
        }
        return winner;
    }

    public int getPlayercards() {
        return pickedCards.size();
    }


//    public String  input(boolean preference ){
//        if (preference == true){
//
//
//        }
//
//    }
}
