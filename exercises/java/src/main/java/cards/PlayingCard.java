package cards;

public class PlayingCard implements Card {
    Suit suit;
    int faceValue;

    public PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit.getSuit();
    }

    public int getFaceValue() {
        return faceValue;
    }





    public boolean snap(Card otherCard) {

        PlayingCard cardPlaying = (PlayingCard) otherCard;

        return cardPlaying != null && this.faceValue == (cardPlaying.faceValue);

//        public boolean snap(Card card) {


        }
    }

