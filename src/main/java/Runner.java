import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.addCards(CardRank.values(),SuitType.values());
        Scanner myObj = new Scanner(System.in);
        String player1;
        String player2;
        String preference ;
        String preference2 ;
        Card player1Card = null;
        Card player2Card = null;
        System.out.println("Enter player1 name ");
        String playerCap1 = myObj.nextLine();
        String s1 = playerCap1.substring(0, 1).toUpperCase();
        player1 = s1 + playerCap1.substring(1);

        System.out.println("Enter player2 name");
        String playerCap2 = myObj.nextLine();

        String s2 = playerCap2.substring(0, 1).toUpperCase();
        player2 = s2 + playerCap2.substring(1);

        System.out.println(player1+" Type yes to pick a card ");
        preference=myObj.nextLine();
        if (preference.equals("yes"))
        {
            player1Card = deck.dealCard();
            System.out.println("                              ");
            System.out.println(player1Card.toString());
            System.out.println("                              ");
            System.out.println(player2+"  Type yes to pick a card ");
            preference2=myObj.nextLine();
            if (preference2.equals("yes"))
            {
                player2Card = deck.dealCard();
                System.out.println("                              ");
                System.out.println(player2Card.toString());
            }
            else{
                System.out.println("You entered a  wrong input");
            }
            System.out.println("                              ");
            System.out.println("                              ");
            System.out.println("===============================================");
            System.out.println(deck.checkWhoWins(player1Card.getValueFromEnum(),player2Card.getValueFromEnum(),player1,player2));
            System.out.println("===============================================");
        }
        else{
            System.out.println("You entered a  wrong input ,Please run the page to play ");
        }

    }
}
