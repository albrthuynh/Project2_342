import java.util.ArrayList;

public class BlackjackDealer {

    public ArrayList<Card> deck;

    // should generate 52 cards, one for each 13 faces and 4 suits
    public void generateDeck () {
        String[] suits = {"heart", "diamond", "spade", "club"};
        int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Card newCard = new Card(suits[i], faces[j]);
                this.deck.add(newCard);
            }
        }

    }

    // this will return an ArrayList of two cards and leave the remainder of the deck able to be drawn later
//    public ArrayList<Card> dealHand() {
//
//    }

    // this will return the next card on top of the deck
    public Card drawOne () {
        Card newCard = deck.get(0);

        return newCard;
    }

    // this will return all 52 cards to the deck and shuffle their order
    public void shuffleDeck() {

    }

    // this will return the number of cards left in the deck (when you call shuffleDeck() it should be 52)
    public int deckSize () {
        return 0;
    }




}
