package Interfaces;

public class Dog implements Runner {
    public void run() {
        walk();
        System.out.println("Dog running");
    }
}

// Whenever we are inheriting, the child class can only have a less restricted access modifier.