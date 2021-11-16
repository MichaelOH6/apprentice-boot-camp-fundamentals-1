package cards;

public class PlayingCardDeck {

    PlayingCard[] deck;


    public PlayingCardDeck() {
        deck = new PlayingCard[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                Suit items = new Suit(suit);
                PlayingCard card = new PlayingCard(items, faceValue);
                deck[suit * 13 + faceValue] = card;
            }
        }
    }
}
