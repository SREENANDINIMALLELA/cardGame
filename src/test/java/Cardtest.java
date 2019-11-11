import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Cardtest {
    Card card;
    @Before
    public void before() {
        card = new Card(SuitType.HEARTS,CardRank.ACE);
    }

    @Test
    public void  canGetSuit() {
        assertEquals(SuitType.HEARTS,card.getSuit());
    }
    @Test
    public void  canGetRank() {
        assertEquals(CardRank.ACE,card.getCardRank());
    }

//    @Test
//    public void  suitCanBeMispelled() {
//        card = new Card("Heeerts");
//        assertEquals("Heeerts",card.getSuit());
//    }


    @Test
    public void queenHasValue() {
        card = new Card(SuitType.HEARTS,CardRank.QUEEN);
        assertEquals(10,card.getValueFromEnum());
    }

}

