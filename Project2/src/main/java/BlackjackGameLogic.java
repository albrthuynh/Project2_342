import java.util.ArrayList;

public class BlackjackGameLogic {

    // given two hands this should return either player or dealer or push depending on who wins
    // push = draw ?
    public String whoWon(ArrayList<Card> playerHand1, ArrayList<Card> dealerHand) {
        int playerHandTotal = handTotal(playerHand1);
        int bankerHandTotal = handTotal(dealerHand);

        if (playerHandTotal < bankerHandTotal) {
            return "dealer";
        }
        else if (playerHandTotal > bankerHandTotal) {
            return "player";
        }

        return "push";
    }

    // this should return the total value of all cards in the hand
    public int handTotal(ArrayList<Card> hand) {
        int total = 0;

        for (int i = 0; i < hand.size(); i++) {
            total += hand.get(i).getValue();
        }

        return total;
    }

    // this method should return true if the dealer should draw another card (if the value is 16 or less)
    public boolean evaluateBankerDraw(ArrayList<Card> hand) {
        int bankerHandTotal = handTotal(hand);

        return bankerHandTotal <= 16;
    }

}
