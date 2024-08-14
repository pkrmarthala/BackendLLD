package Interfaces;

public interface Runner {
    // Interfaces can have data members as well. But these data members will be public, static, and final.
    int x = 5; // This is a constant. You cannot change the value.

    // Every function is public in interfaces. You cannot have any other access modifier here.
    void run();

    // Return types can be anything for the functions.
    // Interfaces can have default methods. We need to define these methods in the interface itself.

    default void walk() {
        System.out.println("Walking");
    }
}