package cards;

import java.util.Arrays;
import java.util.Collections;

public class PlayingCardDeck extends Deck {


    public PlayingCardDeck() {
        for (Suit suit:Suit.values()) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards.add(new PlayingCard(suit, faceValue));
            }
        }
    }



    public String[] getCards() {
        String[] result = new String[cards.size()];
        int cardNumber = 0;
        for (Card card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    @Override
    public Card deal() {
        return cards.remove(0);
    }

    public static void main(String[] args) {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        String[] deckInOrder = playingCardDeck.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }
}