public class Card {
    private String suit;
    private int value;

    Card(String theSuit, int theValue) {
        this.suit = theSuit;
        this.value = theValue;
    }

    public int getValue() {
        return this.value;
    }

    public String getSuit(){
        return this.suit;
    }

    public void setValue(int val){
        this.value = val;
    }


}
