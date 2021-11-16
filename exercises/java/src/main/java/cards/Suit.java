package cards;

public class Suit {
    private String name;

    public Suit(int suit) {
        switch (suit) {
            case 0:
                name = "clubs";
                break;
            case 1:
                name = "diamonds";
                break;
            case 2:
                name = "hearts";
                break;
            case 3:
                name = "spades";
                break;
            default:
                throw new IllegalArgumentException("Something went wrong " + suit + "is not a valid suitName!");
        }
    }

    public String getSuit() {
        return name;

    }


}
