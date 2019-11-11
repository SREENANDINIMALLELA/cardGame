import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    Deck deck;
    String player1name ="Sree";
    String player2name="Nann";


    @Before
    public void before() {

        deck = new Deck();
    }
    @Test
    public void NoOfCards() {
        deck.addCards(CardRank.values(),SuitType.values());
        assertEquals(52, deck.getNocards());
    }

    @Test
    public void pickCard() {
        deck.addCards(CardRank.values(),SuitType.values());
        Card player1 = deck.dealCard();
        assertEquals(51,deck.getNocards());
    }



    @Test
    public void ShuffulCards(){
        deck.addCards(CardRank.values(),SuitType.values());

        Card player1 = deck.dealCard();
        System.out.println(player1.toString());
        Card player2 = deck.dealCard();
        System.out.println(player2.toString());
        System.out.println(deck.checkWhoWins(player1.getValueFromEnum(),player2.getValueFromEnum(),player1name,player2name));

    }
    @Test
    public void playerCards(){
        deck.addCards(CardRank.values(),SuitType.values());
        Card player1 = deck.dealCard();
        Card player2 = deck.dealCard();
        assertEquals(2,deck.getPlayercards());

    }

}
