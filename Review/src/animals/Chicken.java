package animals;

import edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: Cluck-Cluck";
    }

    @Override
    public String howtoEat() {
        return "Can be fried";
    }
}
