import animals.Animal;
import animals.Chicken;
import animals.Tiger;
import com.sun.org.apache.xpath.internal.operations.Or;
import edible.IEdible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class Main {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//        Tiger tiger1 = new Tiger();
//        Chicken chicken1 = new Chicken();
//
//        for (Animal animal : animals
//        ) {
//            System.out.println(animal.makeSound());
//            if(animal instanceof Chicken) {
//                Chicken edible = (Chicken) animal;
//                System.out.println(((Chicken) animal).howtoEat());
//            }
//        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }


    }
}
