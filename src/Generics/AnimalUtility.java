package Generics;

import java.util.List;

public class AnimalUtility {
    // extends: anything Animal or under it
    // extends keyword for both interface & class. implements will not work
    public static <T extends Animal> void printAnimalNames(List<T> animals) {
        // animals.add(new Dog(" ")); This will be allowed until we use the Generic's extends option
        for (Animal animal : animals) {
            System.out.println(animal.name);
        }
        animals.add((T) new Dog(" "));
    }
}
