package cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Deck {
     List<Card> cards = new ArrayList<>();

    public abstract Card deal();

    public abstract String[] getCards();

    public void shuffle(){
        Collections.shuffle(cards);

    }
}
