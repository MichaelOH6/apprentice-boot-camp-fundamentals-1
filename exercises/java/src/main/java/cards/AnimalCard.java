package cards;

public class AnimalCard implements Card {

    private final Animal animal;

    AnimalCard(Animal animal) {

        this.animal = animal;
    }

//    boolean snap( AnimalCard otherCard ){
//        return otherCard != null && this.animal.equals(otherCard.animal);
//    }

    @Override
    public String toString() {
        return animal.toString();
    }



    public boolean snap(Card otherCard) {
        AnimalCard cardAnimal = (AnimalCard) otherCard;


        return cardAnimal != null && this.animal.equals(cardAnimal.animal);

    }

}
