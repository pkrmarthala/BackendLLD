package Generics;

// You cannot use the primitive data types in Generics. You;ll need to use the wrapper classes.
// Since primitive data types do not inherit from the Object class.

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>();

        Pair<Integer, String> p1 = new Pair<Integer, String>();
        // no need to specifically mention the data types on the RHS from Java v7

        p.setFirst(1);
        p1.setFirst(2);

        Integer x = p.getFirst();
        Integer y = p1.getFirst();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Tommy"));
        dogs.add(new Dog("Jimmy"));
        dogs.add(new Dog("Snoopy"));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Jim"));
        animals.add(new Dog("Snoop"));

        AnimalUtility.printAnimalNames(animals);
        // AnimalUtility.printAnimalNames(dogs);
    }
}
